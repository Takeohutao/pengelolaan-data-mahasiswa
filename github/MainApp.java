import controller.MahasiswaController;
import java.util.Scanner;
import model.MahasiswaService;
import view.MahasiswaView;

public class MainApp {
    public static void main(String[] args) {
        MahasiswaService mahasiswaService = new MahasiswaService();
        MahasiswaView mahasiswaView = new MahasiswaView();
        MahasiswaController mahasiswaController = new MahasiswaController(mahasiswaService, mahasiswaView);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mahasiswaView.tampilkanMenu();
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    mahasiswaController.tambahMahasiswa(scanner);
                    break;
                case 2:
                    mahasiswaController.tampilkanSemuaMahasiswa();
                    break;
                case 3:
                    mahasiswaController.hapusMahasiswa(scanner);
                    break;
                case 4:
                    mahasiswaView.tampilkanPesan("Keluar dari aplikasi...");
                    return;
                default:
                    mahasiswaView.tampilkanPesan("Pilihan tidak valid.");
            }
        }
    }
}