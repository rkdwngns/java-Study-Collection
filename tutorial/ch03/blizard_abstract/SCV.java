package tutorial.ch03.blizard_abstract;

public class SCV extends Worker implements Repair {
    @Override
    public void getMinerals() {
        System.out.println("테란 : 미네랄을 채취합니다.");
    }

    @Override
    public void getGas() {
    System.out.println("테란 : 가스를 채취합니다.");
    }

    @Override
    public void work() {

    }

    @Override
    public void repair() {

    }
}
