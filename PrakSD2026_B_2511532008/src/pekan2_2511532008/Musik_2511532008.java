package pekan2_2511532008;

//KELAS ADT

public class Musik_2511532008 {
 private String JudulLagu_2008;
 private String Penyanyi_2008;
 private int Durasi_2008;

 public Musik_2511532008(String JudulLagu, String Penyanyi, int Durasi) {
     this.JudulLagu_2008 = JudulLagu;
     this.Penyanyi_2008= Penyanyi;
     this.Durasi_2008 = Durasi;
 }   
 public void setJudul(String JudulLaguBaru) {
     this.JudulLagu_2008 = JudulLaguBaru;
 }
 public String getJudul () {
     return this.JudulLagu_2008; 
 }
 public void setPenyanyi (String PenyanyiBaru) {
     this.Penyanyi_2008 = PenyanyiBaru;
 }
 public String getPenyanyi (){
     return this.Penyanyi_2008;
 }
 public void setDurasi (int DurasiBaru) {
     this.Durasi_2008 = DurasiBaru;
 }
 public int getDurasi (){
     return this.Durasi_2008;
 }
}