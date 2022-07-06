package com.cc;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;
//tostring能打印一位数组
//deeptostring能打印二维数组
//用对象数组存
public class kk {
    public static void main(String[] args){

        Integer[] a={3,3,5,2,1,7,5,4};
        Arrays.sort(a, (x,y) -> y - x);
        System.out.println(Arrays.toString(a));
    }
}
