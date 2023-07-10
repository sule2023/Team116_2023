package ornekSorular;

import java.util.Arrays;

public class C01_Arrays_artirma {
    public static void main(String[] args) {
        //Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.

        int []arr= {1,2,3,4,5,6};
        int []yeniArr=arrArttir(arr);
        System.out.println("yeni Array:"+ Arrays.toString(yeniArr));
        System.out.println("eski Array:"+Arrays.toString(arr));
    }
    public static  int[] arrArttir(int[]arr){
        int []yeniArr=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i]+2;

        }
        return yeniArr;
    }
}
