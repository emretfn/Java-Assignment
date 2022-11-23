import java.util.Scanner;

import enums.AsamaEnum;


public class AnaSayfa {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ogrenci Adı: ");
        String ogrenciAd = scanner.nextLine();
        System.out.println("Ogrenci Soyadı: ");
        String ogrenciSoyad = scanner.nextLine();
        Ogrenci ogrenci = new Ogrenci(ogrenciAd, ogrenciSoyad);
        ogrenci.BilgileriYazdir();
        ogrenci.MezuniyetYiliHesapla();

        System.out.println("Lisans Ogrencisi Adı: ");
        String lisansOgrenciAd = scanner.nextLine();
        System.out.println("Lisans Ogrencisi Soyadı: ");
        String lisansOgrenciSoyad = scanner.nextLine();
        System.out.println("Lisans Ogrencisi Sınıfı: ");
        int lisansOgrenciSinif = scanner.nextInt();
        System.out.println("Lisans Ogrencisi Vize Notu: ");
        double lisansOgrenciVizeNot = scanner.nextDouble();
        System.out.println("Lisans Ogrencisi Final Notu: ");
        double lisansOgrenciFinalNot = scanner.nextDouble();
        LisansOgrencisi lisansOgrencisi = new LisansOgrencisi(lisansOgrenciAd, lisansOgrenciSoyad, lisansOgrenciSinif, lisansOgrenciVizeNot, lisansOgrenciFinalNot);
        lisansOgrencisi.BilgileriYazdir();
        lisansOgrencisi.MezuniyetYiliHesapla();
        System.out.println("Lisans Ogrencisi Gecme Notu: " + lisansOgrencisi.GecmeNotuHesapla());

        System.out.println("Yuksek Lisans Ogrencisi Adı: ");
        String yuksekLisansOgrenciAd = scanner.nextLine();
        System.out.println("Yuksek Lisans Ogrencisi Soyadı: ");
        String yuksekLisansOgrenciSoyad = scanner.nextLine();
        System.out.println("Yuksek Lisans Ogrencisi Final Notu: ");
        int yuksekLisansOgrenciFinalNot = scanner.nextInt();
        System.out.println("Yuksek Lisans Ogrencisi Asaması: ");
        AsamaEnum yuksekLisansOgrenciAsama = AsamaEnum.valueOf(scanner.next());
        YuksekLisansOgrenci yuksekLisansOgrencisi = new YuksekLisansOgrenci(yuksekLisansOgrenciAd, yuksekLisansOgrenciSoyad, yuksekLisansOgrenciFinalNot, yuksekLisansOgrenciAsama);
        yuksekLisansOgrencisi.BilgileriYazdir();
        yuksekLisansOgrencisi.MezuniyetYiliHesapla();
        yuksekLisansOgrencisi.HarfHesapla();

        scanner.close();





    }
}
