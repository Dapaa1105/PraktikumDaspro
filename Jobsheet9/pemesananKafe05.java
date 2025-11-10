package Jobsheet9;

import java.util.Scanner;
public class pemesananKafe05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 

        String[] namaPesanan = new String[jumlah];
        double[] hargaPesanan = new double[jumlah];
        double total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nama makanan/minuman ke-" + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": Rp ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 

            total += hargaPesanan[i];
        }

        System.out.println("\n=== Daftar Pesanan Anda ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Total biaya pesanan: Rp " + total);

        sc.close();
    }
}
