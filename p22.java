public class p22 {
    public static void main(String args[]) {
        int a1 = Integer.parseInt(args[0]);
        int a2 = Integer.parseInt(args[1]);
        int a[][] = new int[a1][a2];
        int count = 0;

        for (int i = 0; i < a1; i++) {
            for (int j = 0; j < a2; j++) {
                a[i][j] = count++;
                System.out.print(a[i][j] + "");
            }
            System.out.println();
        }
    }
}
