package com.atguigu.springboot.controller;

import com.atguigu.springboot.bean.Carnumber;
import com.atguigu.springboot.bean.Facedata;
import com.atguigu.springboot.bean.PInfo;
import com.atguigu.springboot.bean.TUeInfo;
import com.atguigu.springboot.service.FacedataService;
import com.atguigu.springboot.service.PInfoService;
import com.atguigu.springboot.service.TUeInfoService;
import com.atguigu.springboot.utils.TestInteface;
import com.sun.jna.Native;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class CodePersonController {

    @Autowired
    TUeInfoService tUeInfoService;
    @Autowired
    PInfoService pInfoService;
    @Autowired
    FacedataService faceDataService;

    @GetMapping("/number")
    public String list(){
        return "code_people/list";
    }

    @PostMapping("/pNumber")
    public String uplaod(HttpServletRequest req, @RequestParam("file") String number, Model m){
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_core2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_imgproc2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_highgui2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/THFeature.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/THFaceImage.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/YukaFaceHelper.dll");
        try {
            TestInteface INSTANCE = (TestInteface) Native.loadLibrary("YukaFaceHelper", TestInteface.class);
            System.out.println(INSTANCE.Init());

            ArrayList<String> successList = new ArrayList<>();//时间相同 地点相同的抓拍照片的数列
            ArrayList<String> successList_all = new ArrayList<>();//全景照地址
//            List<PInfo> pInfos = pInfoService.getAll();//找出所有人
            List<Facedata> faceDatas = faceDataService.getAll();
            List<Facedata> successPInfos = new ArrayList<Facedata>();//过关的人
            List<TUeInfo> tUeInfos = tUeInfoService.getByNumber(number);//找出所有对应的扫码的纪录
            List<TUeInfo> successtUeInfos = new ArrayList<TUeInfo>();

            for (  TUeInfo tUeInfo:tUeInfos
            ) {
                for (Facedata p: faceDatas
                ) {
                    Calendar c1 = Calendar.getInstance();
                    Calendar c2 = Calendar.getInstance();
                    Calendar c3 = Calendar.getInstance();

                    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    ParsePosition pos = new ParsePosition(0);
                    SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    ParsePosition pos2 = new ParsePosition(0);
                    String strDate = p.getStarttime();
                    String tuTime = tUeInfo.getCaptureTime();
                    Date strtodate = formatter.parse(strDate, pos);
                    Date strtodate2 = formatter2.parse(tuTime, pos2);
                    c1.setTime(strtodate);//要判断的日期
                    c2.setTime(strtodate2);//初始日期
                    c3.setTime(strtodate2);//也给初始日期 把分钟加五
                    c3.add(Calendar.MINUTE, 5);
                    c2.add(Calendar.MINUTE, -5);//减去五分钟

                    if (c1.after(c2) && c1.before(c3) && Integer.valueOf(tUeInfo.getLatype())==Integer.valueOf(p.getCameraip()) ) {

                        successPInfos.add(p);
//                        successList.add(p.getpPicturelocal().replace("C:\\picturebase\\","http://localhost:8083/image/"));
                        successtUeInfos.add(tUeInfo);

                    } else {

                    }
                }
            }
            List<Facedata> finalPInfos = new ArrayList<Facedata>();//过关的人
            List<Integer> counts = new ArrayList<Integer>();//过关的人的统计数据
            //先找出有几个独立的人
            //先用第一个人来人脸比对，找出和他不一样的人，把第一个人和他们放在一个list里，再从第二个开始和后面的对比 ×
            //第一个人和所有的人比对 如果和比自己小的比对成功，进行下一轮，和自己大的比对用来计数
            int counta = 0;
            for (int i=0 ; i<=successPInfos.size()-1 ; i++) {
//                FileInputStream in1 = new FileInputStream(
//                        new File(successPInfos.get(i).getpPicturelocal()));
//                byte[] image1 = new byte[in1.available()];
//                in1.read(image1, 0,image1.length);
//                in1.close();
                byte[] image1 = successPInfos.get(i).getImage();
                //count初始化
                counta=0;

                for (int j=0; j<=successPInfos.size()-1; j++) {
//                    FileInputStream in2 = new FileInputStream(
//                            new File(successPInfos.get(j).getpPicturelocal()));
//                    byte[] image2 = new byte[in2.available()];
//                    in2.read(image2, 0, image2.length);
//                    in2.close();

                    byte [] image2 = successPInfos.get(j).getImage();
                    double consequence = INSTANCE.YK_Compare_JAVA(
                            image1, image1.length,
                            image2, image2.length);

                    System.out.println("i："+i+"j:"+j);
                    if (consequence >= 0.5){
                        if (i>j){
                            System.out.println("退出循环");
                            break;
                        }else {
                            counta++;
                        }
                    }

                    if (j == successPInfos.size()-1){
                        finalPInfos.add(successPInfos.get(i));
                        counts.add(counta);
                   }
                }
            }

            System.out.println(finalPInfos.size());
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

            for ( Facedata p:finalPInfos
                 ) {

                byte[] buffer = p.getImage();
                byte[] buffer_all = p.getFullimage();
                OutputStream os;
                OutputStream os2;
                long file2 = System.currentTimeMillis();
                File directory = new File("");//参数为空
                String courseFile = directory.getCanonicalPath();

                String p_url_save = courseFile+"\\src\\main\\resources\\static\\img\\"+file2+"cp.jpg";
                String p_all_url_save = courseFile+"\\src\\main\\resources\\static\\img\\"+file2+"cp_all.jpg";
                os = new FileOutputStream(p_url_save);
                os2 = new FileOutputStream(p_all_url_save);
                String p_url = "http://localhost:8083/img/"+file2+".jpg";
                String p_all_url = "http://localhost:8083/img/"+file2+"_all.jpg";
                os.write(buffer, 0, buffer.length);
                os2.write(buffer_all, 0, buffer_all.length);
                os.flush();
                os.close();
                os2.flush();
                os2.close();


                successList.add(p_url);
                successList_all.add(p_all_url);
            }

            int count = tUeInfos.size(); //count表示该号码被扫描的次数
            m.addAttribute("count",count);
            m.addAttribute("success",successList);
            m.addAttribute("successall",successList_all);
            m.addAttribute("finalPInfos",finalPInfos);
            m.addAttribute("counts",counts);

        }catch (FileNotFoundException e) {
            e.printStackTrace();
            return "上传失败," + e.getMessage();
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败," + e.getMessage();
        }
        return "code_people/list";
    }
}

