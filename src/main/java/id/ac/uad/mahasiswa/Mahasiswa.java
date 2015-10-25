package id.ac.uad.mahasiswa;

/**
 * Created by kipli on 25/10/15.
 */
public class Mahasiswa {
    private int nim;
    private String name;
    private int nilaiUas;
    private int nilaiUts;
    private int nilaiTugas;

    public Mahasiswa(){

    }

    public Mahasiswa(int nim, String name, int nilaiUas, int nilaiUts, int nilaiTugas) {
        this.nim = nim;
        this.name = name;
        this.nilaiUas = nilaiUas;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(int nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public int getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(int nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

}
