package tutorial.ch03.blizard_abstract;

public class Prove extends Worker{
    @Override
    public void getMinerals() {
        System.out.println("프로토스 : 미네랄을 채취합니다");
    }

    @Override
    public void getGas() {
        System.out.println("프로토스 : 가스을 채취합니다.");
    }

    @Override
    public void work() {

    }
}
