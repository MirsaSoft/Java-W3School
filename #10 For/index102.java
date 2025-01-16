public class index102 {
    public static void main(String[] args){
        // FOR EARCH LOOPING
        // Ada juga loop "for-each", yang digunakan secara eksklusif untuk melakukan loop melalui elemen-elemen dalam array (atau set data lainnya) :

        // Contoh berikut ini menampilkan semua elemen dalam array mobil, menggunakan loop "for-each" :
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String i : cars){
            System.out.println(i);
        }
    }
}
