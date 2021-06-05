package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws  ParseException {

        String polaTanggal= "dd-MM-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(polaTanggal);

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.npm = "19630579";
        mahasiswa.nama = "Norvanryan Royansyah";
        mahasiswa.tanggalLahir = simpleDateFormat.parse("09-09-2009");

        System.out.println("Nama \t\t\t : " +  mahasiswa.nama);
        System.out.println("Npm \t\t\t : " +  mahasiswa.npm);
        System.out.println("Tanggal Lahir \t : " +  mahasiswa.tanggalLahir);

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.npm = "20000000";
        mahasiswa2.nama = "Lol";
        mahasiswa2.tanggalLahir = simpleDateFormat.parse("08-08-2008");

        System.out.println("Nama \t\t\t : " +  mahasiswa2.nama);
        System.out.println("Npm \t\t\t : " +  mahasiswa2.npm);
        System.out.println("Tanggal Lahir \t : " +  mahasiswa2.tanggalLahir);

    }
}
