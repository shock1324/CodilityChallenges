public class BinaryGap {
    public static void main(String[] args) {
        int a = 423;
        String sb = Integer.toBinaryString(a);
        System.out.println(sb);
        String[] splited = sb.split("1");

        for (int i = 0; i< splited.length; i++)
            System.out.println(splited[i]);
    }
}
