public class Ogrenci {
    private static int id = 0;
    public String Ad;
    public String Soyad;

    public Ogrenci( String ad, String soyad) {
        ++id;
        Ad = ad;
        Soyad = soyad;
    }

    public int getId() {
        return id;
    }

    public void BilgileriYazdir() {
        System.out.println("Ogrenci ID: " + getId());
        System.out.println("Ogrenci Adı " + Ad + " " + Soyad);
    }

    public void MezuniyetYiliHesapla(){
        System.out.println("Ogrenci Mezuniyet Yılı Yazdırılıyor...");
    }

}