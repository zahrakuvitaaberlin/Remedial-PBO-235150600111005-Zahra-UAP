import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void mulai() {
        System.out.print("Lama waktu masa tanam (bulan) : ");
        int nilaiInput = in.nextInt();
        int hasil = nilaiInput * 30;

        for (int i = 0; i < 3; i++) {
            menanam();
        }

        System.out.println("Proses Perkembangan Tanaman");

        for (int i = 0; i < 3; i++) {
            if (Data.tanamans.get(i).getStatus().equalsIgnoreCase("Hidup")) {
                Data.tanamans.get(i).berkembang();
            } else if (Data.lokasi.contains(i)) {
                continue;
            } else {
                Class tanamanMati = Data.tanamans.get(i).getClass();
                String nama = tanamanMati.getSimpleName();
                System.out.println("Tanaman " + nama + " sudah mati");
                Data.lokasi.add(i);
                menanam();
            }
        }
    }

    public static void menanam() {
        System.out.println("\nPilih tanaman yang ingin ditanam:");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        System.out.print("Pilihan Anda: ");
        int tanam = in.nextInt();
        switch (tanam) {
            case 1:
                tanamans.add(new Tomat());
                System.out.println("Berhasil menanam Tomat");
                break;
            case 2:
                tanamans.add(new Stroberi());
                System.out.println("Berhasil menanam Stroberi");
                break;
            case 3:
                tanamans.add(new Persik());
                System.out.println("Berhasil menanam Persik");
                break;
        }
    }

    public static void info() {
        for (int i = 0; i < Data.tanamans.size(); i++) {
            System.out.println("Tanaman " + (i + 1) + " ");
            System.out.println(Data.tanamans.get(i).toString());
        }
    }
}

