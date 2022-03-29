package tutorial.ch03.ex_starcraft;

public class Dragon extends Unit implements Attacks {

    boolean isAlive = false;
    int energy = 0;


    @Override
    public void attack() {
        System.out.println("프로토스: 드래곤이 공격합니다.");
    }

    @Override
    public void getDemage(int dmg) {
        System.out.println("프로토스:드래곤이 공격당합니다.(에너지:"+energy+")");
        if(isAlive && energy >0) {
            energy = energy - dmg;
            if (energy <= 0) {
                remove();
            }
        }
    }

    @Override
    public void create() {
    isAlive = true;
    energy = max_enegy;
    System.out.println("프로토스 : 드래곤이 생성되었습니다.(에너지:"+energy+")");
    }

    @Override
    public void remove() {
        isAlive = false;
        energy = 0;
        System.out.println("프로토스 : 드래곤이 소멸되었습니다.");
    }
}
