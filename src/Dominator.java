import java.util.*;

public class Dominator {
    public static int solution(int[] A){

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new TreeSet<>();
        int dominator = 0;

        for(int i = 0; i < A.length; i++){
            list.add(A[i]);
            set.add(A[i]);
            stack.push(A[i]);
        }

        System.out.println(stack.peek().intValue());
        ;
//        int iter = set.size();
//
//        for (int i = 0 ; i < iter; i++){
//            int value = set.fi;
//            dominator = Collections.frequency(list, value);
//            if (dominator > list.size()/2)
//                return list.indexOf(value);
//            else
//                set.remove(set.iterator().next());
//        }

return -1;

    };
    public static void main(String[] args) {
        int[] ints = {2, 4, 3, 3, 3, -1, 3, 3};
        System.out.println(solution(ints));
        System.out.println();

    }
}
