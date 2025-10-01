package jobsheet5;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        if (angka > 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Gagal");
        }

        sc.close();
    }
}

