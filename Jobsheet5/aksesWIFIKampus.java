package Jobsheet5;

import java.util.Scanner;

public class aksesWIFIKampus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String jenisPengguna;
        int jmlSks = 0;

        System.out.println("=== Sistem Akses Wifi Kampus ===");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        jenisPengguna = input.nextLine();

        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses Wifi diberikan (dosen). ");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.println("Masukkan jumlah SKS yang diambil: ");
            jmlSks = input.nextInt();

            if (jmlSks >= 12) {
                System.out.println("Akses Wifi diberikan (Mahasiswa Aktif)");
            } else {
                System.out.println("Akses Wifi ditolak (Jumlah SKS < 12)");
            }
        } else {
            System.out.println("Jenis pengguna tidak dikenali");
        }
        input.close();
        System.out.println("=== Proses Selesai ===");
        
    }
    
}
