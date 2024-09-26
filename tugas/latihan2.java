import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input umur
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        // Input hari
        System.out.print("Masukkan hari (Weekday/Weekend): ");
        String hari = input.next();

        int hargaTiket = 0; // Variabel untuk menyimpan harga tiket

        // Menggunakan switch case untuk menentukan harga berdasarkan hari dan umur
        switch (hari.toLowerCase()) {
            case "weekday":
                if (umur < 12) {
                    hargaTiket = 30000;
                } else {
                    hargaTiket = 50000;
                }
                break;

            case "weekend":
                if (umur < 12) {
                    hargaTiket = 50000;
                } else {
                    hargaTiket = 80000;
                }
                break;

            default:
                System.out.println("Hari tidak valid, masukkan 'Weekday' atau 'Weekend'.");
                input.close();
                return;  // Keluar dari program jika input hari tidak valid
        }

        // Output harga tiket
        System.out.println("Harga tiket: Rp" + hargaTiket);

        // Tutup input scanner
        input.close();
    }
}
