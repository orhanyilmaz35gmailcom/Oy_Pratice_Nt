package day04;

import java.util.Scanner;

public class C01_NestedTernary {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen sisteme iki sayyi giriniz");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();

        System.out.println("sayi 1 ="+ sayi1);
        System.out.println("sayi 2 ="+ sayi2);

        System.out.println( sayi1==sayi2 ? ("sayilar birbirine esit"):( sayi1>sayi2 ? sayi1:sayi2     )        );


















    }
}
