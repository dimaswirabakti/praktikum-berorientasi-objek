package pertemuan7;

public class Main {
    public static void main(String[] args) {
        System.out.println("---->>>>>> SISTEM MANAJEMEN KARYAWAN <<<<<<----\n");

        // Instansiasi Objek (Urutan masuk menentukan NIK)
        // Urutan 1: Manager Pusat
        Manager m1 = new Manager("Dimas", 12000000, 'L', "Pusat");
        // Urutan 2: Salesman (Target Tercapai)
        Salesman s1 = new Salesman("Siti", 5000000, 'P', 100, 150);
        // Urutan 3: Karyawan Biasa
        KaryawanBiasa k1 = new KaryawanBiasa("Agus", 4500000, 'L');
        // Urutan 4: Manager Cabang
        Manager m2 = new Manager("Rina", 10000000, 'P', "Cabang");
        // Urutan 5: Salesman (Target Tidak Tercapai)
        Salesman s2 = new Salesman("Budi", 5000000, 'L', 100, 80);

        // Testing Method untuk Cuti
        // Menambah cuti via parameter angka (tambahan manual)
        k1.tambahCuti(5); // Agus tambah 5 hari

        // Menambah cuti via parameter string (tipe cuti)
        m1.tambahCuti("Pernikahan"); // Dimas (L) menikah -> +2 hari
        s1.tambahCuti("Persalinan"); // Siti (P) melahirkan -> +90 hari
        m2.tambahCuti("Persalinan"); // Rina (P) melahirkan -> +90 hari
        s2.tambahCuti("Persalinan"); // Budi (L) menemani istri -> +3 hari

        // Output
        m1.displayInfo();
        s1.displayInfo();
        k1.displayInfo();
        m2.displayInfo();
        s2.displayInfo();
    }
}