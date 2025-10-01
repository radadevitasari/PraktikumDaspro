import java.util.Scanner;
public class ifCetakKRS20 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cetak KRS SIAKAD");
    System.out.println("Apakah UKT sudah lunas? (true/false)");
    boolean uktlunas = sc.nextBoolean();
    if (uktlunas) {
        System.out.println("Pembayaran UKT terverifikasi");
        System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        
        sc.close();
    }
}
}