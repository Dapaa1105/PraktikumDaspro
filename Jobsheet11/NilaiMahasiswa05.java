package Jobsheet11;

import java.util.Scanner;

public class NilaiMahasiswa05 {

    static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] nilai) {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilai = new int[N];

        isianArray(nilai);
        tampilArray(nilai);

        int totalNilai = hitTot(nilai);

        System.out.println("Total nilai seluruh mahasiswa: " + totalNilai);
    }
}
