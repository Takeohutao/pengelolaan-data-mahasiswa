package model;

public class Mahasiswa {
    private String nama;
    private int nomorInduk;
    private String jurusan;

    public Mahasiswa(String nama, int nomorInduk, String jurusan) {
        this.nama = nama;
        this.nomorInduk = nomorInduk;
        this.jurusan = jurusan;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public int getNomorInduk() { return nomorInduk; }
    public void setNomorInduk(int nomorInduk) { this.nomorInduk = nomorInduk; }
    public String getJurusan() { return jurusan; }
    public void setJurusan(String jurusan) { this.jurusan = jurusan; }

    public String tampilkanData() {
        return "Nama: " + nama + ", Nomor Induk: " + nomorInduk + ", Jurusan: " + jurusan;
    }
}
