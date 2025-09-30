/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.manajemen.koleksi.buku.digital.model;

public class Ebook extends Publikasi implements Cetak {
    private double ukuranFile; // MB

    public Ebook(String judul, String penulis, int tahunTerbit, double ukuranFile) {
        super(judul, penulis, tahunTerbit); // panggil constructor Publikasi
        this.ukuranFile = ukuranFile;
    }

    public double getUkuranFile() { return ukuranFile; }
    public void setUkuranFile(double ukuranFile) { this.ukuranFile = ukuranFile; }

    @Override
    public void tampilkanInfo() {  // Overriding dari Publikasi
        System.out.println("Ebook: " + getJudul() + " | " + getPenulis() +
                           " | " + getTahun() + " | Ukuran: " + ukuranFile + " MB");
    }

    @Override
    public void cetakRingkas() {  // Implementasi dari interface Cetak
        System.out.println("Ebook - " + getJudul() + " (" + getTahun() + ")");
    }
}
