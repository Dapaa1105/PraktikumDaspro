package Jobsheet11;

import java.util.Scanner;

public class kafe05 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if(isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if(kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%!");
        } else if(kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("\n==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Bakar - Rp 18,000");
        System.out.println("===========================");
    }

    public static int hitungTotalHargaNoPresensi(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if(kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan");
            hargaTotal = hargaTotal - (hargaTotal * 50 / 100);
        } else if(kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else {
            System.out.println("Kode promo invalid, tidak ada diskon");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Menu("Andi", true, "DISKON30");

        System.out.print("\nBerapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenisMenu = sc.nextInt();

        int totalKeseluruhan = 0;

        for(int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.print("\nMasukkan nomor menu ke-" + i + ": ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item untuk menu tersebut: ");
            int banyakItem = sc.nextInt();

            System.out.print("Masukkan kode promo: ");
            String kodePromo = sc.next();

            int totalMenu = hitungTotalHargaNoPresensi(pilihanMenu, banyakItem, kodePromo);

            System.out.println("Total untuk menu ini: Rp " + totalMenu);

            totalKeseluruhan += totalMenu;
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalKeseluruhan);
    }
}
