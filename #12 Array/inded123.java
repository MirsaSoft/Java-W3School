public class inded123 {

    public static void main(String[] args){
        // CONTOH KEHIDUPAN NYATA
        // Untuk menunjukkan contoh praktis penggunaan array, mari kita buat program yang menghitung rata-rata usia yang berbeda :
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int length = ages.length;
        for(int age : ages){
            sum += age;
        }
        avg = sum / length;
        System.out.println("The average age is : " + avg);

        System.out.println("=========================");

        // Dan dalam contoh ini, kami membuat program yang mencari usia terendah di antara berbagai usia :
        int lowestAge = ages[0];
        for(int age2 : ages){
            if (lowestAge > age2) {
                lowestAge = age2;
            }
        }
        System.out.println("The lowest age in the array is : " + lowestAge);
    }
}
