package pertemuan4;

public class Main {
    public static void main(String[] args) {
        System.out.println("----->>> Latihan Nomor 2: ScoreManager <<<-----");
        ScoreManager sm = new ScoreManager();
        sm.addScore(85.5);
        sm.addScore(90.0);
        sm.addScore(78.5);

        System.out.println("Total Nilai: " + sm.getTotalScore());
        System.out.println("Rata-rata: " + sm.getAverageScore());
        System.out.println("Nilai Tertinggi: " + sm.getHighestScore());
        System.out.println("Selisih Max-Min: " + sm.getScoreDifference());

        System.out.println("\n----->>> Tugas 1: Kantor & Pegawai <<<-----");
        Kantor kantor = new Kantor();
        Pegawai p1 = new Pegawai("Andi", "Manager", 5);
        Pegawai p2 = new Pegawai("Budi", "Staff", 2);
        Pegawai p3 = new Pegawai("Citra", "Intern", 0);

        kantor.tambahPegawai(p1);
        kantor.tambahPegawai(p2);
        kantor.tambahPegawai(p3);

        kantor.cetakDaftarNamaPegawai();
        System.out.println("Total Gaji Kantor: Rp" + kantor.getJumlahGaji());
        System.out.println("Rata-rata Gaji: Rp" + kantor.getRataRataGaji());

        System.out.println("\n(Memecat Citra...)");
        kantor.pecatPegawai(p3);
        System.out.println("Jumlah Pegawai Sekarang: " + kantor.getJumlahPegawai());

        System.out.println("\n----->>> Tugas 2: RunningTracker <<<-----");
        RunningTracker rt = new RunningTracker();
        rt.addDistance(5.2);
        rt.addDistance(3.1);
        rt.addDistance(10.5);

        System.out.println("Total Jarak Lari: " + rt.getTotalDistance() + " km");
        System.out.println("Rata-rata Jarak: " + rt.getAverageDistance() + " km");
        System.out.println("Jarak Terjauh: " + rt.getLongestDistance() + " km");
        System.out.println("Selisih Jarak: " + rt.getDistanceDifference() + " km");
    }
}