package Perpustakaan;

public class Novel extends Buku {

    public Novel(String judul) {
        super(judul);
    }

    @Override
    public double dendaPerHari()
    {
        return 5000.0;
    }

    @Override
    public String kategori()
    {
        return "Novel";
    }
}