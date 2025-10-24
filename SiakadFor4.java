import java.util.Scanner;

public class SiakadFor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel 
        double nilai, tertinggi = 0, terendah = 100;
        // Variabel untuk menghitung jumlah 
        int lulus = 0, tidakLulus = 0;

        // Perulangan FOR 
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            // Memeriksa kelulusan 
            if (nilai >= 60) {
                lulus++;  // Menambahkan 1 pada jumlah lulus
            } else {
                tidakLulus++; // Menambahkan 1 pada jumlah tidak lulus 
            }
            }
            // Output 
            System.out.println("\n--- Hasil Akhir ---");
            System.out.println("Nilai tertinggi: " + tertinggi);
            System.out.println("Nilai terendah: " + terendah);
            System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
            System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidakLulus);

            sc.close();
        }
    }

    
