public class index122 {

    public static void main(String[] args){
        // LOOPING MELALUI ARRAY
        // Anda dapat melakukan pengulangan melalui elemen-elemen array dengan for loop, dan menggunakan length properti tersebut untuk menentukan berapa kali loop harus dijalankan.

        // Contoh berikut menampilkan semua elemen dalam array mobil :
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        }

        System.out.println("=========================");

        // LOOPING MELALUI ARRAY DENGAN FOR EACH
        // Ada juga loop "for-each", yang digunakan secara eksklusif untuk melakukan loop melalui elemen dalam array :

        // Contoh berikut ini menampilkan semua elemen dalam array mobil, menggunakan loop "for-each" :
        for(String j : cars){
            System.out.println(j);
        }

        // Contoh di atas dapat dibaca seperti ini : untuk setiap String elemen (disebut i - seperti dalam i index) dalam cars, cetak nilai i.

        // Jika Anda membandingkan for perulangan dan perulangan for-each, Anda akan melihat bahwa metode for-each lebih mudah ditulis, tidak memerlukan penghitung (menggunakan properti panjang), dan lebih mudah dibaca.
    }
}