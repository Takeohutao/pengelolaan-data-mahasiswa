package controller;

import model.Mahasiswa;
import model.MahasiswaService;
import view.MahasiswaView;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MahasiswaController {
    private MahasiswaService mahasiswaService;
    private MahasiswaView mahasiswaView;

    public MahasiswaController(MahasiswaService mahasiswaService, MahasiswaView mahasiswaView) {
        this.mahasiswaService = mahasiswaService;
        this.mahasiswaView = mahasiswaView;
    }

    public void tambahMahasiswa(Scanner scanner) {
        System.out.println("=== Tambah Data Mahasiswa ===");
        System.out.print("Nama: ");
        String nama = scanner.next();

        int nomorInduk = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Nomor Induk : ");
            try {
                nomorInduk = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input salah! Masukkan Nomor Induk berupa angka.");
                scanner.next();
            }
        }

        System.out.print("Jurusan: ");
        String jurusan = scanner.next();

        Mahasiswa mahasiswa = new Mahasiswa(nama, nomorInduk, jurusan);
        mahasiswaService.tambahMahasiswa(mahasiswa);
        mahasiswaView.tampilkanPesan("Data mahasiswa berhasil ditambahkan!");
    }

    public void tampilkanSemuaMahasiswa() {
        mahasiswaView.tampilkanMahasiswa(mahasiswaService.getSemuaMahasiswa());
    }

    public void hapusMahasiswa(Scanner scanner) {
        int nomorInduk = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Masukkan Nomor Induk (angka): ");
            try {
                nomorInduk = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Input salah! Masukkan Nomor Induk berupa angka.");
                scanner.next();
            }
        }

        if (mahasiswaService.hapusMahasiswa(nomorInduk)) {
            mahasiswaView.tampilkanPesan("Data mahasiswa berhasil dihapus!");
        } else {
            mahasiswaView.tampilkanPesan("Data mahasiswa tidak ditemukan.");
        }
    }
}
