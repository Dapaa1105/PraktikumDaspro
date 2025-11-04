package Jobsheet9;

import java.util.Scanner;
public class arrayNilai05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke- " + i + " : " );
            nilaiAkhir[i] =  sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
        System.out.println("Nilai akkhir ke-" + i + " adalah " + nilaiAkhir[i]);
}
sc.close();
}
}