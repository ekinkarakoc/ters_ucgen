import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basamak_sayisi;

        System.out.println("Basamak sayisi giriniz: ");
        basamak_sayisi = scanner.nextInt();

        while (basamak_sayisi > 0) {

        for (int i = basamak_sayisi; i > 0; i--) {
            System.out.print("*");
        }
            System.out.println();
        basamak_sayisi--;
        }
    }
}