package pertemuan6;

public class SistemParkir {
    private Kendaraan[] slotParkir;
    private int kendaraanKeluarCount;
    private double totalPendapatan;

    public SistemParkir(int kapasitas) {
        this.slotParkir = new Kendaraan[kapasitas];
        this.kendaraanKeluarCount = 0;
        this.totalPendapatan = 0.0;
    }

    // Menu 1
    public void lihatStatus() {
        System.out.println("\n----->>> Status Parkir <<<-----");
        for (int i = 0; i < slotParkir.length; i++) {
            if (slotParkir[i] == null) {
                System.out.println("Slot " + i + ": [KOSONG]");
            } else {
                Kendaraan k = slotParkir[i];
                System.out.println("Slot " + i + ": " + k.getPlatNomor() + " | " +
                        k.getJenis() + " | Waktu Masuk: " + k.getWaktuMasuk());
            }
        }
    }

    // Menu 2
    public void tambahKendaraan(Kendaraan kendaraan, int slot) {
        if (slot < 0 || slot >= slotParkir.length) {
            System.out.println("Error: Slot di luar jangkauan.");
            return;
        }
        if (slotParkir[slot] != null) {
            System.out.println("Error: Slot parkir sudah terisi.");
            return;
        }
        if (!isPenempatanValid(kendaraan.getJenis(), slot)) {
            System.out.println("Error: Mobil harus ditempatkan di indeks yang lebih besar dibandingkan Motor.");
            return;
        }

        slotParkir[slot] = kendaraan;
        System.out.println("Kendaraan berhasil diparkir di slot " + slot + ".");
    }

    // Menu 3
    public void pindahKendaraan(int slotAsal, int slotTujuan) {
        if (slotAsal < 0 || slotAsal >= slotParkir.length || slotTujuan < 0 || slotTujuan >= slotParkir.length) {
            System.out.println("Error: Indeks slot tidak valid.");
            return;
        }
        if (slotParkir[slotAsal] == null) {
            System.out.println("Error: Tidak ada kendaraan di slot asal.");
            return;
        }
        if (slotParkir[slotTujuan] != null) {
            System.out.println("Error: Slot tujuan tidak kosong.");
            return;
        }

        Kendaraan k = slotParkir[slotAsal];
        if (!isPenempatanValid(k.getJenis(), slotTujuan)) {
            System.out.println("Error: Validasi gagal. Mobil tidak boleh ditempatkan di bawah Motor jika ada Motor di slot sebelumnya.");
            return;
        }

        slotParkir[slotTujuan] = k;
        slotParkir[slotAsal] = null;
        System.out.println("Kendaraan berhasil dipindah dari slot " + slotAsal + " ke slot " + slotTujuan + ".");
    }

    // Menu 4
    public void keluarKendaraan(String platNomor, int waktuKeluar) {
        for (int i = 0; i < slotParkir.length; i++) {
            if (slotParkir[i] != null && slotParkir[i].getPlatNomor().equalsIgnoreCase(platNomor)) {
                Kendaraan k = slotParkir[i];
                double biaya = k.hitungBiayaParkir(waktuKeluar);

                slotParkir[i] = null;
                kendaraanKeluarCount++;
                totalPendapatan += biaya;

                System.out.println("Kendaraan berhasil keluar. Total biaya: Rp" + (long) biaya);
                return;
            }
        }
        System.out.println("Error: Kendaraan dengan plat nomor " + platNomor + " tidak ditemukan.");
    }

    // Menu 5 (exit)
    public void cetakLaporanAkhir() {
        if (kendaraanKeluarCount == 0) {
            System.out.println("Parkiran sepi hari ini, semoga besok lebih ramai");
        } else {
            System.out.println("\n----->>> Laporan Akhir <<<-----");
            System.out.println("Jumlah kendaraan keluar: " + kendaraanKeluarCount);
            System.out.println("Total pendapatan parkir: Rp" + (long) totalPendapatan);
        }
    }

    // Metode validasi penempatan
    private boolean isPenempatanValid(String jenisKendaraan, int targetSlot) {
        for (int i = 0; i < slotParkir.length; i++) {
            if (slotParkir[i] != null) {
                if (jenisKendaraan.equalsIgnoreCase("Mobil")) {
                    // Mobil tidak boleh ditempatkan di indeks yang <= indeks Motor
                    if (slotParkir[i].getJenis().equalsIgnoreCase("Motor") && i > targetSlot) {
                        return false;
                    }
                } else if (jenisKendaraan.equalsIgnoreCase("Motor")) {
                    // Motor tidak boleh ditempatkan di indeks yang >= indeks Mobil
                    if (slotParkir[i].getJenis().equalsIgnoreCase("Mobil") && i < targetSlot) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}