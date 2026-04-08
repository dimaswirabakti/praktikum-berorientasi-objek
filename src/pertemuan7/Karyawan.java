package pertemuan7;

public abstract class Karyawan {
    protected String nama;
    protected double gaji;
    protected String nik;
    protected int jumlahCuti;
    protected char jenisKelamin; // 'L' untuk Laki-laki, 'P' untuk Perempuan

    // Variabel static untuk melacak urutan masuk seluruh karyawan
    private static int urutanMasukTotal = 0;

    public Karyawan(String nama, double gaji, char jenisKelamin, String prefixJabatan) {
        this.nama = nama;
        this.gaji = gaji;
        this.jenisKelamin = jenisKelamin;
        this.jumlahCuti = 12;

        urutanMasukTotal++;
        // NIK digabungkan dari huruf prefix (K, M, atau S) dan nomor urut masuk
        this.nik = prefixJabatan + urutanMasukTotal;
    }

    // Abstract method: implementasi detailnya wajib ditulis oleh subclass
    public abstract double getTHR();

    // Polymorphism (overloading), penambahan cuti dengan angka langsung
    public void tambahCuti(int tambahanHari) {
        this.jumlahCuti += tambahanHari;
    }

    // Polymorphism (overloading), penambahan cuti dengan tipe cuti (String)
    public void tambahCuti(String tipeCuti) {
        if (tipeCuti.equalsIgnoreCase("Pernikahan")) {
            this.jumlahCuti += 2;
        } else if (tipeCuti.equalsIgnoreCase("Persalinan")) {
            if (this.jenisKelamin == 'P' || this.jenisKelamin == 'p') {
                this.jumlahCuti += 90;
            } else if (this.jenisKelamin == 'L' || this.jenisKelamin == 'l') {
                this.jumlahCuti += 3;
            }
        } else {
            System.out.println("Tipe cuti tidak dikenali.");
        }
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("NIK\t\t\t: " + this.nik);
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Gaji\t\t: Rp" + String.format("%,.0f", this.gaji));
        System.out.println("Sisa Cuti\t: " + this.jumlahCuti + " hari");
        System.out.println("Total THR\t: Rp" + String.format("%,.0f", this.getTHR()));
        System.out.println("=========================================================\n");
    }
}