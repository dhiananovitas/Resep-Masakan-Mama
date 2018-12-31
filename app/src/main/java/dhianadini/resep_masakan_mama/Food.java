package dhianadini.resep_masakan_mama;

public class Food {
    public String judul;
    public String deskripsi;
    public String bahan;
    public String cara;
    public int foto;

    public Food(){

    }

    public Food(String judul, String deskripsi, String bahan, String cara, int foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.bahan = bahan;
        this.cara = cara;
        this.foto = foto;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getBahan() {
        return bahan;
    }

    public String getCara() {
        return cara;
    }

    public int getFoto() {
        return foto;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public void setCara(String cara) {
        this.cara = cara;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}