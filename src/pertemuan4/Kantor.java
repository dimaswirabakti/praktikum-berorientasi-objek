package pertemuan4;

import java.util.ArrayList;
import java.util.List;

public class Kantor {
    private List<Pegawai> daftarPegawai;

    public Kantor() {
        this.daftarPegawai = new ArrayList<>();
    }
    public void tambahPegawai(Pegawai pegawai) {
        this.daftarPegawai.add(pegawai);
    }
    public void pecatPegawai(Pegawai pegawai) {
        this.daftarPegawai.remove(pegawai);
    }
    public int getJumlahPegawai() {
        return this.daftarPegawai.size();
    }
    public double getJumlahGaji() {
        double total = 0;
        for (Pegawai p : daftarPegawai) {
            total += p.ambilSlip();
        }
        return total;
    }
    public double getRataRataGaji() {
        if (daftarPegawai.isEmpty()) return 0;
        return getJumlahGaji() / getJumlahPegawai();
    }
    // Method opsional tambahan untuk membuktikan fitur list nama pegawai
    public void cetakDaftarNamaPegawai() {
        System.out.println("Daftar Pegawai Kantor:");
        for (Pegawai p : daftarPegawai) {
            System.out.println("- " + p.nama + " (" + p.posisi + ")");
        }
    }
}