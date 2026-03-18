package pertemuan5.tugas1;

public class MainTugas1 {
    public static void main(String[] args) {
        System.out.println("=== TEST TUGAS 1: PEGAWAI ===");
        Direktur d1 = new Direktur("Andi", 5);
        Manager m1 = new Manager("Budi", 3);

        System.out.println(d1.getNama() + " (Direktur) - Gaji: Rp" + d1.ambilSlip());
        System.out.println(m1.getNama() + " (Manager) - Gaji: Rp" + m1.ambilSlip());
    }
}