package pertemuan3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Latihan 1 :");
//        latihan1();
//        System.out.println("\n\nLatihan 2 :");
//        latihan2();
//        System.out.println("\n\nLatihan 3 :");
//        latihan3();
//        System.out.println("\n\nLatihan 4 :");
//        latihan4();
//        System.out.println("\n\nLatihan 5 :");
//        latihan5();
//
//        System.out.println("\n\nTugas 1 :");
//        tugas1(scanner);

        System.out.println("\n\nTugas 2 :");
        tugas2(scanner);

        scanner.close();
    }

    public static void latihan1() {
        int limit = 5;
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int j = 1;
        while (j <= limit) {
            System.out.print(j + " ");
            j += 1;
        }
        System.out.println();

        int k = 1;
        do {
            System.out.print(k + " ");
            k += 1;
        } while (k <= limit);
    }

    public static void latihan2() {
        int n = 5;
        int faktorial = 1;

        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        System.out.printf("Hasil faktorial dari %d adalah %d \n", n, faktorial);
    }

    public static void latihan3() {
        char[] arr = {'b', 'a', 'k', 'S', 'o', 'o'};

        StringBuilder bakso = new StringBuilder();
        for (char c : arr) {
            bakso.append(c);
        }
        System.out.println(bakso.toString());
    }

    public static void latihan4() {
        double[] bilangan = new double[20];

        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i + 1;
        }

        for (int i = 0; i < bilangan.length; i++) {
            double angkaAsli = bilangan[i];
            double akar = Math.sqrt(angkaAsli);
            double error = angkaAsli - (akar * akar);

            System.out.println("Akar dari " + angkaAsli + " adalah " + akar);
            System.out.println("Error adalah " + error);
            System.out.println();
        }
    }

    public static void latihan5() {
        int baris = 3;
        int kolom = 4;
        int[][] arr = new int[baris][kolom];
        int flag = 0;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                flag += 1;
                arr[i][j] = flag;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void tugas1(Scanner scanner) {
        System.out.print("Masukkan size array: ");
        // Membaca satu baris penuh. Jika user input "1 2 3", ambil index [0] yaitu "1"
        int size = Integer.parseInt(scanner.nextLine().trim().split("\\s+")[0]);

        int[] arr = new int[size];
        double sum = 0;

        System.out.println("Masukkan angka array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Angka " + (i + 1) + ": ");
            // Membaca input per baris secara konsisten
            arr[i] = Integer.parseInt(scanner.nextLine().trim().split("\\s+")[0]);
            sum += arr[i];
        }

        System.out.print("Final array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double average = sum / size;
        System.out.println("Rata-rata: " + average);

        System.out.print("Angka yang lebih besar dari rata-rata: ");
        boolean hasGreaterThanAvg = false;

        for (int i = 0; i < size; i++) {
            if (arr[i] > average) {
                System.out.print(arr[i] + " ");
                hasGreaterThanAvg = true;
            }
        }

        if (!hasGreaterThanAvg) {
            System.out.print("Tidak ada angka yang lebih besar dari rata-rata.");
        }
        System.out.println();
    }

    public static void tugas2(Scanner scanner) {
        System.out.print("Masukkan ukuran matriks: ");
        // Konsistensi pembacaan input ukuran matriks
        int n = Integer.parseInt(scanner.nextLine().trim().split("\\s+")[0]);

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            boolean barisValid = false;

            while (!barisValid) {
                System.out.print("Masukkan angka untuk baris ke-" + (i + 1) + " (dipisahkan spasi): ");
                String line = scanner.nextLine().trim();

                String[] parts = line.split("\\s+");

                if (parts.length != n) {
                    System.out.println("Jumlah kolom tidak sesuai, silakan masukkan " + n + " buah angka!");
                } else {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = Integer.parseInt(parts[j]);
                    }
                    barisValid = true;
                }
            }
        }

        System.out.println("\nHasil matriks:");
        int max = matrix[0][0];
        int min = matrix[0][0];
        int diagonalSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }

                if (i == j) {
                    diagonalSum += matrix[i][j];
                }
            }
            System.out.println();
        }

        System.out.println("Nilai maksimal adalah: " + max);
        System.out.println("Nilai minimal adalah: " + min);
        System.out.println("Jumlah diagonal utama adalah: " + diagonalSum);
    }
}