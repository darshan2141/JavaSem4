import java.util.*;
class exp {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Any String : ");
    StringBuffer str = new StringBuffer(sc.nextLine());
    System.out.println("You Entered String : " + str +"\n");
    System.out.print("Enter ( Append ) New Word in Already existing string : " );
    str.append(sc.nextLine());
    System.out.println(str +"\n");
    System.out.println("Insert any word or string as you wise position of paragraph \n");

    System.out.print("Enter position in \"Integer\" to insert new word or string : ");
    int pos;
    pos = sc.nextInt();

    System.out.print("\nThen Enter your new string : ");
    String newInsStr;
    newInsStr = sc.nextLine();

    System.out.println(newInsStr);
    
    str.insert(pos,newInsStr);

    System.out.println(str +"\n");
    // str.replace(2, 5, "BCA");
    // System.out.println(str);
  }
}
