import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static int solution(int[] A){

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            set1.add(A[i]);
            set2.add(i+1);
        }

        for (int i = 0; i < A.length; i++){
            if (set1.equals(set2))
                return 1;
        }
        return 0;
    };
    public static void main(String[] args) {
        int[] ex = {1,4,2,3,5};
        System.out.println(solution(ex));
    }
}
