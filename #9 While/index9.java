public class index9 {

    public static void main(String[] args){
        System.out.println("=========================");
        // PERULANGAN WHILE DI JAVA
        // Perulangan while akan mengulang blok kode selama kondisi yang ditentukan terpenuhi true :

        // Dalam contoh di bawah, kode dalam loop akan berjalan, berulang-ulang, selama variabel (i) kurang dari 5 :
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("=========================");
        // PERULANGAN DO/WHILE
        // Loop do/while merupakan varian dari while loop. Loop ini akan mengeksekusi blok kode satu kali, sebelum memeriksa apakah kondisinya benar, kemudian akan mengulang loop selama kondisinya benar.

        // Contoh dibawah ini menggunakan do/while lopp. Loop akan selalu dijalankan setidaknya satu kali, bahkan jika kondisinya salah, karena blok kode dijalankan sebelum kondisi diuji :

        int j = 0;
        do {
            System.out.println(i);
            j++;
        }
        while (j < 5);
        System.out.println("=========================");
        // CONTOH KEHIDUPAN NYATA
        // Untuk menunjukkan contoh praktis dari while loop, kami telah membuat program "Hitung mundur" sederhana :
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy new year!!");
        System.out.println("=========================");
        // unutk menunjukkan contoh praktis dari loop while yang dikombinasikan dengan pernyataan if else, katakanlah kita memainkan permainan Yatzy :
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6){
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
        
        // Jika look melewati nilai mulai dari 1 hingga 5, ia akan mencetak "No yatzy". setiap kali melewati nilai 6, ia akan mencetak "Yatzy!".
        System.out.println("=========================");
    }
}
