import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan üç sayı alma
        System.out.print("Birinci sayıyı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int num2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int num3 = scanner.nextInt();

        // Maksimum sayıyı bulma
        int max = num1; // İlk sayıyı varsayılan olarak maksimum kabul et

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        // Sonucu gösterme
        System.out.println("Girilen sayılardan en büyüğü: " + max);

        // Scanner'ı kapatma
        scanner.close();
    }
}