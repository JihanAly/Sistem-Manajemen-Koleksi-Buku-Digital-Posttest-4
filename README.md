# Sistem-Manajemen-Koleksi-Buku-Digital-Posttest-4
**Nama**  : Jihan Alya Naflah  

**NIM**   : 2409116082

**Kelas** : C

# Sistem Manajemen Koleksi Buku Digital
## Deskripsi Singkat
Program ini adalah Sistem Manajemen Koleksi Buku Digital yang dibuat menggunakan bahasa pemrograman Java.
Tujuan program ini adalah untuk membantu pengguna dalam mengelola koleksi buku digital secara sederhana.


## Alur Program
Saat program dijalankan program akan menampilkan menu utama:

1. Tambah Buku
2. Lihat Koleksi Buku
3. Hapus Buku
4. Cari Buku
5. Keluar


Setelah itu jika memilih:
1. Tambah Buku

-User memasukkan judul, penulis, dan tahun terbit.

-User memilih jenis buku 
1. buku Biasa
2. Ebook
3. Majalah

-Data akan disimpan ke dalam koleksi.

2. Lihat Koleksi Buku

-Program menampilkan daftar semua buku yang sudah ditambahkan.

3. Hapus Buku

-Program menampilkan daftar buku dengan nomor urut.

-User memasukkan nomor buku yang ingin dihapus.

-Program akan menghapus data buku tersebut.

4. Cari Buku

-User memasukkan kata kunci (judul).

-Program menampilkan hasil pencarian (jika ada), atau pesan "Buku tidak ditemukan".

5. Keluar

-Jika user memilih keluar, program akan menampilkan pesan perpisahan:
“Terima kasih - Sampai jumpa!.”

Program selesai.






a. Encapsulation

Menggunakan getter dan setter pada class Buku dan turunannya.

b. Inheritance

Buku sebagai superclass

Ebook dan Majalah sebagai subclass.

c. Overriding

Method toString() dioverride di setiap class agar menampilkan informasi yang berbeda sesuai jenis buku.






<img width="1366" height="768" alt="image" src="https://github.com/user-attachments/assets/19f03afb-89dd-4229-96ca-44ef601c756e" />




<img width="1366" height="768" alt="Screenshot (404)" src="https://github.com/user-attachments/assets/98df1e40-1e89-44c1-8a09-84c60fbcc6c0" />










<img width="1366" height="768" alt="Screenshot (403)" src="https://github.com/user-attachments/assets/dcecf66e-1f7c-4496-8c34-a42326f6c54b" />





# Sistem Koleksi Buku Digital

Proyek ini adalah program berbasis Java untuk mengelola koleksi publikasi digital (Buku, Ebook, dan Majalah).  
Program ini memungkinkan pengguna untuk menambah, melihat, mencari, dan menghapus publikasi melalui menu interaktif berbasis console.

---

## ✨ Fitur Utama
1. **Tambah Publikasi** (Buku, Ebook, Majalah).
2. **Lihat Koleksi Publikasi** yang sudah tersimpan.
3. **Hapus Publikasi** berdasarkan nomor urut.
4. **Cari Publikasi**:
   - Berdasarkan **Judul**.
   - Berdasarkan **Tahun**.
5. **Keluar dari program**.

---

## 📌 Penerapan 

### 1. **Abstraction**
- Menggunakan **abstract class** `Publikasi`  
   berisi atribut dasar (`judul`, `penulis`, `tahun`) dan method abstract `tampilkanInfo()`.  
- Menggunakan **interface** `CetakInfo`  
   dimplementasikan oleh kelas turunan (`Buku`, `Ebook`, `Majalah`) untuk menampilkan detail informasi.  

➡️ **Letak:** `Publikasi.java` dan `CetakInfo.java`.

---

### 2. **Polymorphism**
- **Overriding**  
  - Method `tampilkanInfo()` di-*override* oleh kelas turunan (`Buku`, `Ebook`, `Majalah`) agar menampilkan info sesuai jenis publikasi.  
- **Overloading**  
  - Method `cariPublikasi()` pada `ManajemenKoleksi` memiliki dua versi:  
    - `cariPublikasi(String judul)`  
    - `cariPublikasi(int tahun)`

➡️ **Letak:** `Buku.java`, `Ebook.java`, `Majalah.java`, dan `ManajemenKoleksi.java`.

---

### 3. **Nilai Tambah**
- Program ini menggunakan **kombinasi abstract class dan interface** secara bersamaan untuk menerapkan konsep Abstraction.




## ▶️ Contoh Output Program
