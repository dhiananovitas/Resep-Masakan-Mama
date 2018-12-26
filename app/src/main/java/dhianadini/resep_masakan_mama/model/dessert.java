package dhianadini.resep_masakan_mama.model;

import java.io.Serializable;

/**
 * Created by LENOVO on 25/12/2018.
 */

public class dessert implements Serializable {
    public String judul;
    public String deskripsi;
    public String bahan;
    public String cara;
    public String foto;

    public dessert(String judul, String deskripsi, String bahan, String cara, String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.bahan = bahan;
        this.cara = cara;
        this.foto = foto;
    }

}