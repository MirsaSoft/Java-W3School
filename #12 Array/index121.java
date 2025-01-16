public class index121 {

    public static void main(String[] args){
        // ARRAY JAVA
        // Array digunakan untuk menyimpan beberapa nilai dalam satu variabel, alih-alih mendeklarasikan variabel terpisah untuk setiap nilai.

        // Untuk mendeklarasikan array, tentukan tipe variabel dengan tanda kurung siku :

        // Serakarng kita telah mendeklarasikan sebuah variabel yang menampung serangkaian string. Untuk memasukkan nilai ke dalamnya, Anda dapat menempatkan nilai-nilai tersebut dalam daftar yang dipisahkan koma, di dalam kurung kurawal :
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        // Untuk membuat array bilangan bulat, anda daat menulis :
        int[] myNum = {10, 20, 30, 40};

        // MENGAKSES ELEMEN DALAM ARRAY
        // Anda dapat mengakses elemen array dengan merujuk ke nimir indeks.

        // Pernyataan ini mengakses nilai elemen pertama dalam mobil :
        System.out.println(cars[0]);

        System.out.println("=========================");
        // MENGUBAH ELEMEN ARRAY
        // Untuk mengubah nilai elemen tertentu, lihat nomor indeks :
        cars[1] = "Opel";
        System.out.println(cars[1]);

        System.out.println("=========================");
        // PANJANG ARRAY
        // Untuk mengetahui berapa banyak elemen yang dimiliki suatu array, gunakan length properti :
        System.out.println(myNum.length);
    }
}
