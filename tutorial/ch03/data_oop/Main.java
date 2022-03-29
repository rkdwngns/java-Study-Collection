package tutorial.ch03.data_oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("도쿄","일본",13297629));
        cities.add(new City("상하이","중국",24230000));
        cities.add(new City("베를릴","독일",3499849));
        for (City c : cities) {
            System.out.println("도시명: " +c.getNation()
                    + ")" + c.getNation()+
                    "인구 :"+ c.getPopulation()+ "명");
        }
    }
}
