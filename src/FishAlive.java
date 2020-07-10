import java.util.Stack;

public class FishAlive {

    public static int solution(int[] A, int[] B){

        int UpAndDownstreamAtStart = 0;
        int itr = 0;
        Stack<Integer> stack1Sizes = new Stack<>();
        Stack<Integer> stack1Directions = new Stack<>();
        Stack<Integer> stack2Sizes = new Stack<>();
        Stack<Integer> stack2Directions = new Stack<>();

        while(itr < B.length && B[itr] == 0){
            UpAndDownstreamAtStart++;
            itr++;
        }

        if(itr == B.length)
            return UpAndDownstreamAtStart;

        for(int i = itr; i < B.length; i++){
            stack1Directions.push(B[i]);
            stack1Sizes.push(A[i]);
        }

        while(!stack1Directions.isEmpty()  && stack1Directions.peek() == 1){
            stack1Directions.pop();
            stack1Sizes.pop();
            UpAndDownstreamAtStart++;
        }

        while(!stack1Directions.isEmpty()){
            if(stack1Directions.peek() == 0 && (stack2Directions.isEmpty() || stack2Directions.peek() == 0)){
                stack2Directions.push(stack1Directions.pop());
                stack2Sizes.push(stack1Sizes.pop());

            }else if(stack1Directions.peek() == 1 && stack2Directions.isEmpty()){
                stack1Directions.pop();
                stack1Sizes.pop();
                UpAndDownstreamAtStart++;
            }
            else if((stack1Directions.peek() == 1 && stack2Directions.peek() == 0) || (stack1Directions.peek() == 0 && stack2Directions.peek() == 1)){
                if(stack1Sizes.peek() > stack2Sizes.peek()){
                    stack2Directions.pop();
                    stack2Sizes.pop();
                }else {
                    stack1Directions.pop();
                    stack1Sizes.pop();
                }
            }
        }

        return stack2Directions.size() + UpAndDownstreamAtStart;
    };
    public static void main(String[] args) {
        int[] fishSizes = {3,4,6,8,2,0};
        int[] fishDir =   {1,1,1,1,1,0};


        System.out.println(solution(fishSizes, fishDir));
    }

}
