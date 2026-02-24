package pertemuan2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lanjut;
        Scanner obj_input = new Scanner(System.in);
        do {
            System.out.println("\nProgram yang tersedia:");
            System.out.println("\t1. Menghitung Volume Balok");
            System.out.println("\t2. Menghitung Luas Segitiga");
            System.out.println("\t3. Konversi Satuan Galon ke Liter");
            System.out.print("Pilih program : ");
            int pilihan = obj_input.nextInt();

            switch (pilihan) {
                case 1:
                    print_judul_program("Hitung Volume Balok");
                    System.out.print("> Masukan panjang : ");
                    int p_balok = obj_input.nextInt();
                    System.out.print("> Masukan lebar : ");
                    int l_balok = obj_input.nextInt();
                    System.out.print("> Masukan tinggi : ");
                    int t_balok = obj_input.nextInt();

                    int hasil_volume_balok = p_balok * l_balok * t_balok;
                    System.out.println("\nVolume balok dengan panjang=" + p_balok + ", lebar=" + l_balok
                            + ", dan tinggi=" + t_balok + " adalah " + hasil_volume_balok);
                    break;
                case 2:
                    print_judul_program("Hitung Luas Segitiga");
                    System.out.print("> Masukan alas : ");
                    int alas = obj_input.nextInt();
                    System.out.print("> Masukan tinggi : ");
                    int tinggi = obj_input.nextInt();

                    double hasil_luas_segitiga = 0.5 * alas * tinggi;
                    System.out.printf("\nLuas segitiga dengan alas=%d dan tinggi=%d adalah %.2f\n",
                            alas, tinggi, hasil_luas_segitiga);
                    break;
                case 3:
                    print_judul_program("Konversi Satuan Galon ke Liter");
                    System.out.print("> 1 galon = 3.7854 liter. Masukan jumlah galon : ");
                    int jumlah_galon = obj_input.nextInt();

                    double hasil_konversi = jumlah_galon * 3.7854;
                    System.out.printf("\nHasil konversi: %d galon setara dengan %.2f liter.\n", jumlah_galon, hasil_konversi);
                    break;
                default:
                    System.out.println("\n\tERROR, hanya tersedia program 1, 2, atau 3. Mohon coba lagi.\n");
            }

            obj_input.nextLine();
            System.out.print("\n>>> Coba lagi? (y/n): ");
            lanjut = obj_input.nextLine();
        } while (lanjut.equals("y") || lanjut.equals("yes"));
        obj_input.close();

        System.out.println();
        print_judul_program("TERIMA KASIH");
    }

    static void print_judul_program(String program_pilihan) {
        System.out.println("\t==============================>");
        System.out.println("\t==>  " + program_pilihan);
        System.out.println("\t==============================>");
    }
}