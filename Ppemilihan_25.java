import java.util.Scanner;

public class Ppemilihan_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        int tugas = scanner.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int kuis = scanner.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = scanner.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int uas = scanner.nextInt();

        if (!isValid(tugas) || !isValid(kuis) || !isValid(uts) || !isValid(uas)) {
            System.out.println("Nilai tidak valid");
        } else {
            
            double nilaiAkhir = hitungNilaiAkhir(tugas, kuis, uts, uas);
        
            System.out.println("Nilai akhir: " + nilaiAkhir);

            String nilaiHuruf = konversiNilaiHuruf(nilaiAkhir);
        
            System.out.println("Nilai huruf: " + nilaiHuruf);

    
            String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E") ? "TIDAK LULUS" : "LULUS";
        
            System.out.println("Keterangan: " + keterangan);
        }

        scanner.close();
    }

    
    public static boolean isValid(int nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    
    public static double hitungNilaiAkhir(int tugas, int kuis, int uts, int uas) {
        return 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.4 * uas;
    }

    public static String konversiNilaiHuruf(double nilaiAkhir) {
        if (nilaiAkhir >= 100) {
            return "A";
        } else if (nilaiAkhir >= 73) {
            return "B+";
        } else if (nilaiAkhir >= 65) {
            return "B";
        } else if (nilaiAkhir >= 60) {
            return "C+";
        } else if (nilaiAkhir >= 50) {
            return "C";
        } else if (nilaiAkhir >= 39) {  
            return "D";
        } else if (nilaiAkhir <= 39) {
            return "E";
        } else {
            return "D";
        }
    }
}
