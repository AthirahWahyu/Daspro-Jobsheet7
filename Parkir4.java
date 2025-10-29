import java.util.Scanner;

public class Parkir4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi Variabel
        int jenisKendaraan, durasi, total = 0, tarif = 0;
       

        do {
            System.out.println("--- PILIHAN ---");
            System.out.println("0. Keluar");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("--- TARIF PARKIR ---");
            System.out.println("1. Mobil : Rp. 3.000/jam");
            System.out.println("2. Motor : Rp. 2.000/jam");
            System.out.println("3. Lebih dari 5 jam Rp. 12.500 (untuk semua jenis kendaraan)");
            System.out.println("\n--- PILIH JENIS KENDARAAN ---");
            System.out.print("Masukkan jenis kendaraan : ");
            jenisKendaraan = input.nextInt();

            if (jenisKendaraan == 1 || jenisKendaraan == 2) {
            System.out.print("Masukkan durasi parkir (jam) : ");
            durasi = input.nextInt();

            if (durasi > 5) {
                tarif = 12500;
            } else {
                if (jenisKendaraan == 1) {
                    tarif = 3000;
                    tarif = durasi * tarif;
                } else if (jenisKendaraan == 2) {
                    tarif = 2000;
                    tarif = durasi * tarif;
                }        
            }
            total = total + tarif;
        } 
        } while (jenisKendaraan != 0);
        System.out.println("\nProgram selesai!");

        // Output
        System.out.println("\n--- TOTAL PEMBAYARAN PARKIR ---");
        System.out.println("Total pembayaran parkir: Rp " + total);

        input.close();
    }
    
}