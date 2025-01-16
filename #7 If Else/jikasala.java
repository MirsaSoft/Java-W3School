public class jikasala {

    public static void main(String[] args){
        System.out.println("=========================");
        // PERNYATAAN ELSE
        // Gunakan else pernyataan untuk menentukan blok kode yang akan dieksekusi jika kondisinya adalah false.

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Dalam contoh diatas, waktu (20) lebih besar dari 18, jadi kondisinya adalah false. Oleh karena itu, kita beralih ke else kondisi dan mencetak ke layar "Selamat malam". jika waktunya kurang dari 18, program akan mencetak "Selamat siang".
    }
}