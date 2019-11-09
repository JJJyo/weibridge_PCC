package com.atguigu.springboot.utils;

import com.sun.jna.Native;

import java.io.File;
import java.io.FileInputStream;


public class imgReader {
//    static {
//        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);//很重要
//    }

    public void YK_Compare(String path1, String path2) {

        /**
         * 加载dll
         */


//        System.load("opencv_core2413.dll");
//        System.load("opencv_imgproc2413.dll");
//        System.load("opencv_highgui2413.dll");
//        System.load("THFeature.dll");
//        System.load("THFaceImage.dll");
//        System.load("YukaFaceHelper.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_core2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_imgproc2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/opencv_highgui2413.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/THFeature.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/THFaceImage.dll");
        System.load("C:/Users/82038/Desktop/FaceSDK_x86/YukaFaceHelper.dll");
        try {
            TestInteface INSTANCE = (TestInteface) Native.loadLibrary("YukaFaceHelper", TestInteface.class);
            FileInputStream in = new FileInputStream(
                    new File(path1));
            FileInputStream in2 = new FileInputStream(
                    new  File(path2));
            byte[] image = new byte[in.available()];
            byte[] image2 = new byte[in2.available()];
            in.read(image, 0, image.length);
            in.close();
            in2.read(image2, 0,image2.length);
            in2.close();

            //YKCompare方法测试
            System.out.println("Init:"+
                    INSTANCE.Init()
            );
            INSTANCE.YK_Compare_JAVA(
                    image, image.length,
                    image2, image2.length);
//            INSTANCE.

        } catch (Exception e1) {
            System.out.println("异常信息："+e1.getMessage());
        }
        System.out.println("end");
    }


}
