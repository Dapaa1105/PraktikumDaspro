package Jobsheet8;

import java.util.Scanner;
public class jumlahKuadrat05 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int total = 0;
            System.out.print("n = " + i + " → jumlah kuadrat = ");

        for (int j = 1; j <= i; j++) {
                total += j * j;
                System.out.print(j * j);

                if (j < i) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + total);
        }

        sc.close();
    }
}
