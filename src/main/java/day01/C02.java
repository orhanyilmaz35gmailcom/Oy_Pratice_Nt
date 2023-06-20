package day01;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("lutfen fahreneit cinsinden bir deger giriniz");

        double kullaniciYazacak = input.nextDouble();

        System.out.println("Yazdiniz = " + kullaniciYazacak);

        double yazininEklendigiSepet = hesapBaslasin(kullaniciYazacak);


        System.out.println(yazininEklendigiSepet);


    }

    private static double hesapBaslasin(double kullaniciYazacak) {
        System.out.println( "sonuc = ");
        return  (kullaniciYazacak - 32) / 1.8;
        /*lutfen fahreneit cinsinden bir deger giriniz
        100
        Yazdiniz = 100.0
        37.77777777777778*/
    }


}
