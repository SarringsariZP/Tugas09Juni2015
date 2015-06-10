/**
 * Created by lenovo on 6/10/2015.
 */
public class Author {
    private String namaPenjual;
    private String alamatPenjual;
    private char jenisKelamin;

    public Author(String namaPenjual, String alamatPenjual, char jenisKelamin) {
        this.namaPenjual = namaPenjual;
        this.alamatPenjual = alamatPenjual;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getAlamatPenjual() {
        return alamatPenjual;
    }

    public void setAlamatPenjual(String alamatPenjual) {
        this.alamatPenjual = alamatPenjual;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "Author{" +
                "namaPenjual='" + namaPenjual + '\'' +
                ", alamatPenjual='" + alamatPenjual + '\'' +
                ", jenisKelamin=" + jenisKelamin +
                '}';
    }
}

