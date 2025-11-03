package Jobsheet8;

import java.util.Scanner;
public class nilaiKelompok05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, nilai;
        float totalNilai, rataNilai;
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai dari Kelompok Penilai " + j + ": ");
                nilai = sc.nextInt();
                totalNilai += nilai;
            }

            rataNilai = totalNilai / 5;
            System.out.println("Total Nilai Kelompok " + i + " = " + totalNilai);
            System.out.println("Rata-rata Nilai Kelompok " + i + " = " + rataNilai);
            System.out.println();

            if (rataNilai > rataTertinggi) {
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;
        }

        System.out.println("Kelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTertinggi);
        System.out.println("Dengan rata-rata nilai = " + rataTertinggi);

        sc.close();
    }

    }

