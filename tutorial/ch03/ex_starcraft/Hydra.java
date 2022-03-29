package tutorial.ch03.ex_starcraft;

public class Hydra extends Unit implements Attacks{
    boolean isAlive = false;
    int enegry = 0;

    @Override
    public void create() {
        System.out.println("프로토스: 히드라가 생성되었습니다.");
        isAlive = true;
    }

    @Override
    public void remove() {
        isAlive = false;
        enegry = 0;
        System.out.println("드래곤이 소멸되었습니다.");
    }

    @Override
    public void attack() {

    }

    @Override
    public void getDemage(int dmg) {
        System.out.println("프로토스:드래곤이 공격당합니다.");
        enegry = enegry - dmg;
        if(enegry<=0) {
            remove();
        }

    }
}
