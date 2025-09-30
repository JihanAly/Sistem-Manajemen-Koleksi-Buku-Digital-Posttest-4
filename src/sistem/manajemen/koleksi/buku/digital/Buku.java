/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.manajemen.koleksi.buku.digital;



/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Buku {
    private final ArrayList<String> koleksi = new ArrayList<>();
    private final Scanner input = new Scanner(System.in);

    public void menu() {
        int pilihan;
        do {
            System.out.println("\n=================================================================");
            System.out.println("          Selamat Datang di Sistem Koleksi Buku Digital            ");
            System.out.println("=================================================================");
            System.out.println("                      Silahkan Pilih Menu                          ");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Koleksi Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Kembali / Keluar");
            System.out.print(" Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // biar buffer bersih

            switch (pilihan) {
                case 1 -> tambahBuku();
                case 2 -> lihatBuku();
                case 3 -> hapusBuku();
                case 4 -> keluarAtauKembali();
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (true);
    }

    private void tambahBuku() {
        System.out.print("Masukkan judul buku: ");
        String judul = input.nextLine();
        koleksi.add(judul);
        System.out.println("Buku berhasil ditambahkan!");
    }

    private void lihatBuku() {
        if (koleksi.isEmpty()) {
            System.out.println("Koleksi buku masih kosong.");
        } else {
            System.out.println("\nDaftar Koleksi Buku:");
            for (int i = 0; i < koleksi.size(); i++) {
                System.out.println((i + 1) + ". " + koleksi.get(i));
            }
        }
    }

    private void hapusBuku() {
        lihatBuku();
        if (!koleksi.isEmpty()) {
            System.out.print("Masukkan nomor buku yang ingin dihapus: ");
            int nomor = input.nextInt();
            input.nextLine(); // bersihin buffer
            if (nomor > 0 && nomor <= koleksi.size()) {
                koleksi.remove(nomor - 1);
                System.out.println("Buku berhasil dihapus!");
            } else {
                System.out.println("Nomor tidak valid.");
            }
        }
    }

    private void keluarAtauKembali() {
        System.out.println("\nTerima kasih, Koleksi bukumu aman terkendali.");
        System.out.println("Tekan ENTER untuk keluar program.");
        System.out.println("Atau ketik apapun untuk kembali ke menu.");

        String pilihan = input.nextLine();
        if (pilihan.isEmpty()) {
            System.out.println("Program selesai. Sampai jumpa!");
            System.exit(0); // keluar dari program
        }
        // kalau user ketik sesuatu → balik ke menu
    }
}