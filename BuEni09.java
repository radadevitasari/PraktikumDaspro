import java.util.Scanner;

public class BuEni09 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int uangSPP;
        int uangGedung;
        int lamaAngsuran;
        double jumlahAngsuran;
        double besaranUang;

    System.out.println(" Masukkan uang SPP: ");
    uangSPP = input.nextInt();

    System.out.println("Masukkan uang Gedung: ");
    uangGedung = input.nextInt();

    System.out.println("Masukkan jumlah angsuran: ");
    jumlahAngsuran = input.nextDouble();

    System.out.println("Masukkan lama angsuran: ");
    lamaAngsuran = input.nextInt();

    besaranUang = uangSPP + uangGedung;

    System.out.println(" Besaran uang jajan  = " +besaranUang);

    }
    
}
