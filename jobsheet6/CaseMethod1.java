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

        System.out.println("=== HASIL PENILAIAN AKADEMIK===");
        double rata = (akhir1 + akhir2) / 2;
        String status1 = (akhir1 >= 60) ? "Lulus" : "Tidak";
        String status2 = (akhir2 >= 60) ? "Lulus" : "Tidak";
        String statusSemester = (akhir1 >= 60 && akhir2 >= 60 && rata >= 70)
                ? "LULUS SEMESTER"
                : "TIDAK LULUS";
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim); 

        String huruf1 = konversiHuruf(akhir1);
        String huruf2 = konversiHuruf(akhir2);

        System.out.println("\nMata Kuliah                UTS   UAS   Tugas   Nilai Akhir   Huruf   Status");
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-25s %-5.0f %-5.0f %-7.0f %-10.2f %-7s %-10s%n",
                "Algoritma Pemrograman", uts1, uas1, tugas1, akhir1, huruf1 , status1);
        System.out.printf("%-25s %-5.0f %-5.0f %-7.0f %-10.2f %-7s %-10s%n",
                "Struktur Data", uts2, uas2, tugas2, akhir2, huruf2, status2);
        System.out.printf("Rata-rata Nilai Akhir : %.2f%n", rata);
        System.out.println("Status Semester       : " + statusSemester);

        input.close();
    }

    public static String konversiHuruf(double n) {
        if (n >= 80) return "A";
        else if (n >= 73) return "B+";
        else if (n >= 65) return "B";
        else if (n >= 60) return "C+";
        else if (n >= 50) return "C";
        else if (n >= 39) return "D";
        else return "E";
    }
}

