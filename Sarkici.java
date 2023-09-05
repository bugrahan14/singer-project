import java.util.ArrayList;
public class Sarkici{

    private ArrayList<String> sarkici_listesi=new ArrayList<String>();

    public void sarkicilari_bastir(){

        System.out.println("Şarkici listesinde"+sarkici_listesi.size()+"Kadar şarkici bulunmaktadir");
        // .SİZE METODU DİZİNİN UZUNLUĞUNU GÖSTERİR
        for (int i=0;i<sarkici_listesi.size();i++){

            System.out.println((i+1)+".Şarkici:"+sarkici_listesi.get(i));
        }
    }

    public void sarkici_ekle(String isim){
        // BURADA .ADD METODU EKLEME GÖREVİ  GÖRMEKTEDİR
        sarkici_listesi.add(isim);
        System.out.println("Şarkici listesi güncellendi");
    }


    public void şarkici_güncelle(String isim,int pozisyon){

    sarkici_listesi.set(pozisyon, isim);
     
    System.out.println("Şarkici listesi güncellendi");
    }

    public void şarkici_sil(int index){
        // .REMOVE SİLMEK İÇİN KULLANILAN BİR METOTDUR
        String isim=sarkici_listesi.get(index);

        sarkici_listesi.remove(index);

        System.out.println(isim+"Adli şarkici listeden silinmiştir");
    }

    public void sarkici_ismi(String sarkici_ismi){

        int pozisyon=sarkici_listesi.indexOf(sarkici_ismi);
        if (pozisyon>=0){
            System.out.println(sarkici_ismi+"Adli şarkici"+(pozisyon+1)+".pozisyonda bulundu");
        }
        else{
            System.out.println("BULUNAMADI");
        }
    }



















}