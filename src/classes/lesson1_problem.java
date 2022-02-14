package classes;

import java.util.Arrays;

public class lesson1_problem {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 5, -6, 10, 50, 11, -3, -31};

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
                Dynaarr.add(value);
            }
        }

        return Dynaarr;

    }


}
