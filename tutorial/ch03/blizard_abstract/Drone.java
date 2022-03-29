package tutorial.ch03.blizard_abstract;

public class Drone extends Worker{
    @Override
    public void getMinerals() {
        System.out.println("저그 : 미네랄을 채취합니다.");
    }

    @Override
    public void getGas() {
        System.out.println("저그 : 가스를 채취합니다.");
    }

    @Override
    public void work() {

    }
}
