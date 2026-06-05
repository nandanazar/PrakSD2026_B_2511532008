package pekan8_2511532008;

import java.util.Scanner;

//Kelas Lagu Sederhana
class Lagu {
 String judul;
 String penyanyi;
 int durasi;

 public Lagu(String judul, String penyanyi, int durasi) {
     this.judul = judul;
     this.penyanyi = penyanyi;
     this.durasi = durasi;
 }
}
//Kelas Utama menggunakan NIM Lengkap
public class Sorting_2511532008 {
 // Array untuk menyimpan maksimal 20 lagu
 private Lagu[] dataLagu_2008 = new Lagu[20];
 private int jumlahLagu_2008 = 0;

 // Method untuk mengisi data awal oleh user (Minimal 7 lagu)
 public void inputData_2008() {
     Scanner scanner = new Scanner(System.in);
     System.out.println("=== Input Data Lagu (Minimal 7, Maksimal 20) ===");
     
     while (jumlahLagu_2008 < 20) {
         System.out.print("\nMasukkan judul lagu (atau ketik 'selesai' jika sudah min. 7 lagu): ");
         String judul = scanner.nextLine();
         
         if (judul.equalsIgnoreCase("selesai")) {
             if (jumlahLagu_2008 < 7) {
                 System.out.println("Gagal selesai. Anda harus memasukkan minimal " + (7 - jumlahLagu_2008) + " lagu lagi.");
                 continue;
             }
             break;
         }
         System.out.print("Masukkan nama penyanyi: ");
         String penyanyi = scanner.nextLine();
         System.out.print("Masukkan durasi (detik): ");
         int durasi = scanner.nextInt();
         scanner.nextLine(); // Membersihkan buffer
         dataLagu_2008[jumlahLagu_2008] = new Lagu(judul, penyanyi, durasi);
         jumlahLagu_2008++;
     }
 }
 // Method utama Merge Sort (Membagi array)
 public void mergeSort_2008(Lagu[] arr, int kiri, int kanan) {
     if (kiri < kanan) {
         int tengah = kiri + (kanan - kiri) / 2;
         // Bagian rekursif membelah array
         mergeSort_2008(arr, kiri, tengah);
         mergeSort_2008(arr, tengah + 1, kanan);
         // Menggabungkan kembali secara urut
         merge_2008(arr, kiri, tengah, kanan);
     }
 }
 // Method pembantu untuk menggabungkan dua subarray secara urut (Berdasarkan Judul A-Z)
 private void merge_2008(Lagu[] arr, int kiri, int tengah, int kanan) {
     int n1 = tengah - kiri + 1;
     int n2 = kanan - tengah;
     // Array temporer
     Lagu[] L = new Lagu[n1];
     Lagu[] R = new Lagu[n2];
     for (int i = 0; i < n1; ++i) L[i] = arr[kiri + i];
     for (int j = 0; j < n2; ++j) R[j] = arr[tengah + 1 + j];
     int i = 0, j = 0;
     int k = kiri;
     // Bandingkan string judul menggunakan compareToIgnoreCase untuk urutan A-Z
     while (i < n1 && j < n2) {
         if (L[i].judul.compareToIgnoreCase(R[j].judul) <= 0) {
             arr[k] = L[i];
             i++;
         } else {
             arr[k] = R[j];
             j++;
         }
         k++;
     }
     // Salin sisa elemen jika ada
     while (i < n1) {
         arr[k] = L[i];
         i++;
         k++;
     }
     while (j < n2) {
         arr[k] = R[j];
         j++;
         k++;
     }
 }
 // Method untuk menampilkan data sebelum dan sesudah sorting
 public void tampilData_2008(String status) {
     System.out.println("\nData " + status + ":");
     for (int i = 0; i < jumlahLagu_2008; i++) {
         System.out.println((i + 1) + ". " + dataLagu_2008[i].judul + " - " + dataLagu_2008[i].penyanyi + " (" + dataLagu_2008[i].durasi + " detik)");
     }
 }
 // Main Method
 public static void main(String[] args) {
     Sorting_2511532008 program = new Sorting_2511532008();
     Scanner input = new Scanner(System.in);
     // 1. Input data lagu oleh user
     program.inputData_2008();
     System.out.println("\n=== Sorting Playlist NIM: 2511532008 ===");
     System.out.print("Pilih Algoritma (1=Shell, 2=Quick, 3=Merge): ");
     int pilihan = input.nextInt();

     if (pilihan == 3) {
         // Tampilkan sebelum diurutkan
         program.tampilData_2008("Sebelum Sorting");

         // Eksekusi Merge Sort berdasarkan Judul (A-Z)
         program.mergeSort_2008(program.dataLagu_2008, 0, program.jumlahLagu_2008 - 1);

         // Tampilkan setelah diurutkan
         program.tampilData_2008("Setelah Merge Sort (Judul A-Z)");
     } else {
         System.out.println("Algoritma tersebut tidak diimplementasikan. Program ini khusus Merge Sort (Pilihan 3).");
     }
     
     input.close();
 }
}