public class FrogJump {
    public static int solution(int X, int Y, int D){
        double count = 0;
        if(X < Y && D >=0){
            count = (Y - X)/(double)D;
        }
       if (count != (int)count)
       {
           return (int)count + 1;
       }
       else{
            return (int)count;
       }
    };
    public static void main(String[] args) {
        int a = FrogJump.solution(10, 59, 25);
        System.out.println(a);

//        double r =4.9;
//        int c = (int)r;
//        System.out.println(c);
    }
}
