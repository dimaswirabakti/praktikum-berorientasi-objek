package pertemuan7;

public class Manager extends Karyawan {
    private String lokasiKantor;
    public Manager(String nama, double gaji, char jenisKelamin, String lokasiKantor) {
        // Meneruskan data ke konstruktor induk dengan prefix "M"
        super(nama, gaji, jenisKelamin, "M");
        this.lokasiKantor = lokasiKantor;
    }
    @Override
    public double getTHR() {
        double thrDasar = 2 * this.gaji;
        // Ketentuan soal, THR berdasarkan lokasi kantor
        if (this.lokasiKantor.equalsIgnoreCase("Pusat")) {
            return thrDasar + this.gaji; // Ditambah satu kali gaji
        } else if (this.lokasiKantor.equalsIgnoreCase("Cabang")) {
            return thrDasar + (0.5 * this.gaji); // Ditambah setengah gaji
        } else {
            return thrDasar;
        }
    }
    @Override
    public void displayInfo() {
        System.out.println("Jabatan\t\t: Manager (" + this.lokasiKantor + ")");
        super.displayInfo();
    }
}