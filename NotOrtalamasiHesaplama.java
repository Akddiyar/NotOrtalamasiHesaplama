import java.util.Scanner;
public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Not ortalamanız: " + ort);

        boolean sonuc = ort>60;
        String str = sonuc ? "Tebrikler, Sınıfı geçtiniz." : "Üzgünüz, Sınıfta Kaldınız.";
        System.out.println(str);


    }
}