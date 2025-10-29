import java.util.Scanner;

public class Bioskop4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi Variabel 
        int hargaTiket = 50000;
        int jumlahTiket;
        double diskon;
        double totalHargaTiket = 0;
        int totalTiket = 0;
        double totalPenjualan = 0;
        String pilihan = "iya";

        do {
        System.out.println("--- PENJUALAN TIKET BIOSKOP ---");
        System.out.print("Masukkan jumlah tiket : ");
        jumlahTiket = input.nextInt();
        input.nextLine();

            if (jumlahTiket <= 0) {
                System.out.println("Input jumlah tiket tidak valid!");
                continue;
            }
            
            if (jumlahTiket > 10) {
                diskon = 0.15;
                totalHargaTiket = jumlahTiket * hargaTiket * (1 - diskon);
            } else if (jumlahTiket > 4) {
                diskon = 0.1;
                totalHargaTiket = jumlahTiket * hargaTiket * (1 - diskon);
            } else { 
                diskon = 0;
                totalHargaTiket = jumlahTiket * hargaTiket;
            }

            totalPenjualan = totalPenjualan + totalHargaTiket;
            totalTiket = totalTiket + jumlahTiket;

            System.out.println("\n--- JUMLAH TIKET YANG DIBELI ---");
            System.out.printf("Jumlah tiket yang dibeli :  %d", jumlahTiket);
            System.out.printf("\nDiskon : %.0f%%\n", diskon * 100);
            System.out.println("\n--- TOTAL HARGA YANG HARUS DIBAYARKAN ---");
            System.out.printf("Total harga tiket yang harus dibayarkan : Rp. %.0f\n", totalHargaTiket);

            // Validasi apakah ada pembelian tiket lagi 
            System.out.print("Apakah ada pembelian tiket lagi ? (iya/tidak) : ");
            pilihan = input.nextLine();

        } while (pilihan.equalsIgnoreCase("iya"));

            // Output 
            System.out.println("\n--- Hasil Penjualan hari ini ---");
            System.out.println("Total tiket yang terjual : " + totalTiket);
            System.out.printf("Total penjualan tiket dalam satu hari : Rp. %.0f" , totalPenjualan);

            input.close();
        }
        
    }
