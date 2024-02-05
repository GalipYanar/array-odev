package ilkKonular;

import java.util.Scanner;

public class tekar03 {
    public static void main(String[] args) {
        //kullanıcıdan n e kadar sayı al, array e at, toplamı ortalaması çift ve tek yazdır

        int toplam=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("kaç adet sayı girilecek?");
        int num1 = scan.nextInt();
        int[] numbers = new int[num1];

        for (int i =0; i<num1; i++){
            System.out.println((i+1) +" . sayıyı girin");
            numbers[i] = scan.nextInt();
        }
        for (int i =0; i<num1; i++){
            toplam += numbers[i];
        }
        for (int i =0; i<num1; i++){
            if (numbers[i]%2==0){
                System.out.println(numbers[i] + " girilen sayı çifttir");
            }else {
                System.out.println(numbers[i] + " girilen sayı tektir");
            }
        }

        System.out.println("girilen sayıların toplamı: " + toplam);
        System.out.println("girilen sayıların ortalaması: " + (double)toplam/num1);


    }


}
