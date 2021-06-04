public class Main {
    public static void main(String[] args) {
        String namaDepan = "Norvan";
        String namaTengah = "Ryan";
        String namaBelakang = "Royansyah";
        int usia = 19;
        int targetTahunKuliah = 4;
        double ipk = 3.900;
        char nilaiAbjad = 'A';

        System.out.println(namaDepan);

        char[] uniskaChar = {'U','N','I','S','K','A',};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);

        String namaLengkap = namaDepan +" "+ namaTengah +" "+ namaBelakang;
        System.out.println(namaLengkap);
        System.out.println(namaLengkap.length());
        System.out.println(namaLengkap.indexOf("NIS"));
        System.out.println(uniskaString.indexOf("NIS"));
        System.out.println(namaLengkap.substring(8));
        System.out.println(namaLengkap.substring(8,12));

        String[] namaArray = namaLengkap.split    (" ");

        for (String nama : namaArray)
            System.out.println(nama);
    }
}
