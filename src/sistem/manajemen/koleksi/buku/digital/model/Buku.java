package sistem.manajemen.koleksi.buku.digital.model;

public class Buku extends Publikasi implements Cetak {
    private String genre; // atribut tambahan khusus Buku

    // Constructor lengkap (judul, penulis, tahun, genre)
    public Buku(String judul, String penulis, int tahun, String genre) {
        super(judul, penulis, tahun); // panggil constructor Publikasi
        this.genre = genre;
    }

    // Constructor tanpa genre (default = "Umum")
    public Buku(String judul, String penulis, int tahun) {
        super(judul, penulis, tahun);
        this.genre = "Umum"; // kasih nilai default biar gak null
    }

    // Getter & Setter tambahan
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    // Override dari Publikasi
    @Override
    public void tampilkanInfo() {
        System.out.println("Buku: " + getJudul() + 
                           " | Penulis: " + getPenulis() + 
                           " | Tahun: " + getTahun() +
                           " | Genre: " + genre);
    }

    // Implementasi dari Cetak (Interface)
    @Override
    public void cetakRingkas() {
        System.out.println(getJudul() + " (" + getTahun() + ")");
    }

    // Override toString untuk mempermudah print
    @Override
    public String toString() {
        return getJudul() + " | " + getPenulis() + " | " + getTahun() + " | " + genre;
    }
}
