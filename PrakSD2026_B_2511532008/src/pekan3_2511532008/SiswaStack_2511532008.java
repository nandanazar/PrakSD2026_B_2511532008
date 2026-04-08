package pekan3_2511532008;

import java.util.*;

class Siswa_2511532008 {
    String nama;
    int nim;

    public Siswa_2511532008(String nama, int nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public String toString() {
        return "Nim: " + nim + ", Nama: " + nama;
    }
}
public class SiswaStack_2511532008 {
    private ArrayList<Siswa_2511532008> stack;

    public SiswaStack_2511532008() {
        stack = new ArrayList<>();
    }
    public void push(Siswa_2511532008 mhs) {
        stack.add(mhs);
    }
    
    public Siswa_2511532008 pop() {
    	if (!isEmpty()) {
    		return stack.remove(stack.size()-1);
    	}
    	return null;
    }
    public Siswa_2511532008 peek() {
    	if (!isEmpty()) {
    		return stack.get(stack.size()-1);
    	}
    	return null;
    }
    public boolean isEmpty() {
    	return stack.isEmpty();
    }
    public void tampilkanSiswa_2511532008() {
    	for (int i = stack.size()-1; i >= 0; i--) {
    		System.out.println(stack.get(i));
    	}
    }
    public static void main (String[]args) {
    	SiswaStack_2511532008 StudentStack = new SiswaStack_2511532008();
    	
    	Siswa_2511532008 mhs1 = new Siswa_2511532008("Ali", 1);
    	Siswa_2511532008 mhs2 = new Siswa_2511532008("Boby", 2);
    	Siswa_2511532008 mhs3 = new Siswa_2511532008("Charles", 3);
    	Siswa_2511532008 mhs4 = new Siswa_2511532008("Rahmat", 4);
    	
    	StudentStack.push(mhs1);
    	StudentStack.push(mhs2);
    	StudentStack.push(mhs3);
    	StudentStack.push(mhs4);
    	
    	System.out.println("Siswa di dalam Stack ");
    	StudentStack.tampilkanSiswa_2511532008();
    	
    	System.out.println("Siswa teratas " + StudentStack.peek());
    	System.out.println("Mengeluarkan siswa teratas dari stack : " + StudentStack.pop());
    	System.out.println("Daftar siswa setelah di pop : ");
    	StudentStack.tampilkanSiswa_2511532008();
    }
}
