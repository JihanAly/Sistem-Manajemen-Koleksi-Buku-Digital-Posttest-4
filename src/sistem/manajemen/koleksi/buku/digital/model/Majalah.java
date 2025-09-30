package sistem.manajemen.koleksi.buku.digital.model;

public class Majalah extends Publikasi implements Cetak {
    private String edisi;

    public Majalah(String judul, String penulis, int tahunTerbit, String edisi) {
        super(judul, penulis, tahunTerbit); // panggil constructor dari Publikasi
        this.edisi = edisi;
    }

    public String getEdisi() {
        return edisi;
    }

    public void setEdisi(String edisi) {
        this.edisi = edisi;
    }

    @Override
    public void tampilkanInfo() {  // Overriding dari Publikasi
        System.out.println("Majalah: " + getJudul() + " | " + getPenulis() +
                           " | " + getTahun() + " | Edisi: " + edisi);
    }

    @Override
    public void cetakRingkas() {  // Implementasi dari interface Cetak
        System.out.println("Majalah - " + getJudul() + " (Edisi: " + edisi + ")");
    }
}
