package tutorial.ch01.op;

public class Main {
    static void main(String[] args) {
        int gameLevel = 3;
        int gameScore = 150;
        
        //출력을 먼저 한 후 출력
        System.out.printf("게임 레벨 : %d\n",gameLevel++);
        System.out.printf("게임 레벨 : %d\n",gameLevel);
        //연산을 한 다음에 출력한다.
        System.out.printf("%d\n",--gameScore);
    }
}
