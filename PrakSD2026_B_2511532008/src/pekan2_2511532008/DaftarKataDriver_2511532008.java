package pekan2_2511532008;

public class DaftarKataDriver_2511532008 {

	public static void main(String[] args) {
		DaftarKata_2511532008 al = new DaftarKata_2511532008();
		
		al.tambah_2511532008("Kami");
		al.tambah_2511532008("Informatika");
		
		al.tambahPada_2511532008 (1, "Mahasiswa");
		
		System.out.println("Awal    : " + al);
		
		al.ubahElemen_2511532008(1, "Departement");
		System.out.println("Setelah Ubah : " + al);
		
		String terhapus = al.hapusElemen_2511532008(0);
		System.out.println("Terhapus : " + terhapus);
		System.out.println("Setelah Hapus : " + al);
		
		System.out.println("Iterasi : ");
		al.iterasiCetak_2511532008();
		System.out.println();
	}

}
