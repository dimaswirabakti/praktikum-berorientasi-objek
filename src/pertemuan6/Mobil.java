package pertemuan6;

public class Mobil extends Kendaraan {
    private static final double TARIF_PER_JAM = 5000.0;

    public Mobil(String platNomor, int waktuMasuk) {
        super(platNomor, "Mobil", waktuMasuk);
    }

    @Override
    public double hitungBiayaParkir(int waktuKeluar) {
        int lamaParkir = waktuKeluar - getWaktuMasuk();
        if (lamaParkir <= 0) lamaParkir = 1; // Asumsi minimum 1 jam jika keluar di jam yang sama
        return lamaParkir * TARIF_PER_JAM;
    }
}