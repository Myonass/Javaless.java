package task2;

import java.util.Arrays;

public class delfromarr {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,0,1,0,3};

        System.out.println(Arrays.toString(removeElem(arr, 5)));
    }

    private static int[] removeElem(int[] nums, int val) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                offset++;
            }
            else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length - offset);
    }
}
