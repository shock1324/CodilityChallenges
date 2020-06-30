import java.util.Set;
import java.util.HashSet;
public class MissingInteger {

    public static int solution(int[] A) {

        Set<Integer> ints = new HashSet<>();
        int missingInt = 1;
        for (int i=0; i< A.length ; i++){
            if(A[i] > 0){
                ints.add(A[i]);
            }
        }

        for (int i=0; i < A.length ; i++){
            if(ints.contains(missingInt)){
                missingInt++;
            }
            else{
                break;
            }
        }
        return  missingInt;
    }

    public static void main(String[] args) {
        int[] liczby = {1,2,3};
        MissingInteger.solution(liczby);
    }
}
