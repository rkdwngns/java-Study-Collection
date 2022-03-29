package tutorial.ch01.gugudan;

public class main {
    public static void main(String[] args) {
        int dan = Integer.parseInt(args[0]);
        int step = Integer.parseInt(args[1]);
        for(int i=0; i<=9; i=i+step) {
            System.out.println(i);
        }
    }
}
