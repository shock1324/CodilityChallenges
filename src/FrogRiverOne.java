import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public static int solution(int X, int[] A){

        int secondsCounter = 0;
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for (int i = 0; i < X; i++){
            set1.add(i+1);
        }

        for (int i = 0; i < A.length; i++){
                set2.add(A[i]);

                if (set2.containsAll(set1))
                {
                    break;
                }
                else {
                    secondsCounter = secondsCounter + 1;
                }
        }
        if (set2.containsAll(set1))
            return secondsCounter;
        else
            return -1;
    };
    public static void main(String[] args) {
        int[] leaves = {1,2,3,4};
        int time = solution(2, leaves);
        System.out.println(time);
//
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//
//        for (int i = 0; i < 3; i++){
//            set1.add(i);
//        }
//
//        set2.add(3);
//        set2.add(1);
//        set2.add(0);
//        set2.add(5);
//        set2.add(1);
//
//        if(set2.containsAll(set1)){
//            System.out.println(true);
//
//        }
//        else
//            System.out.println(false);

    }
}
