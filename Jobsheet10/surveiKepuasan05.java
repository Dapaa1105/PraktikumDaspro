import java.util.Scanner;

public class surveiKepuasan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int[10][6];

        System.out.println("=== Input Survei Kepuasan Pelanggan ===");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nResponden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                int nilai;
                do {
                    System.out.print("  Nilai pertanyaan " + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                } while (nilai < 1 || nilai > 5);
                survei[i][j] = nilai;
            }
        }

        System.out.println("\n=== Rata-rata Setiap Responden ===");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
            double rata = (double) total / 6;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }

        System.out.println("\n=== Rata-rata Setiap Pertanyaan ===");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            double rata = (double) total / 10;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }

        int totalSemua = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalSemua += survei[i][j];
            }
        }

        double rataKeseluruhan = (double) totalSemua / (10 * 6);
        System.out.println("\n=== Rata-rata Keseluruhan ===");
        System.out.println("Rata-rata total survei: " + rataKeseluruhan);

        sc.close();
    }
}
