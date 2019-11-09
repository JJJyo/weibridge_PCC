package com.atguigu.springboot.controller;

import com.atguigu.springboot.service.PInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PersonCodeController {

    @Autowired
    PInfoService pInfoService;


    @GetMapping("/people")
    public String list(){
        return "person_code/list";
    }

    @PostMapping("/fileUpload") // 等价于 @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uplaod(HttpServletRequest req, @RequestParam("file") MultipartFile file, Model m) {//1. 接受上传的文件  @RequestParam("file") MultipartFile file
//        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_core2413.dll");
//        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_imgproc2413.dll");
//        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_highgui2413.dll");
//        System.load("C:/Users/82038/Desktop/FaceSDK_x86/THFeature.dll");
//        System.load("C:/Users/82038/Desktop/FaceSDK_x86/THFaceImage.dll");
//        System.load("C:/Users/82038/Desktop/FaceSDK_x86/YukaFaceHelper.dll");
//        try {
//            //2.根据时间戳创建新的文件名，这样即便是第二次上传相同名称的文件，也不会把第一次的文件覆盖了
//            String fileName = System.currentTimeMillis() + file.getOriginalFilename();
//            //3.通过req.getServletContext().getRealPath("") 获取当前项目的真实路径，然后拼接前面的文件名
//            String destFileName = req.getServletContext().getRealPath("") + "uploaded" + File.separator + fileName;
//            //4.第一次运行的时候，这个文件所在的目录往往是不存在的，这里需要创建一下目录（创建到了webapp下uploaded文件夹下）
//            File destFile = new File(destFileName);
//            destFile.getParentFile().mkdirs();
//            //5.把浏览器上传的文件复制到希望的位置
//            file.transferTo(destFile);
//            TestInteface INSTANCE = (TestInteface) Native.loadLibrary("YukaFaceHelper", TestInteface.class);
//            FileInputStream in = new FileInputStream(
//                    destFile);
//            FileInputStream in2 = new FileInputStream(
//                    new  File("F:\\02、尚硅谷SpringBoot视频\\源码、资料、课件\\代码\\weibridge_PCC\\src\\main\\resources\\templates\\img\\4.JPG"));
//            byte[] image = new byte[in.available()];
//            byte[] image2 = new byte[in2.available()];
//            in.read(image, 0, image.length);
//            in.close();
//            in2.read(image2, 0,image2.length);
//            in2.close();
//
//            //YKCompare方法测试
//            System.out.println("Init:"+
//                    INSTANCE.Init()
//            );
//            INSTANCE.YK_Compare_JAVA(
//                    image, image.length,
//                    image2, image2.length);
////            //6.把文件名放在model里，以便后续显示用
////            m.addAttribute("fileName", fileName);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            return "上传失败," + e.getMessage();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "上传失败," + e.getMessage();
//        }

//        List<PInfo> people = pInfoService.getAll();
        return "redirect:person_code/list";
    }

//    @GetMapping("/people/{id}")
//    public PInfo pInfoById(@PathVariable("id") Integer id){
//        return pInfoService.getById(id);
//    }
}
