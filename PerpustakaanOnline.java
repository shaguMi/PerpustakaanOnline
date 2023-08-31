package Perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;

public class PerpustakaanOnline {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Buku> listBuku = new ArrayList<>();
        listBuku.add(new Novel("Harry Potter"));
        listBuku.add(new Novel("Pride and Prejudice"));
        listBuku.add(new Novel("The Lord of the Rings"));
        listBuku.add(new Novel("One Hundred Years of Solitude"));
        listBuku.add(new Pelajaran("Principles of Economics"));
        listBuku.add(new Pelajaran("Sejarah Indonesia"));
        listBuku.add(new Pelajaran("Matematika"));
        listBuku.add(new Pelajaran("Ilmu Pengetahuan Sosial"));
        listBuku.add(new Skripsi("Analisis Gaya Kepemimpinan"));
        listBuku.add(new Skripsi("Studi Deskriptif"));
        listBuku.add(new Skripsi("Teknologi Blockchain"));
        listBuku.add(new Skripsi("Pengaruh Media Sosial"));

        System.out.println("Daftar Buku di Perpustakaan David:");
        System.out.println("===================================");
        System.out.println(" ");

        for (Buku buku : listBuku) {
                System.out.println("- " + buku.judul + ", Kategori : "+ buku.kategori());
            }

        System.out.println(" ");
        System.out.println("===================================");    
        System.out.print("Pilih buku yang ingin dipinjam: ");
        String judulBuku = input.nextLine();

        Buku bukuTerpilih = null;
        for (Buku buku : listBuku) {
            if (buku.judul.equalsIgnoreCase(judulBuku)) {
                bukuTerpilih = buku;
                break;
            }
        }

        if (bukuTerpilih == null) {
            System.out.println("Buku tidak ditemukan.");
        } else {
            System.out.print("Masukkan berapa hari buku akan dipinjam: ");
            int hariPeminjaman = input.nextInt();

            if (hariPeminjaman <= 0) {
                System.out.println("Hari peminjaman harus lebih dari 0.");
            } else {
                int hariTerlambat = Math.max(hariPeminjaman - bukuTerpilih.batasWaktuPinjam, 0);
                System.out.println("Waktu pengembalian lebih dari 10 hari, maka anda akan dikenakan denda untuk "+hariTerlambat+ " hari");
                double totalDenda = hariTerlambat * bukuTerpilih.dendaPerHari();

                System.out.println("Total denda yang harus dibayar:  Rp" + totalDenda);
                System.out.println("");
            }
        }
        System.out.println("Terima kasih");
        System.out.println("===============================================");
    }
}
