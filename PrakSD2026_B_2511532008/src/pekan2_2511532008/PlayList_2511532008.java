package pekan2_2511532008;

//KELAS DRIVER

import java.util.*;
public class PlayList_2511532008 {
 static boolean runner_2008 = true; 
 static Scanner inputUser_2008 = new Scanner(System.in);
 static ArrayList <Musik_2511532008> PlayList = new ArrayList<>();

 public static void hapusPlaylist_2008() {
     if (PlayList.isEmpty()) {
         System.out.println("List Memang Sudah Kosong");
     }
     else {
         System.out.println("Masukan Nomor Playlist yang ingin di hapus : ");
         int nomor = inputUser_2008.nextInt();
         inputUser_2008.nextLine();
         if (nomor > 0 && nomor <= PlayList.size()) { 
             PlayList.remove(nomor -1);
             System.out.println("Playlist berhasil di hapus");
             System.out.println(" ");
         }
     }
 }
 public static void tambahPlayist_2008 () {
     System.out.print("Masukan Judul Lagu   : ");
     String Judul_2008 = inputUser_2008.nextLine();

     System.out.print("Masukan Penyanyi     : ");
     String Penyanyi_2008 = inputUser_2008.nextLine();

     System.out.print("Masukan Durasi(Detik): ");
     int Durasi_2008 = inputUser_2008.nextInt();
     inputUser_2008.nextLine();

     Musik_2511532008 PlayListBaru = new Musik_2511532008(Judul_2008, Penyanyi_2008, Durasi_2008);
     PlayList.add(PlayListBaru);
     System.out.println(" ");    
     System.out.println("Lagu Telah Berhasil diMasukan ! ");
 }

 public static void tampilkanPlaylist_2008(){
     if (PlayList.isEmpty()) {
         System.out.println("Playlist anda Kosong ");
     }
     else {
         System.out.println("Daftar lagu di playlist saat ini : ");
         for (int i = 0; i < PlayList.size(); i++) {
             Musik_2511532008 Lagu = PlayList.get(i);
             System.out.println((i+1) + ". Judul    :" + Lagu.getJudul());
             System.out.println(" . Penyanyi :" + Lagu.getPenyanyi());
             System.out.println(" . Durasi   :" + Lagu.getDurasi());
             System.out.println(" ");
         }
         System.out.println(" ");
     }
 }
 public static void main(String[] args) {
 while (runner_2008) {
     System.out.println("+===+ PlayList Musik NIM : 2511532008 +===+");
     System.out.println("1. Tambah Lagu ");
     System.out.println("2. Lihat Playlist ");
     System.out.println("3. Hapus Lagu ");
     System.out.println("4. Keluar ");
     System.out.print("Masukan Pilihan (1-4) : ");
     int InputINT = inputUser_2008.nextInt();
     inputUser_2008.nextLine();

     switch (InputINT) {
         case 1:
             tambahPlayist_2008();
             break;
         case 2:
             tampilkanPlaylist_2008();
             break;
         case 3:
             hapusPlaylist_2008();
             break;
         case 4:
             System.exit(0);
         default:
             System.out.println("Angka tidak Valid!");
             System.exit(0);
     }
 }
 }
}
