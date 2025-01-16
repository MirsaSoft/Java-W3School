public class jikasalah2 {

    public static void main(String[] args){
        System.out.println("=========================");
        // PERNYATAAN ELSE IF
        // Gunakan else if pernyataan untuk menentukan kondisi baru jika kondisi pertama adalah false.

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Dalam contoh diatas, waktu (22) lebih besar dari 10, jadi kondisi pertama adalah false. Kondisi berikutnya, dalam else if pernyataan, juga false, jadi kita beralih ke else kondisi karena kondisi1 dan kondisi2 keduanya false - dan mencetak ke layar "Selamat malam". Akan tetapi, jika waktunya adalah 14, program kami akan mencetak "Selamat siang."
    }
}
