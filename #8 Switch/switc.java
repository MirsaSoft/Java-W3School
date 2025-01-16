public class switc {

    public static void main(String[] args){
        System.out.println("=========================");
        // PERNYATAAN SWITCH JAVA
        // Dari menulis banyak if..else pernyataan, anda dapat menggunakan switch pernyataan.

        // Pernyataan tersebut switch memilih satu dari banyak blok kode yang akan dieksekusi :

        /*
        Begini cara kerjanya :
        - Ekspresi switch dievaluasi satu kali.
        - Nilai ekspresi dibandingkan dengan nilai masing-masing case.
        - JIka ada kecocokan, blok kode terkait dieksekusi.
        - Kata kunci break dan default bersifat opsional, dan akan dijelaskan nanti di bab ini.
        */

        // Contoh berikut menggunakan nomor hari dalam seminggu untuk menghitung nama hari dalam seminggu :
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                break;
        }

        System.out.println("=========================");
        // KATA KUNCI DEFAULT
        // Kata kunci tersebut default menentukan beberapa kode untuk dijalankan jika tidak ada kecocokan huruf besar/kecil :
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
            System.out.println("Looking forward to the Weekend");
                break;
        }
    }
}
