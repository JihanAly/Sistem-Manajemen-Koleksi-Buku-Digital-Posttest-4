package sistem.manajemen.koleksi.buku.digital.service;

import sistem.manajemen.koleksi.buku.digital.model.*; // biar ga ribet import satu²
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BukuService {
    private final List<Publikasi> koleksi = new ArrayList<>(); // ganti ke Publikasi
    private final Scanner input = new Scanner(System.in);

    public void tambahBuku() {
        System.out.print("Masukkan judul publikasi: ");
        String judul = input.nextLine().trim();
        System.out.print("Masukkan penulis: ");
        String penulis = input.nextLine().trim();
        int tahun = readInt("Masukkan tahun terbit: ");

        System.out.println("Pilih jenis publikasi:");
        System.out.println("1. Buku");
        System.out.println("2. Ebook");
        System.out.println("3. Majalah");
        int jenis = readInt("Pilihan: ");

        Publikasi publikasiBaru;
        switch (jenis) {
            case 2 -> {
                double ukuran = readDouble("Masukkan ukuran file (MB): ");
                publikasiBaru = new Ebook(judul, penulis, tahun, ukuran);
            }
            case 3 -> {
                System.out.print("Masukkan edisi majalah: ");
                String edisi = input.nextLine().trim();
                publikasiBaru = new Majalah(judul, penulis, tahun, edisi);
            }
            default -> publikasiBaru = new Buku(judul, penulis, tahun);
        }

        koleksi.add(publikasiBaru);
        System.out.println("Publikasi berhasil ditambahkan!\n");
    }

    public void lihatBuku() {
        if (koleksi.isEmpty()) {
            System.out.println("Koleksi masih kosong.\n");
            return;
        }
        System.out.println("\nDaftar Koleksi Publikasi:");
        for (int i = 0; i < koleksi.size(); i++) {
            System.out.print((i + 1) + ". ");
            koleksi.get(i).tampilkanInfo(); // polymorphism kepake disini
        }
        System.out.println();
    }

    public void hapusBuku() {
        lihatBuku();
        if (koleksi.isEmpty()) return;
        int nomor = readInt("Masukkan nomor publikasi yang ingin dihapus: ");
        if (nomor > 0 && nomor <= koleksi.size()) {
            Publikasi removed = koleksi.remove(nomor - 1);
            System.out.println("Publikasi \"" + removed.getJudul() + "\" berhasil dihapus.\n");
        } else {
            System.out.println("Nomor tidak valid.\n");
        }
    }

    public void cariBuku() {
        System.out.print("Masukkan kata kunci judul: ");
        String kw = input.nextLine().trim().toLowerCase();
        boolean found = false;
        for (Publikasi p : koleksi) {
            if (p.getJudul().toLowerCase().contains(kw)) {
                System.out.print("Ditemukan: ");
                p.tampilkanInfo(); // pake polymorphism
                found = true;
            }
        }
        if (!found) System.out.println("Publikasi tidak ditemukan.\n");
        else System.out.println();
    }

    private int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = input.nextLine().trim();
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Input harus angka. Coba lagi.");
            }
        }
    }

    private double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = input.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Input harus angka desimal. Coba lagi.");
            }
        }
    }
    
    // Overloading: cari berdasarkan tahun
public void cariBuku(int tahun) {
    boolean found = false;
    for (Publikasi p : koleksi) {
        if (p.getTahun() == tahun) {
            System.out.print("Ditemukan: ");
            p.tampilkanInfo();
            found = true;
        }
    }
    if (!found) System.out.println("Tidak ada publikasi di tahun " + tahun + "\n");
    else System.out.println();
}

}
