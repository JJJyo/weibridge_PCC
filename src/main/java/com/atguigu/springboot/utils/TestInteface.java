package com.atguigu.springboot.utils;

import com.sun.jna.Library;

/**
 *
 * Init         初试函数
 * YK_Compare   特征比对函数
 * FE_Detect    人脸检测函数
 * FE_Extract   特征提取函数
 * FE_Compare   特征比对函数
 *
 */

public interface TestInteface extends Library {
    boolean Init();

    double Add(double a, double b);

    double YK_Compare_JAVA(byte[] data1, int data1size,
                           byte[] data2, int data2size);

//    int FE_Detect(byte[] data1, int w1, int h1,
//                  int step1, int[] posArr);
//
    int FE_Extract(byte[] data1, int w1, int h1,
                   int step1, byte[] buffer);
//
//    double FE_Compare(byte[] data1, byte[] data2);
}
