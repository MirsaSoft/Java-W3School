public class index111 {

    public static void main(String[] args){
        // BREAK JAVA
        // Anda telah melihat break pernyataan yang digunakan dalam bab sebelumnya dari tutorial ini. Pernyataan itu digunakan untuk "melompat keluar" dari sebuah switch pernyataan.

        // Pernyataan tersebut break juga dapat digunakan untuk keluar dari suatu masalah.

        // Contoh ini menghentikan loop ketika i sama dengan 4 : 
        for(int i = 0; i < 10; i++){
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("=========================");
        // JAVA CONTINUE
        // Pernyataan tersebut "continue" menghentikan satu iterasi (dalan perulangan) jika kondisi tertentu terjadi, dan berlanjut pada iterasi berikutnya dalam perulangan.

        // Contoh ini melewatkan nilai 4 :
        for (int j = 0; j < 10; j++){
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }

        System.out.println("=========================");
        // BREAK DAN CONTINUE DALAM WHILE LOOP
        // Anda juga dapat menggunakan break dan continue dalam loop while :
        int k = 0;
        while (k < 10) {
            System.out.println(k);
            k++;
            if (k == 4) {
                break;
            }
        }

        System.out.println("=========================");
        int l = 0;
        while (l < 10) {
            if (l == 4) {
                l++;
                continue;
                
            }
            System.out.println(l);
            l++;
        }
    }
}
