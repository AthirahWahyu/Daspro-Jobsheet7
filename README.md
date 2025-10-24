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
