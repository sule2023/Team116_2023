package ornekSorular;

import java.util.Arrays;

public class C03_ArraysToplam {
    public static void main(String[] args) {

        //erilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
       // olusturacagimiz tek katli bir array’e bu toplamlarinin toplami atayin.
        //input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        //out: [44]
        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};

        int sum = 0;

        for (int[] innerArray : arr) {
            int innerSum = 0;
            for (int num : innerArray) {
                innerSum += num;
            }
            sum += innerSum;
        }

        int[] result = {sum};
        System.out.println(Arrays.toString(result));
    }
}


