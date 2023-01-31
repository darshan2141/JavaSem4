//.lang class by default imported
class p23{
    public static void main(String args[]){
        String s1 = "SSSDIIT";
        System.out.println(s1.toLowerCase());
        String s2 = "collage";
        System.out.println(s2.toUpperCase());
        String s3 = "   Hello  ";
        System.out.println(s3.length());
        System.out.println(s3.trim());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
        // System.out.println(s1 > s2); <- java version 8
        // System.out.println(s1.replace(s2)); <- java version 8
    }
}