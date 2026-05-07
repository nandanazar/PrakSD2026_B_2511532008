package pekan5_2511532008;

public class Pasien_2511532008 {
    private String namaPasien_2008;
    private String keluhan_2008;
    private int nomorAntrian_2008;
    private Pasien_2511532008 next_2008;

    public Pasien_2511532008(String namaPasien_2008, String keluhan_2008, int nomorAntrian_2008) {
        this.namaPasien_2008 = namaPasien_2008;
        this.keluhan_2008 = keluhan_2008;
        this.nomorAntrian_2008 = nomorAntrian_2008;
        this.next_2008 = null;
    }

    public String getNamaPasien_2008() {
        return namaPasien_2008;
    }

    public void setNamaPasien_2008(String namaPasien_2008) {
        this.namaPasien_2008 = namaPasien_2008;
    }

    public String getKeluhan_2008() {
        return keluhan_2008;
    }

    public void setKeluhan_2008(String keluhan_2008) {
        this.keluhan_2008 = keluhan_2008;
    }

    public int getNomorAntrian_2008() {
        return nomorAntrian_2008;
    }

    public void setNomorAntrian_2008(int nomorAntrian_2008) {
        this.nomorAntrian_2008 = nomorAntrian_2008;
    }

    public Pasien_2511532008 getNext_2008() {
        return next_2008;
    }

    public void setNext_2008(Pasien_2511532008 next_2008) {
        this.next_2008 = next_2008;
    }
}