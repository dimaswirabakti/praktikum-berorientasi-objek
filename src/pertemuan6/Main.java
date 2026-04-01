package pertemuan6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input jumlah maksimal slot parkir
        System.out.print("Masukkan jumlah maksimal slot parkir: ");
        int kapasitas = scanner.nextInt();
        SistemParkir sistem = new SistemParkir(kapasitas);

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=====>>> MENU UTAMA <<<=====");
            System.out.println("1. Lihat Status Parkir");
            System.out.println("2. Tambah Kendaraan");
            System.out.println("3. Pindah Kendaraan");
            System.out.println("4. Keluar Kendaraan");
            System.out.println("5. Exit");
            System.out.print("Pilih menu (1-5): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    sistem.lihatStatus();
                    break;
                case 2:
                    System.out.print("Masukan plat nomor: ");
                    String plat = scanner.nextLine();
                    System.out.print("Masukan jenis kendaraan (Mobil/Motor): ");
                    String jenis = scanner.nextLine();
                    System.out.print("Masukan waktu masuk (jam, misal 10): ");
                    int waktuMasuk = scanner.nextInt();
                    System.out.print("Pilih nomor slot parkir: ");
                    int slotTambah = scanner.nextInt();

                    Kendaraan kBaru;
                    if (jenis.equalsIgnoreCase("Mobil")) {
                        kBaru = new Mobil(plat, waktuMasuk);
                    } else if (jenis.equalsIgnoreCase("Motor")) {
                        kBaru = new Motor(plat, waktuMasuk);
                    } else {
                        System.out.println("Error: Jenis kendaraan tidak valid.");
                        break;
                    }
                    sistem.tambahKendaraan(kBaru, slotTambah);
                    break;
                case 3:
                    System.out.print("Masukan nomor slot asal: ");
                    int slotAsal = scanner.nextInt();
                    System.out.print("Masukan nomor slot tujuan: ");
                    int slotTujuan = scanner.nextInt();
                    sistem.pindahKendaraan(slotAsal, slotTujuan);
                    break;
                case 4:
                    System.out.print("Masukan plat nomor kendaraan keluar: ");
                    String platKeluar = scanner.nextLine();
                    System.out.print("Masukan waktu keluar (jam, misal 14): ");
                    int waktuKeluar = scanner.nextInt();
                    sistem.keluarKendaraan(platKeluar, waktuKeluar);
                    break;
                case 5:
                    sistem.cetakLaporanAkhir();
                    berjalan = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
        scanner.close();
    }
}