class demo {
    int i;
    demo() {
        i = 10;
    }
    void print() {
        System.out.println("value is : " + i);
    }
}

class p1 {
    public static void main(String args[]) {
        demo obj = new demo();
        obj.print();
    }
}