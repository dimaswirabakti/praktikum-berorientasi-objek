package pertemuan4;

public class Pegawai {
    String nama;
    String posisi;
    int lamaKerja; // dalam satuan tahun

    public Pegawai(String nama, String posisi, int lamaKerja) {
        this.nama = nama;
        this.posisi = posisi;
        this.lamaKerja = lamaKerja;
    }
    public double ambilSlip() {
        double gajiDasar;
        switch (this.posisi.toLowerCase()) {
            case "manager":
                gajiDasar = 10000000;
                break;
            case "staff":
                gajiDasar = 5000000;
                break;
            case "intern":
                gajiDasar = 2000000;
                break;
            default:
                gajiDasar = 3000000;
        }
        // Asumsi tambahan gaji berdasarkan lama kerja (misal 500k per tahun)
        return gajiDasar + (this.lamaKerja * 500000);
    }
}