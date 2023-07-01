package day03;

import java.util.Scanner;

public class C01_substing {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("lutfen adinizi ve soyadinizi arada bir bosluk olacak sekilde giriniz...");
        String adsoyad=input.nextLine();

        int stringSpace=adsoyad.indexOf(" ");

        String ad=adsoyad.trim().substring(0,stringSpace);

        String soyad=adsoyad.trim().substring(stringSpace+1);

        char adilk=ad.toUpperCase().charAt(0);

        String adgerikalan= ad.substring(1).toLowerCase();

        char soyadilk=soyad.toUpperCase().charAt(0);

       String soyadgerikalan=soyad.substring(1).toLowerCase();

        System.out.println(adilk + adgerikalan +" " + soyadilk + soyadgerikalan);





    }
}
