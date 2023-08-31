package Perpustakaan;

public class Pelajaran extends Buku {

    public Pelajaran(String judul) {
        super(judul);
    }

    @Override
    public double dendaPerHari()
    {
        return 2000.0;
    }
    
    @Override
    public String kategori()
    {
        return "Pelajaran";
    }
}
