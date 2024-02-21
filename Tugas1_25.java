import java.util.Scanner;

public class Tugas1_25 {
    public static void main(String[] args) {
        String[] KODE = {"A", "B", "D", "E", "F", "G", "H", "L", "N", "T"};
        String[][] KOTA = {
            {"A", "Banten"},
            {"B", "Jakarta"},
            {"D", "Bandung"},
            {"E", "Cirebon"},
            {"F", "Bogor"},
            {"G", "Pekalongan"},
            {"H", "Semarang"},
            {"L", "Surabaya"},
            {"N", "Malang"},
            {"T", "Tegal"},
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        String kodeCari = scanner.next();

        String namaKota = cariNamaKota(kodeCari, KODE, KOTA);
        if (namaKota != null) {
            System.out.println("Kota yang sesuai dengan kode plat " + kodeCari + " adalah: " + namaKota);
        } else {
            System.out.println("Kode plat tidak ditemukan");
        }
    }

    public static String cariNamaKota(String kode, String[] KODE, String[][] KOTA) {
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i].equals(kode)) {
                return KOTA[i][1];
            }
        }
        return null;
    }
}
