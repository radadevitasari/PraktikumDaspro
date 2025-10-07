import java.util.Scanner;

public class modifikasi1 {
    public static void main(String[] args) {   
    Scanner sc = new Scanner(System.in);
    System.out.println("Cetak KRS SIAKAD");
    System.out.println("Apakah UKT sudah lunas? (true/false)");
    boolean uktlunas = sc.nextBoolean();
    if (uktlunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
    }else{
        System.out.println("pembayaran UKT terverifikasi");   
        System.out.println("Silahkan selesaikan pembayaran UKT terlebih dahulu"); 
    }
        sc.close();
    }
}
