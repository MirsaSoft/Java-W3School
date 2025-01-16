public class index103 {
    public static void main(String[] args){
        // CONTOH KEHIDUPAN NYATA
        // Untuk menunjukkan contoh praktis dari for loop, mari kita buat program yang menghitung hingga 100 dengan kelipatan pulihan :
        for(int i = 0; i <= 100; i += 10){
            System.out.println(i);
        }

        System.out.println("=========================");

        // Dalam contoh ini, kamu membuat program yang hanya mencetak nilai genap antara 0 dan 10 :
        for(int j = 0; j <= 10; j = j + 2){
            System.out.println(j);
        }

        System.out.println("=========================");

        // Dan dalam contoh ini, kami membuat program yang mencetak tabel perkalian untuk angka tertentu :
        int number = 2;
        for(int k = 1; k <= 10; k++){
            System.out.println(number + " x " + k + " = " + (number * k));
        }
    }
}
