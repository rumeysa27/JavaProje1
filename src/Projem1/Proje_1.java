package Projem1;

import java.util.Scanner;

public class Proje_1 {
    public static void main(String[] args) {
        // Scanner class tanimlayin...
        // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...
        // Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...
        // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
        // Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...
        // Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."
        // ikazi verelim
        // Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...
        // Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."
        // ikazi verelim
        // Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"
        // Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"
        // Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"
        // Girilen iki sifre birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir sifre girdiniz,
        // lutfen tekrar deneyin..." ikazi verelim
        // Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."
        // ikazi verelim...

        Scanner oku=new Scanner(System.in);
        System.out.print("İsminizi giriniz:");
        String isim=oku.nextLine();
        System.out.println();
        String cevir=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.print(cevir+" "+"Hoş geldiniz, soyisminizi giriniz:");
        System.out.println(" ");

        String soyad=oku.nextLine();
        String cevir2=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        System.out.println(cevir+" "+cevir2);

        String okunan;
        do {
            System.out.print("isim ve soyisminiz doğru ise harf giriniz:");
            okunan=oku.nextLine();

            if (!okunan.equalsIgnoreCase("Y"))
                System.out.println("Tercihinizi doğru yapmadınız... Lütfen tekrar deneyiniz:");

        }while (!okunan.equalsIgnoreCase("Y"));

        System.out.print("isminiz ve soyisminiz sisteme başarılı bir şekilde kaydedilmiştir:");

        System.out.println("lütfen bir kullanıcı adı belirleyiniz:");
        String user=oku.nextLine();

        System.out.print("lütfen şifrenizi belirleyiniz:");
        String sifre=oku.next();

        System.out.print("şifrenizi tekrar giriniz:");
        String sifreTekrar=oku.next();

        do {
            System.out.print("Yanlış veya hatalı bir şifre girdiniz lütfen tekrar deneyiniz:");
            String yeniden=oku.next();
            break;
        } while (!sifre.equalsIgnoreCase(sifreTekrar));
        System.out.print("TEBRİKLER..."+" "+user+" kullanıcı adı ile sisteme kayıt oldunuz");






    }
}
