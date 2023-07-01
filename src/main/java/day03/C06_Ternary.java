package day03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
      int verilensayi=  input.nextInt();


     uclu  (verilensayi);

    }

    public static void uclu(int verilensayi) {

        System.out.println(verilensayi > 99 ? "tebrikler uc veya daha cok basamakli " : "uzgunum ucten az basamakli");
    }


}

