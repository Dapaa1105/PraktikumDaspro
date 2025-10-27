package Jobsheet7;

import java.util.Scanner;
public class hitungParkir05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        double totalPendapatan = 0;

        while (true) {
            System.out.println("=== Program Parkir Harian ===");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan (Angka saja): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("\nProgram selesai.");
                break;
            }

            if (jenis != 1 && jenis != 2) {
                System.out.println("Jenis kendaraan tidak valid!\n");
                continue;
            }

            System.out.print("Masukkan durasi parkir (jam): ");
            durasi = sc.nextInt();

            if (durasi <= 0) {
                System.out.println("Durasi tidak valid!\n");
                continue;
            }

            double tarif = 0;

            if (durasi > 5) {
                tarif = 12500;
            } else {
                if (jenis == 1) { 
                    tarif = durasi * 3000;
                } else { 
                    tarif = durasi * 2000;
                }
            }

            System.out.println("Biaya parkir kendaraan ini: Rp " + tarif + "\n");
            totalPendapatan += tarif;
        }

        System.out.println("-----------------------------------");
        System.out.println("Total pendapatan hari ini: Rp " + totalPendapatan);
    }
}
