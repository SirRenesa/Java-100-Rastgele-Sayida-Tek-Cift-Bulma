import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[] sayilar = new int[100];

        ArrayList<Integer> tekSayilar = new ArrayList<>();
        ArrayList<Integer> ciftSayilar = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            int randomsayi = random.nextInt(500);
            sayilar[i] = randomsayi;
        }
        for (int sayi : sayilar) {

            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            }

            else{
                tekSayilar.add(sayi);
            }

        }

        System.out.println("Cift Sayilar: " + ciftSayilar);
        System.out.println("Tek Sayilar: " + tekSayilar);

    }
}