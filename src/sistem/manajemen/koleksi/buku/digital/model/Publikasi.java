/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.manajemen.koleksi.buku.digital.model;

/**
 *
 * @author Asus
 */

public abstract class Publikasi {
    private String judul;
    private String penulis;
    private int tahun;

    public Publikasi(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    // Getter dan Setter (Encapsulation)
    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getPenulis() { return penulis; }
    public void setPenulis(String penulis) { this.penulis = penulis; }

    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    // Abstract method → wajib dioverride oleh subclass
    public abstract void tampilkanInfo();
}

