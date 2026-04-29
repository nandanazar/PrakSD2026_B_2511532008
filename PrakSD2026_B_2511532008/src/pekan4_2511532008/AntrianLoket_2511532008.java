package pekan4_2511532008;

import java.util.*;

public class AntrianLoket_2511532008 {
    String[] queue_2008;
    int front_2008;
    int rear_2008;
    int max_2008;
    public AntrianLoket_2511532008(int kapasitasMaksimal_2008) {
        max_2008 = kapasitasMaksimal_2008;
        queue_2008 = new String[max_2008];
        front_2008 = -1;
        rear_2008 = -1;
    }
    public boolean isEmpty_2008() {
        return front_2008 == -1;
    }
    public boolean isFull_2008() {
        return rear_2008 == max_2008 - 1;
    }
    public void enqueue_2008(String nama_2008) {
        if (isFull_2008()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty_2008()) {
                front_2008 = 0; 
            }
            rear_2008++; 
            queue_2008[rear_2008] = nama_2008;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }
    public void dequeue_2008() {
        if (isEmpty_2008()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_2008[front_2008] + " telah dilayani");
            if (front_2008 == rear_2008) { 
                front_2008 = -1;
                rear_2008 = -1;
            } else {
                front_2008++; 
            }
        }
    }
    public void display_2008() {
        if (isEmpty_2008()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            int nomor_2008 = 1;
            for (int i_2008 = front_2008; i_2008 <= rear_2008; i_2008++) {
                System.out.println(nomor_2008 + ". " + queue_2008[i_2008]);
                nomor_2008++;
            }
        }
    }
    public void Reverse_2008() {
        if (isEmpty_2008()) {
            System.out.println("Antrian kosong!");
            return;
        }
        int i_2008 = front_2008;
        int j_2008 = rear_2008;
        while (i_2008 < j_2008) {
            String temp_2008 = queue_2008[i_2008];
            queue_2008[i_2008] = queue_2008[j_2008];
            queue_2008[j_2008] = temp_2008;
            i_2008++;
            j_2008--;
        }
    }
    public static void main(String[] args) {
        Scanner input_2008 = new Scanner(System.in);
        AntrianLoket_2511532008 loket_2008 = new AntrianLoket_2511532008(10);
        int pilihan_2008;
        do {
            System.out.println("\n=== PROGRAM ANTRIAN LOKET ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Reverse");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan_2008 = input_2008.nextInt();
            input_2008.nextLine(); 
            switch (pilihan_2008) {
                case 1:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama_2008 = input_2008.nextLine();
                    loket_2008.enqueue_2008(nama_2008);
                    break;
                case 2:
                    loket_2008.dequeue_2008();
                    break;
                case 3:
                    loket_2008.display_2008();
                    break;
                case 4:
                    loket_2008.Reverse_2008();
                    loket_2008.display_2008(); 
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka 1-5.");
            }
        } while (pilihan_2008 != 5);
    }
}
