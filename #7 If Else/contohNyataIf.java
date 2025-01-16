public class contohNyataIf {

    public static void main(String[] args){
        // CONTOH KEHIDUPAN NYATA
        // Contoh ini menunjukkan bagaimana anda dapat menggunakan if..else untuk "membuka pintu" jika pengguna memasukkan kode yang benar :
        int doorCode = 1337;
        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed");
        }

        // Contoh ini menunjukkan bagaimana anda dapat menggunakan if..else untuk mengetahui apakah suatu angka positif atau negatif :
        int myNum = 10;
        if (myNum > 0) {
            System.out.println("The value is positive number.");
        } else if (myNum < 0){
            System.out.println("The value is a negative number");
        } else {
            System.out.println("The value is 0.");
        }

        // Cari tahu apakah seseorang sudah cukup umur untuk memilih :
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }

        // Cari tahu apakah suatu angka genap atau ganjil :
        int myNum2 = 5;
        if (myNum2 % 2 == 0) {
            System.out.println(myNum + " is even");
        } else {
            System.out.println(myNum + " is odd");
        }
    }
}
