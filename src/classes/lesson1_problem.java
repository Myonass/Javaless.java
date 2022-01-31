package classes;

import java.util.Arrays;

public class lesson1_problem {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -6};

        dynaarr result = PositiveNum(arr);

        for (int i = 0; i < result.count; i++) {
            System.out.print(result.result[i] + " ");
        }
        System.out.println();


    }

    private static dynaarr PositiveNum(int[] arr) {
        int[] result = new int[arr.length];
        int count = 0;
        for (int value : arr) {
            if (value > 0) {
                result[count++] = value;
            }
        }
        dynaarr Dynaarr = new dynaarr();
        Dynaarr.result = result;
        Dynaarr.count = count;
        return Dynaarr;

    }
}
