import java.util.Scanner;

public class day05 {

     public static void main(String[] args) {

      /* Scanner input=new Scanner(System.in);
        System.out.println("Lutfen sisteme bir sayi giriniz");
        int sistemeGirilen=input.nextInt();


        for (int i = 1; i<=sistemeGirilen ; i++) {

            if (i%15==0){
                System.out.print(" 15 k ");

            }else if (i%5==0){
                System.out.print(" 5 k ");

            }else if (i%3==0){
                System.out.print(" 3 k");
            }else {
                System.out.print(i+ " ");
            }

        }*/
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satirsayisi=input.nextInt();

        System.out.println("Lutfen kullanmak istediginiz karakteri giriniz");
        char karakter=input.next().charAt(0);


        ucgenCiz(satirsayisi,karakter);


    }

    public static void ucgenCiz(int satirsayisi, char karakter) {

        for (int i = 0; i <satirsayisi; i++) {

            for (int j = 0; j <=i ; j++) {
                System.out.println(karakter+ " ");

            }


        }System.out.println();



    }
}
