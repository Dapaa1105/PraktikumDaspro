package Jobsheet7;

import java.util.Scanner;
public class penjualanTiketBioskop05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlahTiket, totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.");
                continue;
            }

            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            totalHarga -= totalHarga * diskon;

            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total harga untuk pelanggan ini: Rp " + totalHarga);
            System.out.println("--------------------------------------");

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
        }

        System.out.println("\n=== Rangkuman Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual : " + totalTiket);
        System.out.println("Total penjualan     : Rp " + totalPenjualan);

        sc.close();
    }
}
