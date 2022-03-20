package controller;

import repository.entity.Musteri;
import services.MusteriService;

import java.util.Scanner;

public class MusteriController {
    private final MusteriService musteriService;
    Scanner sc = new Scanner(System.in);
    public MusteriController(){
        musteriService = new MusteriService();
    }

    public void MusteriKaydet(){
        System.out.println("******************************");
        System.out.println("*** Müşteri kayıt ekranı  ****");
        System.out.println("******************************");
        Musteri mst = new Musteri();
        System.out.print("Ad...........: ");
        mst.setAd(sc.nextLine());
        System.out.print("Soyad........: ");
        mst.setSoyad(sc.nextLine());
        System.out.print("Adres........: ");
        mst.setAdres(sc.nextLine());
        System.out.print("Telefon......: ");
        mst.setTelefon(sc.nextLine());
        musteriService.save(mst);
        System.out.println("MÜŞTERİ BAŞARI İLE KAYIT EDİLDİ....");
    }
}
