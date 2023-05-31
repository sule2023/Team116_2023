package ornekSorular;

import java.util.Scanner;

public class C04_if_Else_istanbul_kart_gecis {
    public static void main(String[] args) {
        /*
        soru: kullanicadan kart turu
        aktarma ve bakiye bilgisini alarak eger yeterli bakiye bulunuyorsa kalan bakiye
        bilgisini gosterin , yeterli bakiye bulunmammasi halinde gerekli uyariyi yapiniz
        asagidaki verileri kullaniniz
        tam  kart 7,67
        ogrenci kart 3.74
        sosyal kart 5.49

        1.aktarma tam icin 5.49 ogrnci 1.64 sosyal 3.29
        2.aktarma tam icin 4.17 ogrnci 1.54 sosyal 2.52
         */

        Scanner oku = new Scanner(System.in);
        int kartTuru=0;
        int aktarma= 0;
        double bakiye=0;
        double ucret= 0;
        System.out.println("kart turunu giriniz(1)-tam....7.67 (2)-ogrenci....3.74 (3)-sosyal....5.49:");
        kartTuru = oku.nextInt();
        System.out.println("aktarma (0)-ilk binis (1)-1.aktarma (2)-2.aktarma:");
        aktarma= oku.nextInt();
        System.out.println("bakiye:");
        bakiye= oku.nextDouble();

        if (kartTuru==1){
          if(aktarma==0){
              ucret=7.67;
          } else if (aktarma==1) {
              ucret=5.49;

          } else if (aktarma==2) {
              ucret=4.17;

          }else {
              ucret=0;
              System.out.println("hatali giris ");
          }
      }
      if (kartTuru==2){
          if (aktarma==0){
              ucret=3.75;
          } else if (aktarma==1) {
              ucret=1.64;
          } else if (aktarma==2) {
              ucret=1.54;
          }else{ ucret=0;
              System.out.println("hatali giris ");

      }
    }
      if (kartTuru==3){
          if (aktarma==0){
              ucret=5.49;
          }
      } else if (aktarma==1) {
              ucret=3.29;
          } else if (aktarma==2) {
          ucret=2.52;
      }else {
          ucret=0;
          System.out.println("hatali giris ");
      } if(bakiye>=ucret){
            bakiye-=ucret;
            System.out.println("iyi yolculuklar .kalan bakiye :"+bakiye);

    }  else {
            System.out.println("yetersiz bakiye ");


    }
      }
}