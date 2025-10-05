package Jobsheet5;

import java.util.Scanner;

public class sistemPerpustakaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kehadiran;

        System.out.println("=== Sistem Kehadiran Mahasiswa ===");
        System.out.print("Apakah kehadiran menggunakan kartu mahasiswa? (yes/no): ");
        kehadiran = input.nextLine();
        
        if (kehadiran.equalsIgnoreCase("yes")) {
            System.out.println("Masuk Kampus");
        } else {
            System.out.println("Silahkan Register Online terlebih dahulu.");
            System.out.println("Setelah Register Online, baru bisa masuk kampus. ");

        } System.out.println("=== Selesai ===");
        input.close();
        
    }
    
}
