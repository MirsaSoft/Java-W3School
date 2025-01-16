public class boole{
    public static void main(String[] args){
        System.out.println("=========================");
        // NILAI BOOLEAN
        // Tipe boolean dideklarasikan dengan boolean kata kunci dan hanya dapat mengambil nilai true dan false :
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        // Namun, lebih umum untuk mengembalikan nilai boolean dari ekspresi boolean, untuk pengujian bersyarat (lihat dibawah)
        System.out.println("=========================");
        // EKSPRESI BOOLEAN
        // Ekspresi boolean mengembalikan nilai boolean : true atau false.

        // Ini berguna untuk membangun logika dan menemukan jawaban.

        // Misalnya, anda dapat menggunakan operator perbandingan, seperti operator lebih besar dari (>), untuk mengetahui apakah suatu ekspresi (atau variabel) benar atau salah :
        int x = 10;
        int y = 9;
        System.out.println(x > y);
        // Atau bahkan lebih mudah :
        System.out.println(10 > 9);
        // Pada contoh di bawah ini, kami menggunakan operator sama dengan (==) untuk mengevaluasi suatu ekspresi :
        System.out.println(x == 10);
        System.out.println(10 == 15);
        System.out.println("=========================");
        // CONTOH KEHIDUPAN NYATA
        // Mari kita pikirkan "contoh kehidupan nyata" di mana kita perlu mencari apakah seseorang sudah cukup umur untuk memilih.

        // Dalam contoh di bawah ini, kami menggunakan >= operator perbandingan untuk mengetahui apakah usia (25) lebih besar dari atau sama dengan batas usia pemilih, yang ditetapkan sebesar 18 :
        
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);
        
        // Keren, kan? Pendekatan yang lebih baik lagi (karena kita sedang bersemangat sekarang), adalah membungkus kode di atas dalam sebuah if...else pernyataan, sehingga kita dapat melakukan tindakan yang berbeda tergantung pada hasilnya :

        // Output "cukup umur untuk memilih!" jika myAge lebih besar dari atau sama dengan 18. Jika tidak, output "Tidak cukup umur untuk memilih." :

        if(myAge >= votingAge){
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
        System.out.println("=========================");
    }
}
