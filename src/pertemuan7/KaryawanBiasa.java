package pertemuan7;

public class KaryawanBiasa extends Karyawan {

    public KaryawanBiasa(String nama, double gaji, char jenisKelamin) {
        // Meneruskan data ke konstruktor induk dengan prefix "K"
        super(nama, gaji, jenisKelamin, "K");
    }

    @Override
    public double getTHR() {
        // Ketentuan karyawan biasa, THR sejumlah 1 kali gaji
        return this.gaji;
    }

    @Override
    public void displayInfo() {
        System.out.println("Jabatan\t\t: Karyawan Biasa");
        super.displayInfo();
    }
}