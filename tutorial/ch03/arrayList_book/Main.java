package tutorial.ch03.arrayList_book;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<movie> movies = new ArrayList<>();
        movies.add(new movie("해적: 도꺠비 깃발", 5.5, "22.01.26"));
        movies.add(new movie("스파이더맨: 노 웨이 홈", 7.3, "21.12.15"));
        movies.add(new movie("킹메이커", 8.3, "22.01.26"));
        movies.add(new movie("씽2게더", 9.0, "22.01.05"));
        movies.add(new movie("특송", 7.9, "22.01.12"));
        movies.add(new movie("레지던트 이블: 라쿤시티", 5.4, "22.01.19"));
        movies.add(new movie("웨스트 사이드 스토리", 7.9, "22.01.12"));
        movies.add(new movie("어나더 라운드", 9.0, "22.01.19"));
        movies.add(new movie("장민호 드라마 최종회", 10.0, "22.01.05"));
        movies.add(new movie("경관의 피", 7.5, "22.01.05"));

        for (movie m : movies) {
            System.out.println(m.toString());
        }
        System.out.println("--------------------------------------------------");
        Collections.sort(movies);

        for (movie m : movies) {
            System.out.println(m.toString());
        }
    }
}
