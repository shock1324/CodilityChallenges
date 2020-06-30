import java.util.HashSet;
import java.util.Set;

public class PermMissingElement {
    public static int solution(int[] A){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++){
            set.add(A[i]);
        }
        int a = 0;
        for (int i = 0; i <= A.length; i++){
            if(!set.contains(i+1)){
                a = i+1;
                break;
            }
            else{
                a = i + 1;
            }

        }
        return a;
    };
    public static void main(String[] args) {
        int[] ex = {1};
        int b = solution(ex);
        System.out.println(b);;
    }

   // DLA MNIE TO TROCHE ZJEBANE

}
