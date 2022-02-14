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

        dynaarr Dynaarr = new dynaarr();
        for (int value : arr) {
            if (value > 0) {
                add(Dynaarr, value);
            }
        }

        return Dynaarr;

    }

    private static void add(dynaarr Dynaarr, int value) {
        if (Dynaarr.count == Dynaarr.result.length) {
            int[] newArray = new int[Dynaarr.result.length * 2];
            System.arraycopy(Dynaarr.result, 0, newArray, 0, Dynaarr.result.length);
            Dynaarr.result = newArray;
        }
        Dynaarr.result[Dynaarr.count++] = value;
    }
}
