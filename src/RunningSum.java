import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class RunningSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] nums = {3,1,2,10,1};
        int [] result = sumOfEle(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sumOfEle (int[] arr){
        int [] newArr = new int[arr.length];
        newArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            newArr[i] = arr[i] + newArr[i - 1];
        }
        return newArr;
    }

    //Return the running sum of elements
}