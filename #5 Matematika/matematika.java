public class matematika {
    public static void main(String[] args){
        System.out.println("=========================");
        // Math.max(x,y)
        // Metode ini dapat digunakan untuk menemukan nilai x dan y tertinggi : Math.max(x,y)
        System.out.println(Math.max(5, 10));
        System.out.println("=========================");
        // Math.min(x,y)
        // Metode ini dapat digunakan untuk menemukan nilai x dan y terendah : Math.min(x,y)
        System.out.println(Math.min(5, 0));
        System.out.println("=========================");
        // Math.sqrt(x)
        // Metode ini mengembalikan akar kuadrat dari x : Math.sqrt(x)
        System.out.println(Math.sqrt(64));
        System.out.println("=========================");
        // Math.abs(x)
        // Metode ini mengembalikan nilai absolut (positif) dari x : Math.abs(x)
        System.out.println(Math.abs(-4.7));
        System.out.println("=========================");
        // ANGKA ACAK
        // Math.random() mengembalikan angka acak antara 0,0 (inklusif) dan 1,0 (eksklusif) :
        System.out.println(Math.random());
        System.out.println("=========================");
        // Untuk mendapatkan kontrol lebih besar atas angka acak, misalnya, jika anda hanya menginginkan angka acak antara 0 dan 100, anda dapat menggunakan rumus berikut :
        int randomNum = (int)(Math.random() * 1001);
        System.out.println(randomNum);
        System.out.println("=========================");
        System.out.println("=========================");
    }
}
