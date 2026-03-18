package pertemuan5.tugas1;

public class Pegawai {
    protected String nama;
    protected int lamaKerja;
    protected double gajiDasar;

    public Pegawai(String nama, int lamaKerja, double gajiDasar) {
        this.nama = nama;
        this.lamaKerja = lamaKerja;
        this.gajiDasar = gajiDasar;
    }

    public double ambilSlip() {
        return this.gajiDasar + (this.lamaKerja * 500000);
    }

    public String getNama() {
        return this.nama;
    }
}