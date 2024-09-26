import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input nilai dari pengguna
        System.out.print("Masukkan nilai kehadiran (0-100): ");
        double kehadiran = input.nextDouble();

        System.out.print("Masukkan nilai tugas (0-100): ");
        double tugas = input.nextDouble();

        System.out.print("Masukkan nilai UTS (0-100): ");
        double uts = input.nextDouble();

        System.out.print("Masukkan nilai UAS (0-100): ");
        double uas = input.nextDouble();

        // Menghitung nilai akhir dengan persentase yang diberikan
        double nilaiAkhir = (kehadiran * 0.15) + (tugas * 0.15) + (uts * 0.30) + (uas * 0.40);

        // Menentukan grade berdasarkan nilai akhir
        if (nilaiAkhir >= 85 && nilaiAkhir <= 100) {
            System.out.println("Nilai Akhir: A");
        } else if (nilaiAkhir >= 70 && nilaiAkhir <= 84) {
            System.out.println("Nilai Akhir: B");
        } else if (nilaiAkhir >= 60 && nilaiAkhir <= 69) {
            System.out.println("Nilai Akhir: C");
        } else if (nilaiAkhir >= 45 && nilaiAkhir <= 59) {
            System.out.println("Nilai Akhir: D");
        } else if (nilaiAkhir >= 0 && nilaiAkhir <= 44) {
            System.out.println("Nilai Akhir: E");
        } else {
            System.out.println("Nilai tidak ditemukan");
        }

        // Tutup input scanner
        input.close();
    }
}
