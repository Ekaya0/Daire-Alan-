import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenler atandı
        int r, a;
        double pi = 3.14, alan;

        //Scanner sınıfı tanımlandı
        Scanner input = new Scanner(System.in);

        //
        System.out.print("Dairenin Yarı Çapını Giriniz :");
        r = input.nextInt();

        System.out.print("Merkez Açı Ölçüsünü Giriniz :");
        a = input.nextInt();

        alan = (pi * (r * r) * a) / 360;

        System.out.print("Alan :" + alan);

    }
}