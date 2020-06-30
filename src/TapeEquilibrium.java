import java.util.HashSet;
import java.util.Set;

public  class TapeEquilibrium {

    public static int solution(int[] A){

        int res;
        int count = 0;

        int leftValue = 0;
        int rightValue = 0;
        int lSide = 0;
        int rSide = A.length-1;


        if(A.length == 2){
            leftValue = A[0];
            rightValue = A[1];
            res = Math.abs(leftValue-rightValue);
        }
        else {
            while(count != A.length){
                if (leftValue <= rightValue){
                    if (leftValue < 0 && rightValue >=leftValue) {
                        rightValue = rightValue + A[rSide];
                        rSide--;
                        count++;
                    }
                    else{
                        leftValue = leftValue + A[lSide];
                        lSide++;
                        count++;
                    }
                }
                else
                {
                    if (rightValue < 0 && leftValue>=rightValue) {

                        leftValue = leftValue + A[lSide];
                        lSide++;
                        count++;
                    }
                    else{
                        rightValue = rightValue + A[rSide];
                        rSide--;
                        count++;
                    }
                }
            }
            res = Math.abs(leftValue-rightValue);
        }

        return res;

    };
    public static void main(String[] args) {
        int[] ex = {-10,-20,-30,-60,100};
        int sc = solution(ex);
        System.out.println(sc);
    }
}
