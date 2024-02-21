import java.util.Scanner;

public class Tugas2_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Silakan pilih rumus yang ingin dihitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("4. Keluar");

            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Terima kasih");
                break;
            }

            switch (choice) {
                case 1:
                    hitungKecepatan(scanner);
                    break;
                case 2:
                    hitungJarak(scanner);
                    break;
                case 3:
                    hitungWaktu(scanner);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
        scanner.close();
    }

    public static void hitungKecepatan(Scanner scanner) {
        System.out.print("Masukkan jarak (km): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double t = scanner.nextDouble();

        if (t != 0) {
            double v = s / t;
            System.out.println("Kecepatan adalah: " + v + " km/jam");
        } else {
            System.out.println("Waktu tidak boleh nol.");
        }
    }

    public static void hitungJarak(Scanner scanner) {
        System.out.print("Masukkan kecepatan (km/jam): ");
        double v = scanner.nextDouble();
        System.out.print("Masukkan waktu (jam): ");
        double t = scanner.nextDouble();

        double s = v * t;
        System.out.println("Jarak adalah: " + s + " km");
    }

    public static void hitungWaktu(Scanner scanner) {
        System.out.print("Masukkan jarak (km): ");
        double s = scanner.nextDouble();
        System.out.print("Masukkan kecepatan (km/jam): ");
        double v = scanner.nextDouble();

        if (v != 0) {
            double t = s / v;
            System.out.println("Waktu adalah: " + t + " jam");
        } else {
            System.out.println("Kecepatan tidak boleh nol.");
        }
    }
}
