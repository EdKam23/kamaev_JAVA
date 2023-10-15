package my.tests;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        System.out.printf("\n");

        ArrayList<Integer> outputArray = createTempArray(args);
        System.out.println("Следующие элементы введенного массива кратны числу 3 :"+outputArray.toString());
    }
    static private ArrayList<Integer> createTempArray(String[] args) {
        ArrayList<Integer> outputArray = new ArrayList<Integer>();

        for (int i = 0; i <= args.length-1; i++) {

            Integer item = Integer.parseInt(args[i]);
            if(item % 3 == 0) {
                outputArray.add(item);
            }

        }

        return outputArray;
    }

}