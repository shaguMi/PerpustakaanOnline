package Perpustakaan;

public class Skripsi extends Buku {

    public Skripsi(String judul) {
        super(judul);
    }

    @Override
    public double dendaPerHari()
    {
        return 10000.0;
    }

    @Override
    public String kategori()
    {
        return "Skripsi";
    }
}
