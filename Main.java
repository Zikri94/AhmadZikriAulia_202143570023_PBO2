package AhmadZikriAulia_202143570023_PBO2;

public class Main {
    public static void main(String[] args) {
        PesawatTelepon a = new PesawatTelepon();
        Hewan b = new Hewan();
        Manusia c = new Manusia();

        System.out.println("Manusia: ");
        System.out.println("Bermain: " + c.bermain("Bola"));
        System.out.println("Makan: " + c.makan("Ayam Goreng"));
        c.tidur(true);
        System.out.println("Bekerja: " + c.bekerja("Pegawai"));
        System.out.println("Memasak: " + c.memasak("Makanan"));
        System.out.println("Mencuci: " + c.mencuci("Pakaian"));

        System.out.println("Hewan: ");
        System.out.println("Bermain: " + b.bermain("Bola Benang"));
        System.out.println("Makan: " + b.makan("Ikan"));
        b.tidur(true);

        System.out.println("Telepon: ");
        System.out.println("Menerima Panggilan: " + a.terimaPanggilan("Menerima"));
        System.out.println("Melakukan Panggilan: " + a.melakukan_Panggilan("Memanggil"));

    }

}