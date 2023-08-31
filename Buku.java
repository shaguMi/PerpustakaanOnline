package Perpustakaan;

public class Buku {
    String judul;
    String penulis;
    final int batasWaktuPinjam = 10;


    public Buku(String judul) {
        this.judul = judul; 
    }

    protected double dendaPerHari()
    {
        return 0.0;
    }

    protected String kategori()
   {
    return "";
   } 
}
