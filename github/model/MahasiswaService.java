package model;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaService {
    private List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public List<Mahasiswa> getSemuaMahasiswa() {
        return daftarMahasiswa;
    }

    public boolean hapusMahasiswa(int nomorInduk) {
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNomorInduk() == nomorInduk) {
                daftarMahasiswa.remove(mahasiswa);
                return true;
            }
        }
        return false;
    }
}
