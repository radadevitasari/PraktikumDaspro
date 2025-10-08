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

        System.out.println("\nMata Kuliah 2: Struktur Data");
        System.out.print("Nilai UTS: "); double uts2 = input.nextDouble();
        System.out.print("Nilai UAS: "); double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas: "); double tugas2 = input.nextDouble();
        double akhir2 = (uts2*0.3) + (uas2*0.4) + (tugas2*0.3);

    }
}
