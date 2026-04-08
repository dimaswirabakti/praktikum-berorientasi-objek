package pertemuan7;

public class Salesman extends Karyawan {
    private double targetPenjualan;
    private double realisasiPenjualan;
    public Salesman(String nama, double gaji, char jenisKelamin, double targetPenjualan, double realisasiPenjualan) {
        // Meneruskan data ke konstruktor induk dengan prefix "S"
        super(nama, gaji, jenisKelamin, "S");
        this.targetPenjualan = targetPenjualan;
        this.realisasiPenjualan = realisasiPenjualan;
    }
    @Override
    public double getTHR() {
        // Ketentuan soal, jika realisasi >= target, THR 2x gaji. Jika tidak, 1x gaji.
        if (this.realisasiPenjualan >= this.targetPenjualan) {
            return 2 * this.gaji;
        } else {
            return this.gaji;
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Jabatan\t\t: Salesman");
        super.displayInfo();
    }
}