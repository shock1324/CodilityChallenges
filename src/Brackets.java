
import java.util.*;

public class Brackets {
    public static int solution(String S){

        char[] chars = S.toCharArray();
        Stack<Character> initialStack = new Stack<>();
        Stack<Character> addingStack = new Stack<>();
        boolean flag = true;

            for (int i = 0; i < S.length(); i++) {
                initialStack.push(chars[i]);
            }

        if(initialStack.size() % 2 != 0)
            return 0;
        if(initialStack.size() == 0)
            return 1;

            while (flag == true){
                flag = false;

                while (!initialStack.isEmpty() && initialStack.size() != 1) {
                    if ((initialStack.get(initialStack.size() - 2) == '{' && initialStack.peek() == '}') || (initialStack.get(initialStack.size() - 2) == '(' && initialStack.peek() == ')') || ( initialStack.get(initialStack.size()-2) == '[' && initialStack.peek() == ']')) {
                        initialStack.pop();
                        initialStack.pop();
                        flag = true;
                        if (initialStack.size() == 0 && addingStack.size() == 0)
                            return 1;
                    }
                    else {
                        addingStack.push(oposite(initialStack.pop()));
                    }
                }
                if(addingStack.size() != 0)
                addingStack.push(oposite(initialStack.pop()));
                initialStack.addAll(addingStack);
                addingStack.clear();
           }

        return 0;
    }

    private static char oposite(char ch){
        if (ch == '}'){
            return '{';
        }
        else if(ch == '{'){
            return '}';
        }
        else if(ch == ']'){
            return '[';
        }
        else if(ch == '['){
            return ']';
        }
        else if(ch == '('){
            return ')';
        }
        else {
            return '(';
        }
    }
    public static void main(String[] args) {
        String str = "())(()";
        //"[([])]"
        //"[([])]";

        System.out.println(solution(str));

//        char[] chars111 = {'a','b','c'};
//        Queue<Character> q = new ArrayDeque<>() {
//        } ;
//
//        for(int i =0; i < chars111.length ; i++)
//            q.add(chars111[i]);
//
//        System.out.println(q);
    }
}
