import enums.AsamaEnum;

public class YuksekLisansOgrenci extends Ogrenci{
    public String durum;
    public double final_not;
    public AsamaEnum asama;
    

    public YuksekLisansOgrenci (String ad, String soyad, double final_not, AsamaEnum asama) {
        super(ad, soyad);
        this.durum = "Yuksek Lisans";
        this.final_not = final_not;
        this.asama = asama;
    }


    @Override
    public void MezuniyetYiliHesapla() {
        int yil = 2022;
        int mezuniyet_yili;
        switch (asama) {
            case DERS:
                mezuniyet_yili = yil + 2;
                break;
            case TEZ:
                mezuniyet_yili = yil + 1;
                break;
            default:
                mezuniyet_yili = yil;
                break;
        }

        System.out.println("Ogrenci ID: " + getId());
        System.out.println("Ogrenci Adı " + Ad + " " + Soyad);
        System.out.println("Mezuniyet Yılı: " + mezuniyet_yili);
    }

    @Override
    public void BilgileriYazdir() {
        System.out.println("Ogrenci ID: " + getId());
        System.out.println("Ogrenci Adı " + Ad + " " + Soyad);
        System.out.println("Ogrenci Durumu: " + durum);
        System.out.println("Ogrenci Asaması: " + asama);
        System.out.println("Ogrenci Final Notu: " + final_not);
    }

    public void HarfHesapla() {
        if (final_not >= 90) {
            System.out.println("Harf Notu: AA");
        } else if (final_not >= 85) {
            System.out.println("Harf Notu: BA");
        } else if (final_not >= 80) {
            System.out.println("Harf Notu: BB");
        } else if (final_not >= 75) {
            System.out.println("Harf Notu: CB");
        } else if (final_not >= 70) {
            System.out.println("Harf Notu: CC");
        } else if (final_not >= 65) {
            System.out.println("Harf Notu: DC");
        } else if (final_not >= 60) {
            System.out.println("Harf Notu: DD");
        } else if (final_not >= 55) {
            System.out.println("Harf Notu: FD");
        } else {
            System.out.println("Harf Notu: FF");
        }
        
    }
}
