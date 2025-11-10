import java.util.Scanner;

public class cariMenu05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu Kafe ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }

        System.out.print("\nMasukkan nama makanan yang ingin dicari: ");
        String cari = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                ditemukan = true;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println("Menu \"" + cari + "\" tersedia di kafe.");
        } else {
            System.out.println("Menu \"" + cari + "\" tidak tersedia di kafe.");
        }

        sc.close();
    }
}
