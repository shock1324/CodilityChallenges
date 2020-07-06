import java.util.*;

public class PassingCars {
    public static int solution(int[] A){
        List<Integer> list = new ArrayList<>();
        int counter = 0;



        for (int i =0; i < A.length; i++) {
            list.add(A[i]);
        }

        while (!list.isEmpty()){
            if(counter < 1000000000){
                if (list.get(0) == 0){
                    counter = counter + Collections.frequency(list, 1);
                    //System.out.println(list);
                    list.remove(0);
                    //System.out.println(list);
                }
                else {
                    list.remove(0);
                }
            }
            else{
                return -1;
            }
        }
        return counter;
    };
    public static void main(String[] args) {
        int[] ex = new int[1000];
        for (int i = 0; i < ex.length; i++) {
            ex[i] = new Random().nextInt(2);
            //System.out.println(ex[i]);
        }
        int[] ex2 = ex;
        System.out.println();
        System.out.println(solution(ex2));
    }
}
