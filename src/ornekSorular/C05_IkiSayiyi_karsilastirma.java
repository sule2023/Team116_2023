package ornekSorular;

public class C05_IkiSayiyi_karsilastirma {
    public static void main(String[] args) {
        // karsilastirma icin iki sayi tanimlayalim
        // sayilari degistrcek o if blogu  aktiflesecektir

        int sayi1= 60;
        int sayi2=60;

        if (sayi1>sayi2){
            System.out.println(sayi1+"buyuktur"+sayi2+"sayisinda");
        }else if (sayi1<sayi2){
            System.out.println(sayi1+"kucuktur"+sayi2+"sayisinda");

        }else {
            System.out.println(sayi1+"esittir"+sayi2);  //eger sayilari  ayni verirsek  esittir yazacak
        }
    }
}
