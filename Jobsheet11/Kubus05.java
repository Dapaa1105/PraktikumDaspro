package Jobsheet11;

public class Kubus05 {
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 5;
        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
