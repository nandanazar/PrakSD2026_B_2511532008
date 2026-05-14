package pekan6_2511532008;
import java.util.*;

public class Musik_2511532008 {
    private Lagu_2511532008 head_2008;
    private Lagu_2511532008 tail_2008;
    public void tambahLagu_2008(String judul_2008, String penyanyi_2008) {
        Lagu_2511532008 laguBaru_2008 = new Lagu_2511532008(judul_2008, penyanyi_2008);
        if (head_2008 == null) {
            head_2008 = tail_2008 = laguBaru_2008;
        } else {
            tail_2008.next_2008 = laguBaru_2008;
            laguBaru_2008.prev_2008 = tail_2008;
            tail_2008 = laguBaru_2008;
        }
        System.out.println("Lagu berhasil ditambahkan!");
    }
    public void hapusLaguAwal_2008() {
        if (head_2008 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        if (head_2008 == tail_2008) {
            head_2008 = tail_2008 = null;
        } else {
            head_2008 = head_2008.next_2008;
            head_2008.prev_2008 = null;
        }
        System.out.println("Lagu pertama berhasil dihapus!");
    }
    public void tampilMaju_2008() {
        if (head_2008 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511532008 temp_2008 = head_2008;
        System.out.println("=== Daftar Lagu (Maju) ===");
        while (temp_2008 != null) {
            System.out.println("- " + temp_2008.getJudul_2008() + " (" + temp_2008.getPenyanyi_2008() + ")");
            temp_2008 = temp_2008.next_2008;
        }
    }
    public void tampilMundur_2008() {
        if (tail_2008 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511532008 temp_2008 = tail_2008;
        System.out.println("=== Daftar Lagu (Mundur) ===");
        while (temp_2008 != null) {
            System.out.println("- " + temp_2008.getJudul_2008() + " (" + temp_2008.getPenyanyi_2008() + ")");
            temp_2008 = temp_2008.prev_2008;
        }
    }    
    public void cariLagu_2008(String cari_2008) {
        if (head_2008 == null) {
            System.out.println("Playlist kosong!");
            return;
        }
        Lagu_2511532008 temp_2008 = head_2008;
        boolean ketemu_2008 = false;
        while (temp_2008 != null) {
            if (temp_2008.getJudul_2008().equalsIgnoreCase(cari_2008)) {
                System.out.println("Lagu ditemukan: " + temp_2008.getJudul_2008() + 
                		" oleh " + temp_2008.getPenyanyi_2008());
                ketemu_2008 = true;
                break;
            }
            temp_2008 = temp_2008.next_2008;
        }
        if (!ketemu_2008) {
            System.out.println("Lagu tidak ditemukan.");
        }
        
    }
    public static void main(String[] args) {
        Scanner input_2008 = new Scanner(System.in);
        Musik_2511532008 playlist_2008 = new Musik_2511532008();
        int pilihan_2008;

        do {
            System.out.println("=== Playlist Musik NIM: 2511532008 ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Hapus Lagu Pertama");
            System.out.println("3. Lihat Playlist (Maju)");
            System.out.println("4. Lihat Playlist (Mundur)");
            System.out.println("5. Cari Lagu");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            pilihan_2008 = input_2008.nextInt();
            input_2008.nextLine();

            switch (pilihan_2008) {
                case 1:
                    System.out.print("Judul: ");
                    String judul_2008 = input_2008.nextLine();
                    System.out.print("Penyanyi: ");
                    String penyanyi_2008 = input_2008.nextLine();
                    playlist_2008.tambahLagu_2008(judul_2008, penyanyi_2008);
                    break;
                case 2:
                    playlist_2008.hapusLaguAwal_2008();
                    break;
                case 3:
                    playlist_2008.tampilMaju_2008();
                    break;
                case 4:
                    playlist_2008.tampilMundur_2008();
                    break;
                case 5:
                    System.out.print("Masukkan Judul yang dicari: ");
                    String cari_2008 = input_2008.nextLine();
                    playlist_2008.cariLagu_2008(cari_2008);
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan_2008 != 6);
        
        

    }
}