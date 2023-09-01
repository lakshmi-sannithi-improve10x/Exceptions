public class Main {
    int a=20;
    public static void main(String[] args) {
        int a= 30;
        a=20;
        System.out.println(a);
        String s1 = new String("sai sri").intern();
        String s2 =  "sai sri";
        System.out.println(s1.equals(s2));
    }
}