package Jobsheet10;

import java.util.Scanner;

public class bioskopWithScanner05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] penonton = new String[4][2];
        int menu;

        while (true) {
            System.out.println("\n=== MENU BIOSKOP ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                String nama;
                int baris, kolom;

                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();

                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Nomor kursi tidak tersedia! Silakan masukkan ulang.");
                        continue;
                    }

                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + " !");
                        System.out.println("Silakan pilih kursi lain.");
                        continue;
                    }
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data penonton berhasil ditambahkan!");
                    break;
                }

            } else if (menu == 2) {
                System.out.println("\n=== DAFTAR PENONTON ===");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.print(" *** ");
                        } else {
                            System.out.print(penonton[i][j] + " ");
                        }
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Program selesai.");
                break;

            } else {
                System.out.println("Menu tidak valid!");
            }
        }

        sc.close();
    }
}
