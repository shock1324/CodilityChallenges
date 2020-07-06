import java.util.*;

public class Triangle {
    public static int solution(int[] A){

        Set<Integer> set = new TreeSet<>() {
        };

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        System.out.println(set);


        return 1;
    };
    public static void main(String[] args) {
        int[] ex = {10,2,5,1,8,20};
        solution(ex);
    }
}
