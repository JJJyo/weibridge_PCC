package com.atguigu.springboot.controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.atguigu.springboot.bean.Facedata;
import com.atguigu.springboot.bean.PInfo;
import com.atguigu.springboot.bean.TUeInfo;

import com.atguigu.springboot.service.FacedataService;
import com.atguigu.springboot.service.PInfoService;
import com.atguigu.springboot.service.TUeInfoService;
import com.atguigu.springboot.utils.TestInteface;
import com.sun.corba.se.pept.transport.ListenerThread;
import com.sun.deploy.pings.Pings;
import com.sun.jna.Native;
import org.omg.CORBA.IMP_LIMIT;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Null;
import java.io.*;
import java.lang.reflect.Array;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.jar.JarEntry;

import static com.atguigu.springboot.utils.sort.arraySort;

@Controller
public class PersonCodeController {
    int fazhi = 5;
    @Autowired
    PInfoService pInfoService;
    @Autowired
    TUeInfoService tUeInfoService;
    @Autowired
    FacedataService faceDataService;


    @GetMapping("/people")
    public String list(){
        return "person_code/list";
    }
    @PostMapping("/fileUpload") // 等价于 @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uplaod(HttpServletRequest req, @RequestParam("file") MultipartFile file, Model m) {
        //1. 接受上传的文件  @RequestParam("file") MultipartFile file
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_core2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_imgproc2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_highgui2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/THFeature.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/THFaceImage.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/YukaFaceHelper.dll");
        try {
            //2.根据时间戳创建新的文件名，这样即便是第二次上传相同名称的文件，也不会把第一次的文件覆盖了
            String fileName = System.currentTimeMillis() + file.getOriginalFilename();
            //3.通过req.getServletContext().getRealPath("") 获取当前项目的真实路径，然后拼接前面的文件名
            String destFileName = req.getServletContext().getRealPath("") + "uploaded" + File.separator + fileName;
            //4.第一次运行的时候，这个文件所在的目录往往是不存在的，这里需要创建一下目录（创建到了webapp下uploaded文件夹下）
            File destFile = new File(destFileName);
            destFile.getParentFile().mkdirs();
            //5.把浏览器上传的文件复制到希望的位置
            file.transferTo(destFile);

            TestInteface INSTANCE = (TestInteface) Native.loadLibrary("YukaFaceHelper", TestInteface.class);
            FileInputStream in = new FileInputStream(
                    destFile);
            byte[] image = new byte[in.available()];
            in.read(image, 0, image.length);
            in.close();

            //in是上传的照片现在把in2改成从数据库中读出的照片。
            List<TUeInfo> tUeInfos = tUeInfoService.getAll();
            List<PInfo> pInfos = pInfoService.getAll();                     //pinfo是所有人像对象
            List<Facedata> faceDatas = faceDataService.getAll();            //facedata，时间

            System.out.println("Init:"+
                    INSTANCE.Init()
            );

            ArrayList<Long> successList = new ArrayList<Long>();
            List<TUeInfo> result = new ArrayList<TUeInfo>();
            List<String> statistics = new ArrayList<String>() ;

            //相似度最高的图片的索引
            Double i=0.0;
            String file2= "";

            //循环对比
            for (Facedata p : faceDatas){                                         //p是一个人像对象

                System.out.println(p.getStarttime());
                //in是上传的照片现在把in2改成从数据库中读出的照片。
                byte[] image2 = p.getImage();
                double consequence = INSTANCE.YK_Compare_JAVA(
                        image, image.length,
                        image2, image2.length);
                //输出对比度。
                System.out.println(consequence);
                //相似度最高的照片的显示
                i=consequence;
                //将对比成功的plocal和ptime放到successlist里
                if (consequence >= 0.5 ){
                    System.out.println(p.getId()+"号人脸比对通过");
                    //对比成功的人脸数据和扫码仪器对比,将5分钟内的数据加入successList里面
                    for (TUeInfo tu : tUeInfos){
                        Calendar c1 = Calendar.getInstance();
                        Calendar c2 = Calendar.getInstance();
                        Calendar c3 = Calendar.getInstance();

                        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        ParsePosition pos = new ParsePosition(0);
                        SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        ParsePosition pos2 = new ParsePosition(0);

                        String strDate = p.getStarttime().substring(0,p.getStarttime().length()-2);
                        String tuTime = tu.getCaptureTime();

                        Date strtodate = formatter.parse(strDate, pos);
                        Date strtodate2 = formatter2.parse(tuTime, pos2);
                        c1.setTime(strtodate);//要判断的日期
                        c2.setTime(strtodate2);//初始日期
                        c3.setTime(strtodate2);//也给初始日期 把分钟加五
                        c3.add(Calendar.MINUTE, 5);
                        c2.add(Calendar.MINUTE, -5);//减去五分钟

                        if (c1.after(c2) && c1.before(c3)) {
                            if ( Integer.valueOf(tu.getLatype())==Integer.valueOf(p.getCameraip()) ){
                                successList.add(tu.getId());
                            }
                        }
                    }
                }
             }
            for(int j=0;j<successList.size();j++){

                System.out.println(tUeInfoService.getById(successList.get(j)).getCaptureTime());
                result.add(tUeInfoService.getById(successList.get(j)));
                statistics.add(tUeInfoService.getById(successList.get(j)).getImsi());
            }

            String[] array = new String[statistics.size()];
            statistics.toArray(array);

            List<Map.Entry<String, Integer>>relist;
            //如果号码结果list数量大于5取前五，如果没有大于5有多少取多少
            if (array.length>=5){
                List<Map.Entry<String, Integer>> list =arraySort(array) ;
                relist = list.subList(0,5);
            }else {
                List<Map.Entry<String, Integer>> list =arraySort(array) ;
                relist = list.subList(0,array.length);
            }

            System.out.println(statistics.size());
            m.addAttribute("result",result);
            m.addAttribute("list",relist);
            m.addAttribute("filename",file2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "上传失败," + e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败," + e.getMessage();
        }
        return "person_code/list";
    }

    @PostMapping("/test")
    public String test() throws IOException {

        List<Facedata> facedatas = faceDataService.getAll();
        List<PInfo> pInfos = pInfoService.getAll();
        List<TUeInfo> t = tUeInfoService.getAll();
//        for (TUeInfo tt: t
//             ) {
//           System.out.println(tt.getCaptureTime().length());
//           System.out.println("11");
//        }
        Facedata p = facedatas.get(1);
        byte[] buffer = p.getFullimage();
        OutputStream os = new FileOutputStream("C:\\picturebase\\4445.jpg");
        os.write(buffer, 0, buffer.length);
        os.flush();os.close();

        return "person_code/list";
    }

}

