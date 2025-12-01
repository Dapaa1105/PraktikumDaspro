package Jobsheet11;

import java.util.Scanner;

public class RekapPenjualanCafe05 {

    static void inputData(int[][] data, String[] menu) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilkanData(int[][] data, String[] menu) {
        System.out.print("Menu        ");
        for (int i = 1; i <= data[0].length; i++) {
            System.out.print("Hari " + i + "  ");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "   ");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "       ");
            }
            System.out.println();
        }
    }

    static void penjualanTertinggi(int[][] data, String[] menu) {
        int maxTotal = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("Menu dengan total penjualan tertinggi: " + menuTertinggi + " (" + maxTotal + ")");
    }

    static void rataRataPenjualan(int[][] data, String[] menu) {
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = total / (double) data[i].length;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        String[] menu = new String[jumlahMenu];
        sc.nextLine();

        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        int[][] data = new int[jumlahMenu][jumlahHari];

        inputData(data, menu);
        tampilkanData(data, menu);
        penjualanTertinggi(data, menu);
        rataRataPenjualan(data, menu);
    }
}
