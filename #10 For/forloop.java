public class forloop {

    public static void main(String[] args){
        System.out.println("=========================");
        // PERULANGAN JAVA FOR
        // Bila anda tahu persis berapa kali anda ingin mengulang suatu blok kode, gunakan for look alih-alih while loop :
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }

        // Pernyataan 1 menetapkan variabel sebelum loop dimulai (int i = 0)
        // Pernyataan 2 mendefinisikan kondisi agar loop dapat berjalan (i harus kurang dari 5). Jika kondisinya benar, loop akan dimulai lagi, jika salah, loop akan berakhir.
        // Pernyataan 3 meningkatkan nilai (i++) setiap kali blok kode dalam loop dieksekusi.
        System.out.println("=========================");
        // CONTOH LAINNYA
        // Contoh ini hanya akna mencetak nilai genap antara 0 dari 10 :
        for (int j = 0; j <= 10; j = j + 2){
            System.out.println(j);
        }
        System.out.println("=========================");
        System.out.println("=========================");
    }
}
