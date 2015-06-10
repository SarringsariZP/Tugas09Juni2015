/**
 * Created by lenovo on 6/10/2015.
 */
public class TestMobil {
    public static void main(String[] args) {
        Author Sarringsari = new Author("Sarringsari","Tuban",'P');
        System.out.println("Semua data : " + Sarringsari.toString());
        Sarringsari.setAlamatPenjual("Jl. Diponegoro, Tuban");
        System.out.println("Alamat Penjual : " + Sarringsari.getAlamatPenjual());
        System.out.println("Nama Penjual : " + Sarringsari.getNamaPenjual());
        System.out.println("Jenis Kelamin : " + Sarringsari.getJenisKelamin());

        Mobil mobilBagus = new Mobil("Jazz",300000000,100,Sarringsari);
        System.out.println(mobilBagus.getPenjual().getNamaPenjual());
        System.out.println(mobilBagus.toString());
    }
}
