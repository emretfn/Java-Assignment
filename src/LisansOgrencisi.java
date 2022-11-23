public class LisansOgrencisi extends Ogrenci {

    public String durum;
    public int sınıf;
    public double vize_not;
    public double final_not;


    
    public LisansOgrencisi(String ad, String soyad, int sınıf, double vize_not, double final_not) {
        super(ad, soyad);
        this.sınıf = sınıf;
        this.vize_not = vize_not;
        this.final_not = final_not;
        this.durum = "Lisans";
    }

    @Override
    public void MezuniyetYiliHesapla() {
        int yil = 2022;
        int mezuniyet_yili = yil + (4 - sınıf);
        System.out.println("Ogrenci ID: " + getId());
        System.out.println("Ogrenci Adı " + Ad + " " + Soyad);
        System.out.println("Mezuniyet Yılı: " + mezuniyet_yili);
    }

    @Override
    public void BilgileriYazdir() {
        System.out.println("Ogrenci ID: " + getId());
        System.out.println("Ogrenci Adı " + Ad + " " + Soyad);
        System.out.println("Ogrenci Durumu: " + durum);
        System.out.println("Ogrenci Sınıfı: " + sınıf);
        System.out.println("Ogrenci Vize Notu: " + vize_not);
        System.out.println("Ogrenci Final Notu: " + final_not);
    }

    public double GecmeNotuHesapla(){
        double gecme_notu = (vize_not * 0.4) + (final_not * 0.6);
        return gecme_notu;
    }
}
