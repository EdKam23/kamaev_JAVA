package my.tests;

import org.apache.commons.lang3.ArrayUtils;

public class Task1 {

    static public int templateNumber = 7;

    public static void main(String[] args) {
        System.out.printf("\n");
        if (ArrayUtils.isNotEmpty(args) && Integer.parseInt(args[0]) > templateNumber) {
            System.out.printf("Привет");

        } //else {
           // System.out.printf("Hello, the entered number is less than or equal to: " + templateNumber);
        //}


    }
}