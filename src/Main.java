import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = inp.nextInt();
        int basNumber = 0;
        int total = 0;


        while (number != 0) {
            basNumber = number % 10;
            total = total + basNumber;
            number /= 10;
        }
        System.out.println("giridğiniz sayının basamak değerleri toplamı : " + total);


    }
}
