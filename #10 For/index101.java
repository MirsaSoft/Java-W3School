public class index101 {

    public static void main(String[] args){
        // NESTED LOOPING
        // Anda juga dapat menempatkan loop di dalam loop lain. Ini disebut loop bersarang.
        
        // "Loop dalam" akan dieksekusi satu kali untuk setiap iterasi "loop luar" :
        for(int i = 1; i <= 2; i++){
            System.out.println("Outer : " + i);
            for(int j = 1; j <=3; j++){
                System.out.println("  Inner : " + j);
            }
        }
    }
}