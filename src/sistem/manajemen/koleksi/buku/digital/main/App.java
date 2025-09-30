/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem.manajemen.koleksi.buku.digital.main;

import sistem.manajemen.koleksi.buku.digital.service.BukuService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        BukuService service = new BukuService();
        try (Scanner sc = new Scanner(System.in)) {
            int pilih = -1;

            while (pilih != 5) {
                System.out.println("\n=================================================================");
                System.out.println("          Selamat Datang di Sistem Koleksi Buku Digital          ");
                System.out.println("=================================================================");
                System.out.println("1. Tambah Publikasi");
                System.out.println("2. Lihat Koleksi Publikasi");
                System.out.println("3. Hapus Publikasi");
                System.out.println("4. Cari Publikasi");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");

                String line = sc.nextLine().trim();
                try {
                    pilih = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    pilih = -1;
                }

                switch (pilih) {
                    case 1 -> service.tambahBuku();
                    case 2 -> service.lihatBuku();
                    case 3 -> service.hapusBuku();
                    case 4 -> {
                        System.out.println("\nPilih metode pencarian:");
                        System.out.println("1. Berdasarkan Judul");
                        System.out.println("2. Berdasarkan Tahun");
                        System.out.print("Pilihan: ");
                        String sub = sc.nextLine().trim();

                        if (sub.equals("1")) {
                            service.cariBuku(); // cari berdasarkan judul
                        } else if (sub.equals("2")) {
                            System.out.print("Masukkan tahun terbit: ");
                            try {
                                int tahun = Integer.parseInt(sc.nextLine().trim());
                                service.cariBuku(tahun); // cari berdasarkan tahun
                            } catch (NumberFormatException e) {
                                System.out.println("Tahun harus berupa angka.\n");
                            }
                        } else {
                            System.out.println("Pilihan tidak valid.\n");
                        }
                    }
                    case 5 -> System.out.println("Terima kasih - Sampai jumpa!");
                    default -> System.out.println("Pilihan tidak valid!");
                }
            }
        }
    }
}
