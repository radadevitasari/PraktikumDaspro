package jobsheet5;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Perpustakaan Kampus ===");
        System.out.print("Apakah membawa kartu mahasiswa? (Ya/Tidak): ");
        String kartu = input.nextLine();

        System.out.print("Apakah sudah registrasi online? (Ya/Tidak): ");
        String registrasi = input.nextLine();

        if (kartu.equalsIgnoreCase("Ya") || registrasi.equalsIgnoreCase("Ya")) {
            System.out.println("Boleh Masuk");
        } else {
            System.out.println("Tidak Boleh Masuk");
        }

        input.close();
    }
}


        