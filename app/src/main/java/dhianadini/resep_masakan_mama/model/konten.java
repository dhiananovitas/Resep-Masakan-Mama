package dhianadini.resep_masakan_mama.model;

/**
 * Created by LENOVO on 25/12/2018.
 */

public class konten {
    private String judul;
    private String deskripsi;
    private String bahan;
    private String cara;
    private String foto;

    public konten() {
    }

    public konten(String judul, String deskripsi, String bahan, String cara, String foto) {
        super();
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.bahan = bahan;
        this.cara = cara;
        this.foto = foto;
    }

    //getters and setters

    @Override
    public String toString() {
        return "Konten [judul=" + judul + ", deskripsi=" + deskripsi + ", bahan=" + bahan
                + ", cara=" + cara + ", foto=" + foto + "]";
    }
}
