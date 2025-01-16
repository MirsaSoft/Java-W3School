public class singkatanjika {

    public static void main(String[] args){
        // SINGKATAN IF...ELSE
        // Ada juga singkatan if else, yang dikenal sebagai operator terner karena terdiri dari tiga operan.

        // Ini dapat digunakan untuk mengganti beberapa baris kode dengan satu baris, dan paling sering digunakan untuk mengganti pernyataan if else sederhana :

        // Alih-alih menulis :
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        // Anda cukup menulis :
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}