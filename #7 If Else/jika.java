public class jika {

    public static void main(String[] args){
        // KONDISI JAVA DAN PERNYATAAN IF
        /* 
        Anda sudah tahu bahwa java mendukung kondisi logika umum dari matematika :
        - Kurang dari : a < b
        - Kurang dari atau sama dengan : a <= b
        - Lebih besar dari : a > b
        - Lebih besar atau sama dengan : a >= b
        - Sama dengan a == b
        - Tidak sama dengan : a != b
        */

        // Anda dapat menggunakan kondisi ini untuk melakukan tindakan yang berbeda untuk keputusan yang berbeda.

        /*
        Java Memiliki pernyataan kondisional berikut :
        - Digunakan if untuk menentukan blok kode yang akan dieksekusi, jika kondisi yang ditentukan benar
        - Digunakan else untuk menentukan blok kode yang akan dieksekusi, jika kondisi yang sama salah
        - Digunakan else if untuk menentukan kondisi baru untuk diuji, jika kondisi pertama salah
        - Digunakan switch untuk menentukan banyak blok kode alternatif yang akan dieksekusi
        */

        System.out.println("=========================");
        // PERNYATAAN IF
        // Gunakan if untuk menentukan blok kode java yang akan dieksekusi jika kondisinya adalah true.

        // Dalam contoh di bawah ini, kami menguji dua nilai untuk mengetahui apakah 20 lebih besar dari 18. Jika kondisinya adalah true, cetak beberapa teks :

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        // Kita juga dapat menguji variabel :

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // Dalam contoh diatas, kami menggunakan dua variabel x dan y, untuk menguji apakah x lebih besar dari y (menggunakan > operator). Karena x adalah 20, dan y adalah 18, dan kami tahu bahwa 20 lebih besar dari 18, kami mencetak ke layar bawah "x lebih besar dari y".
    }
}