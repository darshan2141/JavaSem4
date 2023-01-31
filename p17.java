//print 1 4 9 16 25 36 49
public class p17 {
    public static void main(String args[]) {
        int i = 1;
        int n = Integer.parseInt(args[0]);
        while (i <= n) {
            System.out.print(i * i + " ");
            i++;
        }
    }
}
