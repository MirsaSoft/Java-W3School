public class operator{
    public static void main(String[] args){

        System.out.println("=========================");
        // Dalam contoh dibawah ini, kami menggunakan + operator untuk menambahkan dua nilai :        
        int x = 100 + 50;
        System.out.println(x);
        System.out.println("=========================");
        // Meskipun + operator ini sering digunakan untuk menjumlahkan dua nilai, seperti pada contoh di atas, operator ini juga dapat digunakan untuk menjumlahkan sebuah variabel dan sebuah nilai, atau sebuah variabel dan variabel lain :
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println("=========================");
        /* Java membagi operator ke dalam kelompok berikut :
        - Operator aritmatika
        - Operator penugasan
        - Operator perbandingan
        - Operator logika
        - Operator bitwise

        - Addition = x + y
        - Subtraction = x - y
        - Multiplication = x * y
        - Division = x / y
        - Modulus = x % y
        - Increment = ++x
        - Decrement = --x
         */

        // JAVA ASSIGNMENT OPERATORS
        // Operator penugasan digunakan untuk menetapkan nilai ke variabel
        // Dalam contoh di bawah ini, kami menggunakan operator penugasan (=) untuk menetapkan nilai 10 ke variabel yang disebut x :
        int a = 10;
        System.out.println(a);
        System.out.println("=========================");
        // Operator penugasan penambahan (+=) menambahkan nilai ke variabel :
        int b = 10;
        b += 5;
        System.out.println(b);

        // Daftar semua operator penugasan :
        /*
        x = 5
        x += 3
        x -= 3
        x *= 3
        x /= 3
        x %= 3
        x &= 3
        x |= 3
        x ^= 3
        x >>= 3
        x <<= 3
         */
        System.out.println("=========================");
        // OPERATOR PERBANDINGAN JAVA
        // Operator perbandingan digunakan untuk membandingkan dua nilai (atau variabel). Hal ini penting dalam pemrograman, karena membantuk kita menemukan jawaban dan membuat keputusan.

        // Nilai yang dikembalikan dari suatu perbandingan adalah true atau false. Nilai-nilai ini dikenal sebagai nilai Boolean, dan akan mempelajarinya lebih lanjut dalam bab Boolean dan If Else.

        // Dalam contoh berikut, kita menggunakan operator lebih besar > untuk mencari tahu apakah 5 lebih besar dari 3 :
        int c = 5;
        int d = 3;
        System.out.println(c > d);
        
        /*
        Equal to x == y
        Not equal x != y
        Greater than x > y
        Less than x < y
        Greater than or equal to x >= y
        Less than or equal to x <= y
         */

        // OPERATOR LOGIKA JAVA
        // Anda juga dapat menguji nilai true atau false dengan operator logika.
        // Operator logika digunakan untuk menentukan logika antara variabel atau nilai :

        /*
        Logical and &&
        Logical or ||
        Logical not !( )
         */
        System.out.println("=========================");

        System.out.println("=========================");
    }
}
