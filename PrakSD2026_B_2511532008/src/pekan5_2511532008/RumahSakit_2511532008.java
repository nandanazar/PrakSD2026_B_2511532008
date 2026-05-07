package pekan5_2511532008;

import java.util.*;

public class RumahSakit_2511532008 {
    private Pasien_2511532008 head_2008;
    private int counter_2008 = 1;
    private int jumlahPasien_2008 = 0;

    public void daftarkanPasien_2008(String nama, String keluhan) {
        Pasien_2511532008 pasienBaru_2008 = new Pasien_2511532008(nama, keluhan, counter_2008);
        if (head_2008 == null) {
            head_2008 = pasienBaru_2008;
        } else {
            Pasien_2511532008 temp_2008 = head_2008;
            while (temp_2008.getNext_2008() != null) {
                temp_2008 = temp_2008.getNext_2008();
            }
            temp_2008.setNext_2008(pasienBaru_2008);
        }
        System.out.println("Pasien berhasil didaftarkan! Nomor Antrian: " + counter_2008);
        counter_2008++;
        jumlahPasien_2008++;
    }

    public void panggilPasien_2008() {
        if (head_2008 == null) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Memanggil Pasien...");
            System.out.println("Nama: " + head_2008.getNamaPasien_2008());
            System.out.println("Nomor Antrian: " + head_2008.getNomorAntrian_2008());
            head_2008 = head_2008.getNext_2008();
            jumlahPasien_2008--;
        }
    }

    public void tampilkanAntrian_2008() {
        if (head_2008 == null) {
            System.out.println("Antrian saat ini kosong.");
        } else {
            Pasien_2511532008 current_2008 = head_2008;
            System.out.println("--- Daftar Antrian Pasien ---");
            while (current_2008 != null) {
                System.out.println("[" + current_2008.getNomorAntrian_2008() + "] " + 
                                   current_2008.getNamaPasien_2008() + " - " + 
                                   current_2008.getKeluhan_2008());
                current_2008 = current_2008.getNext_2008();
            }
        }
    }

    public void cariPasien_2008(String namaCari_2008) {
        Pasien_2511532008 current_2008 = head_2008;
        boolean ditemukan_2008 = false;
        int posisi_2008 = 1;

        while (current_2008 != null) {
            if (current_2008.getNamaPasien_2008().equalsIgnoreCase(namaCari_2008)) {
                System.out.println("Pasien ditemukan!");
                System.out.println("Nama: " + current_2008.getNamaPasien_2008());
                System.out.println("Nomor Antrian: " + current_2008.getNomorAntrian_2008());
                System.out.println("Urutan dalam antrian: " + posisi_2008);
                ditemukan_2008 = true;
                break;
            }
            current_2008 = current_2008.getNext_2008();
            posisi_2008++;
        }

        if (!ditemukan_2008) {
            System.out.println("Pasien dengan nama '" + namaCari_2008 + "' tidak ditemukan.");
        }
    }

    public void cekStatusAntrian_2008() {
        System.out.println("Total pasien dalam antrian: " + jumlahPasien_2008);
        if (head_2008 != null) {
            System.out.println("Pasien terdepan: " + head_2008.getNamaPasien_2008() + 
                               " (No: " + head_2008.getNomorAntrian_2008() + ")");
        } else {
            System.out.println("Tidak ada pasien di barisan depan.");
        }
    }

    public static void main(String[] args) {
        RumahSakit_2511532008 rs_2008 = new RumahSakit_2511532008();
        Scanner input_2008 = new Scanner(System.in);
        int pilihan_2008;

        do {
            System.out.println("\n=== Antrian Rumah Sakit NIM: 2511532008 ===");
            System.out.println("1. Daftarkan Pasien (Insert)");
            System.out.println("2. Panggil Pasien (Delete Head)");
            System.out.println("3. Tampilkan Antrian (Display)");
            System.out.println("4. Cari Pasien (Search)");
            System.out.println("5. Cek Status Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2008 = input_2008.nextInt();
            input_2008.nextLine();

            switch (pilihan_2008) {
                case 1:
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama_2008 = input_2008.nextLine();
                    System.out.print("Masukkan Keluhan: ");
                    String keluhan_2008 = input_2008.nextLine();
                    rs_2008.daftarkanPasien_2008(nama_2008, keluhan_2008);
                    break;
                case 2:
                    rs_2008.panggilPasien_2008();
                    break;
                case 3:
                    rs_2008.tampilkanAntrian_2008();
                    break;
                case 4:
                    System.out.print("Masukkan Nama Pasien yang dicari: ");
                    String cari_2008 = input_2008.nextLine();
                    rs_2008.cariPasien_2008(cari_2008);
                    break;
                case 5:
                    rs_2008.cekStatusAntrian_2008();
                    break;
                case 6:
                    System.out.println("Program Selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_2008 != 6);
        input_2008.close();
    }
}
