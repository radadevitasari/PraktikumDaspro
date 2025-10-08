package PraktikumDaspro.jobsheet6;

import java.util.Scanner;

public class CaseMethod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("NIM  : ");
        String nim = input.nextLine();

        System.out.println("\nMata Kuliah 1: Algoritma & Pemrograman");
        System.out.print("Nilai UTS: "); double uts1 = input.nextDouble();
        System.out.print("Nilai UAS: "); double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas: "); double tugas1 = input.nextDouble();
        double akhir1 = (uts1*0.3) + (uas1*0.4) + (tugas1*0.3);

    }
}
