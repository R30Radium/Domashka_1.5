package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        //1.1
        int[] intArray = new int[3];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        //1.2
        float[] floatPointArray = {1.57f, 7.654f, 9.986f};
        //1.3
        long[] longArray = {1l, 2l, 3l, 4l, 5l};

        //Задание 2

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(floatPointArray));
        System.out.println(Arrays.toString(longArray));

        //Задание 3


        int[] i = {1, 2, 3};
        for (int i1 = i.length -1; i1 >= 0; i1--) {
            if (i1 > i.length - 1)
                System.out.print(i[i1] + "; ");
            else
                System.out.print(i[i1]);
        }
        float [] f = {1.57f, 7.654f, 9.986f};
        for (int i0 = i.length - 1; i0 >= 0; i0--) {
            if (i0 > i.length -1)
                System.out.println(f[i0]);
            else
                System.out.println(f[i0]);
        }
        long[] l = {1l, 2l, 3l, 4l, 5l};
        for (int i2 = l.length -1; i2 >= 0; i2--) {
            if (i2 == l.length - 0)
                System.out.print(l[i2]);
            else
                System.out.print(l[i2] + " ");
        }

        //Задание 4

        for (int r = 0; r < intArray.length; r++) {
            if (intArray[r] % 2 !=0) {
                intArray[r] = intArray [r] +1;
            }                                   {
            }
            System.out.println(intArray[r]+ ", ");

        }
    }}
