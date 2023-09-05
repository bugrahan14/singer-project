import java.util.Scanner;
public class Test {
    private static Sarkici sarkici = new Sarkici();
    private static Scanner scanner = new Scanner(System.in);

    public static void işlemleri_bastir() {
        System.out.println("\t 0-İŞLEMLERİ GÖRÜNTÜLE");
        System.out.println("\t 1-ŞARKICILARI GÖRÜNTÜLE");
        System.out.println("\t 2-ŞARKICI EKLE");
        System.out.println("\t 3-ŞARKICI GÜNCELLE");
        System.out.println("\t 4-ŞARKICI SİL");
        System.out.println("\t 5-ŞARKICI ARA");
        System.out.println("\t 6-UYGULAMADAN ÇIKILIYOR");
    }

    public static void sarkici_görüntüle() {
        sarkici.sarkicilari_bastir();
    }

    public static void sarkici_ekle() {
        System.out.println("LÜTFEN EKLEMEK İSTEDİĞİNİZ ŞARKICININ ADINI GİRİNİZ");
        String ad = scanner.nextLine();
        sarkici.sarkici_ekle(ad);
    }

    public static void sarkici_güncelle() {
        System.out.println("LÜTFEN GÜNCELLEMEK İSTEDİĞİNİZ ŞARKICI VE İNDEKSİ GİRİNİZ");

        int pozisyon = scanner.nextInt();
        scanner.nextLine();

        String isim = scanner.nextLine();

        sarkici.şarkici_güncelle(isim, (pozisyon - 1));
    }

    public static void sarkici_silme() {
        System.out.println("LÜTFEN SİLMEK İSTEDİĞİNİZ POZİSYONU GİRİNİZ");

        int pozisyon = scanner.nextInt();
        scanner.nextLine();
        sarkici.şarkici_sil(pozisyon - 1);
    }

    public static void sarkici_ara() {
        System.out.println("LÜTFEN ARAMAK İSTEDİĞİNİZ İSMİ SEÇİNİZ");

        String ad = scanner.nextLine();

        sarkici.sarkici_ismi(ad);
    }

    public static void main(String[] args) {

        System.out.println("\t ŞARKICI UYGULAMASINA HOŞGELDİNİZ");

        işlemleri_bastir();

        while (true) {
            System.out.println("LÜTFEN İŞLEM SEÇİNİZ");
            int a = scanner.nextInt();
            switch (a) {
                case 0:
                    işlemleri_bastir();
                    break;

                case 1:
                    sarkici_görüntüle();
                    break;

                case 2:
                    sarkici_ekle();
                    break;

                case 3:
                    sarkici_güncelle();
                    break;

                case 4:
                    sarkici_silme();
                    break;

                case 5:
                    sarkici_ara();
                    break;

                case 6:
                    System.out.println("SİSTEMDEN ÇIKILIYOR");
                    System.exit(0); 
                    break;
            }
        }
    }
}
