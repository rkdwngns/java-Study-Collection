package tutorial.ch03.ex_starcraft;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        Hydra hydra = new Hydra();
        Goliath goliath = new Goliath();

        dragon.create();
        hydra.create();
        goliath.create();

        dragon.attack();
        dragon.attack();
        dragon.attack();
        dragon.getDemage(10);
        dragon.getDemage(10);
        dragon.getDemage(10);
        dragon.getDemage(10);
        dragon.getDemage(10);


        for (int i = 0; i <20; i++)
            hydra.attack();

        hydra.getDemage(25);
        hydra.getDemage(25);
        hydra.getDemage(25);

        goliath.getDemage(5);
        goliath.getDemage(5);
        goliath.getDemage(5);
        goliath.getDemage(5);
        goliath.getDemage(5);

    }
}
