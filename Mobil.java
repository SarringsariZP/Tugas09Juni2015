/**
 * Created by lenovo on 6/10/2015.
 */
public class Mobil {
    private String namaMobil;
    private int hargaMobil;
    private int jumlahStok;
    private Author Penjual;

    public Mobil(String namaMobil, int hargaMobil, int jumlahStok, Author Penjual) {
        this.namaMobil = namaMobil;
        this.hargaMobil = hargaMobil;
        this.jumlahStok = jumlahStok;
        this.Penjual = Penjual;
    }

    public String getNamaMobil() {
        return namaMobil;
    }

    public void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }

    public int getHargaMobil() {
        return hargaMobil;
    }

    public void setHargaMobil(int hargaMobil) {
        this.hargaMobil = hargaMobil;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public Author getPenjual() {
        return Penjual;
    }

    public void setPenjual(Author Penjual) {
        this.Penjual = Penjual;
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "namaMobil='" + namaMobil + '\'' +
                ", hargaMobil=" + hargaMobil +
                ", jumlahStok=" + jumlahStok +
                ", Penjual=" + Penjual +
                '}';
    }
}
