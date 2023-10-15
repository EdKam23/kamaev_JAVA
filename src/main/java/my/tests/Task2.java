package my.tests;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class Task2 {

    static public String givenName = "Вячеслав";

    public static void main(String[] args) {
        System.out.printf("\n");

        if (ArrayUtils.isNotEmpty(args) && args[0].equalsIgnoreCase(givenName)) {
            System.out.printf("Привет, " + givenName + "!");
        } else {
            System.out.printf("Нет такого имени");
        }


    }
}