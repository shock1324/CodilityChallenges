import java.util.Arrays;


public class MaxCounters {
    public static int[] solution(int N, int[] A){
        int[] resaults = new int[N];
        int isMax = 0;
        int max = 0;

        for(int i = 0; i < A.length; i++){
            int a = A[i];
                if(a > N) {
                    Arrays.fill(resaults, max);
                }
                else{

                    resaults[a - 1] = resaults[a - 1] + 1;
                    isMax = resaults[a - 1];
                    if (max < isMax)
                        max = isMax;
                }
        }

        return resaults;

    };
    public static void main(String[] args) {
        int N = 5;
        int[] ex = {3,4,4,6,1,4,4};

        System.out.println(Arrays.toString(MaxCounters.solution(N, ex)));
    }
}

//    int max = 0;
//        int ii = 0;
//
//        if ()
//        do {
//            if(A[ii] > N) {
//                Arrays.fill(resaults, resaults[max]);
//            }
//            else{
//                int a = A[ii];
//                resaults[a - 1] = resaults[a - 1] + 1;
//                max = resaults[a - 1];
//                ii = ii + 1;
//            }
//
//        }while (A[ii] > N);