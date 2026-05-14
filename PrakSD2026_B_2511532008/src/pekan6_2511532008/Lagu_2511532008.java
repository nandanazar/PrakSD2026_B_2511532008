package pekan6_2511532008;

public class Lagu_2511532008 {
    private String judul_2008;
    private String penyanyi_2008;
    Lagu_2511532008 next_2008;
    Lagu_2511532008 prev_2008;

    public Lagu_2511532008(String judul_2008, String penyanyi_2008) {
        this.judul_2008 = judul_2008;
        this.penyanyi_2008 = penyanyi_2008;
        this.next_2008 = null;
        this.prev_2008 = null;
    }

    public String getJudul_2008() {
        return judul_2008;
    }

    public void setJudul_2008(String judul_2008) {
        this.judul_2008 = judul_2008;
    }

    public String getPenyanyi_2008() {
        return penyanyi_2008;
    }

    public void setPenyanyi_2008(String penyanyi_2008) {
        this.penyanyi_2008 = penyanyi_2008;
    }
}




