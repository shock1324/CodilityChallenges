import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OddOccurencyInArray {

    public static int solution(int[] A){
        Set<Integer> list = new HashSet<>();
        for(int i = 0; i < A.length; i++){
            if (!list.contains(A[i])){
                list.add(A[i]);
            }
            else
            {
                list.remove(A[i]);
            }
        }
        return list.iterator().next();

    };
    public static void main(String[] args) {
        int[] ex = {1,2,9,2,9,3,7,7,5,4,5,4};
        System.out.println(OddOccurencyInArray.solution(ex));
    }
}
