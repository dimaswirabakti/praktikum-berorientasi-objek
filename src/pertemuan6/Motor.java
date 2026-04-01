package pertemuan6;

public class Motor extends Kendaraan {
    private static final double TARIF_PER_JAM = 2000.0;

    public Motor(String platNomor, int waktuMasuk) {
        super(platNomor, "Motor", waktuMasuk);
    }

    @Override
    public double hitungBiayaParkir(int waktuKeluar) {
        int lamaParkir = waktuKeluar - getWaktuMasuk();
        if (lamaParkir <= 0) lamaParkir = 1;
        return lamaParkir * TARIF_PER_JAM;
    }
}