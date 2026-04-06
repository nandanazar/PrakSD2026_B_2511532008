package pekan2_2511532008;
import java.util.*;
public class MahasiswaDriver_2511532008 {

	public static void tampilkanMenu_2511532008() {
		System.out.println("\nMenu : ");
		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Tampilkan Semua Mahasiswa ");
		System.out.println("3. Hapus Mahasiswa Berdasarkan NIM ");
		System.out.println("4. Cari Mahasiswa Berdasarkan NIM ");
		System.out.println("5 Keluar");
	}
	
	
	public static void tambahMahasiswa_2511532008(ArrayList<Mahasiswa_2511532008> list, Scanner sc) {
		System.out.println ("Masukan NIM : ");
		String nim = sc.nextLine();
		System.out.println ("Masukan Nama : ");
		String nama = sc.nextLine();
		System.out.println ("Masukan Prodi : ");
		String prodi = sc.nextLine();
		list.add(new Mahasiswa_2511532008(nim,nama,prodi));
		System.out.println("Mahaiswa berhasil ditambahkan");
	}
	
	public static void tampilkanSemuaMahasiswa_2511532008(ArrayList<Mahasiswa_2511532008>list ) {
		if (list.isEmpty()) {
			System.out.println("Daftar mahasiswa kosong. ");
		} else {
			System.out.println("Data Mahasiswa : ");
			for (Mahasiswa_2511532008 mhs : list) {
				System.out.println(mhs);
			}
		}
	}
	
	public static void hapusMahasiswa_2511532008 (ArrayList<Mahasiswa_2511532008> list, Scanner sc) {
		System.out.println("Masukan NIM yang akan dihapus : ");
		String nimHapus = sc.nextLine();
		boolean remove = list.removeIf(mhs -> mhs.nim.equals(nimHapus));
		
		if (remove) {
			System.out.println("Data dengan NIM " + nimHapus + "berhasil di hapus. ");
		} else {
			System.out.println("NIM Tidak Ditemukan ");
		}
		
	}
	
	public static void cariMahasiswa_2511532008 (ArrayList<Mahasiswa_2511532008> list, Scanner sc) {
		System.out.println("Masukan NIM yang Dicari :");
		String nimCari = sc.nextLine() ;
		boolean ditemukan = false;
		
		for  (Mahasiswa_2511532008 mhs : list) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println("Hasil Pencarian : " + mhs);
				ditemukan = true;
				break;
			}
		}
		if (!ditemukan) {
			System.out.println("Nim Tidak Ada ");
		}
	}
	public static void main(String[] args) { 
        ArrayList<Mahasiswa_2511532008> mahasiswaList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choise;

        do {
            tampilkanMenu_2511532008();
            System.out.print("Pilih menu: ");
            choise = scanner.nextInt();
            scanner.nextLine(); // Consume newLine

            switch (choise) {
                case 1:
                    tambahMahasiswa_2511532008(mahasiswaList, scanner);
                    break;
                case 2:
                    tampilkanSemuaMahasiswa_2511532008(mahasiswaList);
                    break;
                case 3:
                    hapusMahasiswa_2511532008(mahasiswaList, scanner);
                    break;
                case 4:
                    cariMahasiswa_2511532008(mahasiswaList, scanner);
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choise != 5);

        scanner.close();
    }
	
}
