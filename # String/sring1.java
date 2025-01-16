public class sring1 {
    public static void main(String[] args){
        // STRING JAVA
        // String digunakna untuk menyimpan teks.
        // Suatu string variabel berisi kumpulan karakter yang diapit oleh tanda kutip ganda :
        String greeting = "Hello";
        System.out.println(greeting);
        System.out.println("=========================");
        // STRING LENGTH
        // String dalam java sebenarnya adalah sebuah objek, yang berisi metode yang dapat melakukan operasi tertentu pada string. Misalnya, panjang string dapat ditemukan dengan length() metode :
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt);
        System.out.println("The length of the txt string is : " + txt.length());
        System.out.println("=========================");
        // LEBIH BANYAK METODE STRING
        // Ada banyak metode string yang tersedia, misalnya toUpperCase() dan toLowerCase() :
        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());
        System.out.println(txt1.toLowerCase());
        System.out.println("=========================");
        // MENEMUKAN KARAKTER DALAM STRING
        // Metode ini indexOf() mengambilkan indeks (posisi) kemunculan pertama text tertentu dalam string (termasuk spasi) :
        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));
        System.out.println(txt2.indexOf("a"));
        System.out.println("=========================");
        // PENGGABUNGAN STRING
        // Operator ini + dapat digunakan di antara string untuk menggabungkannya. Ini disebut penggabungan :
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println("=========================");
        // Anda Juga dapat menggunakan concat() metode ini untuk menggabungkan dua string :
        System.out.println(firstName.concat(lastName));
        System.out.println("=========================");
        // MENAMBAHKAN ANGKA DAN STRING
        // Jika anda menambahkan dua angka, hasilnya akan menjadi angka :
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z);
        System.out.println("=========================");
        // Jika anda menambahkan dua string, hasilnya akan berupa penggabungan string :
        String a = "10";
        String b = "20";
        String c = a + b;
        System.out.println(c);
        System.out.println("=========================");
        // Jika anda menambahkan angka dan string, hasilnya akan berupa penggabungan string :
        String d = "10";
        int e = 20;
        String f = d + e;
        System.out.println(f);
        System.out.println("=========================");
        // STRING KARAKTER KHUSUS
        // Karena string harus ditulis dalam tanda kutip, java akan salah memahami string ini, dan menghasilkan kesalahan :

        // Solusi untuk menghindari masalah ini, adalah dengan menggunakan karakter escape garis miring terbalik.

        // Karakter escape garis miring terbalik (\) mengubah karakter khusus menjadi karakter string :

        /*
        Single quote \'
        Double quote \"
        Backslash \\
         */

        // Urutan ini \' menyisipkan tanda kutip tunggal dalam sebuah string :
        String txt3 = "We are the so-called \"Viking\" from the north.";
        System.out.println(txt3);
        System.out.println("=========================");
        // Urutan ini \' menyisipkan tanda kutip tunggal dalam sebuah string :
        String txt4 = "It\'s alright.";
        System.out.println(txt4);
        System.out.println("=========================");
        // Urutan ini \\ menyisipkan satu garis miring terbalik dalam sebuah string :
        String txt5 = "The character \\ is called backslash";
        System.out.println(txt5);

        // Urutan escape umum lainnya yang valid di Java adalah :

        /*
        New line \n
        Carriage Return \r
        Tab \t
        Backspace \b
        Form feed \f
         */
        System.out.println("=========================");
        System.out.println("=========================");
    }
}
