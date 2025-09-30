package Jobsheet5;

import java.util.Scanner;

public class ifCetakKRS05 {
   
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);

      System.out.println("--- Cetak KRS SIAKAD ---");
      System.out.println("Apakah UKT sudah lunas? (true/false): ");
      boolean uktLunas = sc.nextBoolean();

      if (uktLunas) {
         System.out.println("Pembayaran UKT terverifikasi");
         System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
      }
      else{
         System.out.println("Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu");

      }
      String hasil = (uktLunas)
      ? "Pembayaran UKT terverifikasi\nSilahkan cetak KRS dan minta tanda tangan DPA"
      : "Registrasi ditolak. Silahkan lunasi UKT terlebih dahulu";

        System.out.println("=== Output Ternary Operator ===");
        System.out.println(hasil);

        sc.close();
}
}