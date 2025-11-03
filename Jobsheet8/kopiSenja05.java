package Jobsheet8;

import java.util.Scanner;
public class kopiSenja05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah cabang kafe: ");
        int jumlahCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===\n");

        int totalPelanggan = 0;
        int totalItem = 0;

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int pelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int j = 1; j <= pelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + pelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang + " item\n");

            totalPelanggan += pelanggan;
            totalItem += totalItemCabang;
        }

        System.out.println("Total seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");

        sc.close();
    }
}
