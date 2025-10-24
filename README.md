# JOBSHEET 7

# PERCOBAAN 

## - Percobaan 1 : Studi Kasus Nilai Mahasiswa di SIAKAD – Perulangan FOR

_Pertanyaan:_

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!
2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
    ```java 
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
    ```
4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!
5. Commit dan push kode program ke Github

_Jawaban:_

1.  Komponen : Inisialisasi
    Bagian kode : 
    ```java 
    int i = 1
    ```
    Penjelasan : deklarasi dan inisialisasi variabel counter (variabel pengontrol perulangan). Menetapkan nilai awal variabel penghitung i menjadi 1. (Perulangan akan dimulai dari mahasiswa ke-1.)

    Komponen : Kondisi 
    Bagian kode : 
    ```java
    i <= 10
    ```
    Penjelasan : Batas atau syarat agar perulangan tetap dieksekusi. Pada bagian kode tersebut artinya program akan meminta input 10 kali

    Komponen : Increment/Decrement 
    Bagian kode : 
    ```java
    i++
    ``` 
    Penjelasan : Perubahan nilai variabel counter pada setiap putaran perulangan. Setelah satu kali perulangan selesai, nilai i akan bertambah 1. (Misalnya dari 1 → 2 → 3 … hingga 10.)
2.  Nilai tertinggi = 0
    Karena 0 adalah nilai terkecil yang mungkin dimasukkan, jadi jika ada nilai lebih besar dari 0, program bisa mencari mana yang paling tinggi.

    Nilai terendah = 100
    Karena 100 adalah nilai terbesar yang mungkin dimasukkan, jadi jika ada nilai lebih kecil dari 100, program bisa mencari mana yang paling rendah.

    Jika dibalik (tertinggi = 100 dan terendah = 0),
    hasilnya pasti salah, karena:
    - Nilai tertinggi akan selalu 100
    - Nilai terendah akan selalu 0
    Meskipun sebenarnya tidak ada mahasiswa yang nilainya seperti itu.
3.  Kode ini berfungsi untuk membandingkan nilai yang baru dimasukkan dengan nilai tertinggi 
    dan terendah yang sudah ada sebelumnya. Tujuannya untuk mencari nilai tertinggi dan nilai terendah dari semua data yang diinput.

    Alur kerja : 
    1. Setiap kali pengguna memasukkan nilai mahasiswa, program akan memeriksa dua hal:
    a. if (nilai > tertinggi)
    - Memeriksa apakah nilai yang baru dimasukkan lebih tinggi dari nilai tertinggi sebelumnya.
    - Jika ya, berarti ditemukan nilai yang lebih tinggi dan program mengganti nilai tertinggi dengan nilai baru itu.
    Contoh:
    - Sebelumnya nilai tertinggi = 80
    - Input baru nilai = 85
    Karena 85 > 80 maka tertinggi sekarang menjadi 85.

    b. if (nilai < terendah)
    - Memeriksa apakah nilai yang baru dimasukkan lebih rendah dari nilai terendah sebelumnya.
    - Jika ya, berarti ditemukan nilai yang lebih rendah dan program mengganti nilai terendah dengan nilai baru itu.
    Contoh:
    - Sebelumnya nilai terendah = 70
    - Input baru nilai = 65
    Karena 65 < 70 maka terendah sekarang menjadi 65.

    2. Setelah semua nilai dimasukkan (perulangan selesai), variabel tertinggi berisi nilai paling tinggi, dan terendah berisi nilai paling rendah dari seluruh data yang diinputkan. 
4. ```java
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
    ``` 


     


