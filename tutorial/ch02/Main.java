package tutorial.ch02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Random r1 = new Random(1000);
        r1.print();
        r1.sort();
        r1.print();
        r1.sort_reverse();
        r1.print();
        System.out.println("최소값은 " + r1.getMAX_Number() + "입니다.");
        System.out.println("최소값은 " + r1.getMinNumber() + "입니다.");
    }
}

class Random {
    final int MAX_NUM = 10000;
    int max;
    ArrayList<Integer> arr = new ArrayList<>();

    public Random(int m) {
        max = m;
        //시드값
        java.util.Random rnd = new java.util.Random(10);
        for(int i=0; i<max; i++) {
            int rnd_num = rnd.nextInt(MAX_NUM) + 1;
            arr.add(rnd_num);
        }
    }

    public void print() {
        for(int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }

    public void sort() {
        Collections.sort(arr);
    }

    public void sort_reverse() {
        Collections.sort(arr, Collections.reverseOrder());
    }

    public int getMAX_Number() {
        int max = -1;
        for (int a : arr) {
            if (max < a)
                max = a;
        }
        return max;
    }
    public  int getMinNumber() {
        int min =  MAX_NUM;
        for (int b : arr) {
            if (min > b)
                min = b;
        }

        return min;
    }

    public ArrayList<Integer> getRank() {
        ArrayList<Integer> rank = new ArrayList<>();
        int [] arrRank = new int[max];
        int [] data = new int[max];

        int idx = 0;
        for (int a : arr) {
            data[idx] = a;
            idx++;
        }
        for (int i = 0; i<max; i++) {
            arrRank[i] =1;
            for (int j=0; j<max; j++) {
                if (data[i] < data[j]) {
                    arrRank[i]++;
                }
            }
        }
        return rank;
    }
}
