package ornekSorular;

public class C02_Arrays_pozitifsayiToplama {
   public static void main(String[] args) {

        /*Verilen bir array’deki pozitif tamsayilari toplayip sonucu
         bize donduren bir
         method yaziniz.
       */
        int[]arr={1,2,-2,3,-3,4};
        int toplam=pozitifSayilarToplami(arr);
       System.out.println("pozitiftamsayilarintoplami:" + toplam);
   }
    public static int pozitifSayilarToplami(int[]arr){
       int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>0){
                toplam+=arr[i];
            }

        }
        return toplam;

    }
}

