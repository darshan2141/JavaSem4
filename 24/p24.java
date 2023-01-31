import java.util.*;
class p24{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}