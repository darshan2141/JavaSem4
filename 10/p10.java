class getMarks {
  int no;
  String name;
  int marks[] = new int[3];

  void getDetail(int n, String nm, int m1, int m2, int m3) {
    this.no = n;
    this.name = nm;
    this.marks[0] = m1;
    this.marks[1] = m2;
    this.marks[2] = m3;
  }
}

class claculate extends getMarks {
  int tot;
  float pr;

  void total() {
    for (int i = 0; i <= 2; i++) {
      this.tot += marks[i];
    }
  }

  void percentage() {
    this.pr = ((float)this.tot / 300) * 100;
  }

}

class Print extends claculate {

  void AllDetails() {
    System.out.println("No is : " + no);
    System.out.println("Name is : " + name);
    System.out.println("Mark 1 is: " + marks[0]);
    System.out.println("Mark 2 is: " + marks[1]);
    System.out.println("Mark 3 is: " + marks[2]);
    System.out.println("Total is : " + tot);
    System.out.println("Percentage is : " + pr);
  }
}

class mulInhe {

  public static void main(String args[]) {
    Print obj = new Print();
    obj.getDetail(
      Integer.parseInt(args[0]),
      args[1],
      Integer.parseInt(args[2]),
      Integer.parseInt(args[3]),
      Integer.parseInt(args[4])
    );
    obj.total();
    obj.percentage();
    obj.AllDetails();
  }
}
  