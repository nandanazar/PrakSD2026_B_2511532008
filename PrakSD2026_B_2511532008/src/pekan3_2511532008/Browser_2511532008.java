package pekan3_2511532008;

import java.util.*;

// Kelas Driver
public class Browser_2511532008 {
    public static void main(String[] args) {
        Stack<Website_2511532008> history = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        do {
            System.out.println("=== Browser History NIM: 2511532008 ===");
            System.out.println("1. Kunjungi Website (Push)");
            System.out.println("2. Tombol Back (Pop)");
            System.out.println("3. Lihat Halaman Aktif (Peek)");
            System.out.println("4. Cek Status History");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");

            if (scanner.hasNextInt()) {
                pilihan = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Input tidak valid. Masukkan angka.");
                scanner.nextLine();
                continue;
            }

            switch (pilihan) {
                case 1:
        
                    System.out.print("Masukkan Judul: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan URL: ");
                    String url = scanner.nextLine();
                    
                    history.push(new Website_2511532008(judul, url));
                    System.out.println("Berhasil mengunjungi halaman!");
                    break;

                case 2:
        
                    if (history.isEmpty()) {
                        System.out.println("History kosong! Tidak ada halaman untuk di-back.");
                    } else {
                        Website_2511532008 removedPage = history.pop();
                        System.out.println("Berhasil Back! Meninggalkan halaman: " + removedPage.getJudul_2008());
                    }
                    break;

                case 3:
     
                    if (history.isEmpty()) {
                        System.out.println("Tidak ada halaman yang sedang aktif (History kosong).");
                    } else {
                        Website_2511532008 currentPage = history.peek();
                        System.out.println("=== Halaman Aktif Saat Ini ===");
                        System.out.println("Judul : " + currentPage.getJudul_2008());
                        System.out.println("URL   : " + currentPage.getUrl_2008());
                    }
                    break;

                case 4:
   
                    if (history.isEmpty()) {
                        System.out.println("Status: Riwayat browser saat ini kosong.");
                    } else {
                        System.out.println("Status: Terdapat " + history.size() + " halaman tersimpan dalam riwayat.");
                    }
                    break;

                case 5:
                    System.out.println("Keluar dari browser. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia. Silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}