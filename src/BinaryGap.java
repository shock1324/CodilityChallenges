public class BinaryGap {
    public static int solution(int N){

        String sb = Integer.toBinaryString(N);

        while(sb.endsWith("0")){
            sb = sb.substring(0, sb.length() - 1);
        }

        String[] splited = sb.split("1");
        int maxStr = 0;

        for (int i = 0; i < splited.length; i++) {
            if (splited[i].length() > maxStr) {
                maxStr = splited[i].length();
            }
        }
        return maxStr;
    }
    public static void main(String[] args) {

        int numb = solution(1610612737 );
        System.out.println(numb);

    }
}
