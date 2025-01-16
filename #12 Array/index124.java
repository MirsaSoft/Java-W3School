public class index124 {

    public static void main(String[] args){
        // ARRAY MULTIDIMENSI
        // Array multidimensi adalah array dari array

        // Array multidimensi berguna ketika Anda ingin menyimpan data sebagai bentuk tabel, seperti tabel dengan baris dan kolom.

        // Untuk membuat array dua dimensi, tambahkan setiap array dalam set kurung kurawalnya sendiri :

        int[][] myNumbers = {{1, 2, 3,4}, {5, 6, 7}};

        // myNumbers sekarang menjadi array dengan dua array sebagai elemennya.

        // ELEMEN AKSES
        // Untuk mengakses elemen array myNumbers, tentukan dua indeks: satu untuk array, dan satu untuk elemen di dalam array tersebut. Contoh ini mengakses elemen ketiga (2) di array kedua (1) myNumbers :
        System.out.println(myNumbers[1][2]);

        System.out.println("=========================");

        // UBAH NILAI ELEMEN
        // Anda juga dapat mengubah nilai suatu elemen :
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        System.out.println("=========================");

        // LOOP MELALUI ARRAY MULTI-DIMENSI
        // Anda juga dapat menggunakan a for loop di dalam yang lain for loop untuk mendapatkan elemen array dua dimensi (kita masih harus menunjuk ke dua indeks) :

        for(int i = 0; i < myNumbers.length; ++i){
            for(int j = 0; j < myNumbers[i].length; ++j){
                System.out.println(myNumbers[i][j]);
            }
        }

        System.out.println("=========================");

        // Atau anda bisa menggunakan perulangan for-each, yang dianggap lebih mudah dibaca dan ditulis :
        for(int[] row : myNumbers){
            for(int k : row){
                System.out.println(k);
            }
        }
    }
}