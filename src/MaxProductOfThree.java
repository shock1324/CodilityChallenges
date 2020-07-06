import java.util.*;

public class MaxProductOfThree {
    public static  int solution(int[] A) {
        int a = 0, b = 0, c = 0, d = 0, e =0;
        List<Integer> listToTake = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            listToTake.add(A[i]);
        }
        Collections.sort(listToTake);
        System.out.println(listToTake);
        List<Integer> subList = new ArrayList<>(listToTake);

        a = listToTake.get(0);
        b = listToTake.get(1);
        c = listToTake.get(listToTake.size()-1);
        d = listToTake.get(listToTake.size()-2);
        e = listToTake.get(listToTake.size()-3);

        int max1 = a*b*c;
        int max2 = a*d*e;
        int max3 = c*d*e;

        int max = Math.max(Math.max(max1, max2), max3);

        return max;
    }
    public static void main(String[] args) {
        int[] ex = {-5,5,5,4};
        System.out.println(solution(ex));
    }
}