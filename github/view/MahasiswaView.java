package view;

import model.Mahasiswa;

import java.util.List;

public class MahasiswaView {
    public void tampilkanMenu() {
        System.out.println("\n=== Pengelolaan Data Organisasi ===");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Semua Mahasiswa");
        System.out.println("3. Hapus Mahasiswa");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
    }

    public void tampilkanMahasiswa(List<Mahasiswa> mahasiswaList) {
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
        } else {
            for (Mahasiswa mahasiswa : mahasiswaList) {
                System.out.println(mahasiswa.tampilkanData());
            }
        }
    }

    public void tampilkanPesan(String message) {
        System.out.println(message);
    }
}
