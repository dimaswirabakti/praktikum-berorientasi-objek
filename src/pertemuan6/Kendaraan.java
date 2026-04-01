package pertemuan6;

public abstract class Kendaraan implements BiayaParkir {
    private String platNomor;
    private String jenis;
    private int waktuMasuk;

    public Kendaraan(String platNomor, String jenis, int waktuMasuk) {
        this.platNomor = platNomor;
        this.jenis = jenis;
        this.waktuMasuk = waktuMasuk;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getJenis() {
        return jenis;
    }

    public int getWaktuMasuk() {
        return waktuMasuk;
    }
}