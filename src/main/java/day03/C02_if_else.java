package day03;

import java.util.Scanner;

public class C02_if_else {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("2 sayi giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a > 0 && b > 0) {
            System.out.println(a + b);}

            else if (a < 0 && b < 0) {
                System.out.println(a * b);

            }

            else if (a < 0 || b > 0 && a > 0 || b < 0) {
                System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
            }


         else {
        System.out.println("sifir carpmaya gore yutan elemandir");

        }}}




