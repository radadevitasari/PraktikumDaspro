package jobsheet5;

import java.util.Scanner;

public class tugas3wifi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Akses WiFi Kampus ===");
        System.out.print("Jenis pengguna (Dosen/Mahasiswa/Lainnya): ");
        String jenis = input.nextLine();

        if (jenis.equalsIgnoreCase("Dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else if (jenis.equalsIgnoreCase("Mahasiswa")) {
            System.out.print("Masukkan jumlah SKS: ");
            int sks = input.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        } else {
            System.out.println("Akses ditolak");
        }

        input.close();
    }
}

