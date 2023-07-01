package day03;

import java.util.Scanner;

public class C05_if_else {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("3 karakterden daha uzun bir kelime girin");
        String karakteryaz= scan.nextLine();
        String ilkucharf=karakteryaz.trim().substring(0,3);

        if(karakteryaz.length()<=3) {
            System.out.println("3 karakterden daha uyun bir kelime yazmalisiniz");}


        else {
            System.out.println(ilkucharf+karakteryaz+ilkucharf);

        }






    }}