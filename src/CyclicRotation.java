class CyclicRotation {

    static int[] solutions(int [] A, int K){
        int IndexToMove;

        int[] ints1 = new int[A.length];
        int nLength = A.length; //np 5
        if(A.length == 0)
        {
            ints1 = A;;
        }
        else {
            IndexToMove = K % nLength; // dla K = 2 to wychodzi 2, dla K = 8 wychodzi 3
            if (IndexToMove == 0){
                ints1 = A;
            }
            else{
                int primIndex = IndexToMove;
                for (int i = 0; i < nLength - primIndex; i++) {
                    ints1[IndexToMove] = A[i];
                    IndexToMove++;
                }
                for (int i = 0; i < nLength-(nLength - primIndex); i++) {
                    ints1[i] = A[IndexToMove - primIndex];
                    IndexToMove++;
                }
            }

        }
        return ints1;
    }

    public static void main(String[] args) {
        int[] ex = new int[0];
        int[] x = CyclicRotation.solutions(ex, 10);
        System.out.println(x.toString());
    }
}



