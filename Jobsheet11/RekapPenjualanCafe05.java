package Jobsheet11;

public class RekapPenjualanCafe05 {
    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    static int[][] inputData() {
        int[][] data = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55}
        };
        return data;
    }

    static void tampilkanData(int[][] data) {
        System.out.println("Data Penjualan Kafe (7 Hari)");
        System.out.print("Menu        ");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Hari " + i + "  ");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "   ");
            for (int j = 0; j < 7; j++) {
                System.out.print(data[i][j] + "       ");
            }
            System.out.println();
        }
    }

    static void penjualanTertinggi(int[][] data) {
        int maxTotal = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("Menu dengan total penjualan tertinggi: " + menuTertinggi + " (" + maxTotal + ")");
    }

    static void rataRataPenjualan(int[][] data) {
        System.out.println("Rata-rata penjualan setiap menu");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += data[i][j];
            }
            double rata = total / 7.0;
            System.out.println(menu[i] + ": " + rata);
        }
    }

    public static void main(String[] args) {
        int[][] data = inputData();
        tampilkanData(data);
        penjualanTertinggi(data);
        rataRataPenjualan(data);
    }
}
