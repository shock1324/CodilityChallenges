import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public class Distinct {
    public static int solution(int[] A){
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        return set.size();
    };
    public static void main(String[] args) {
        IntStream stream = new Random().ints(10, -100000, 100000);
        int[] ex = stream.toArray();
        System.out.println(solution(ex));
    }
}
