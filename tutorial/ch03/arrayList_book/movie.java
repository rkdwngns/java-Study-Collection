package tutorial.ch03.arrayList_book;

public class movie implements Comparable<movie>{
    private String title;
    private double score;
    private String release;

    public movie(String title, double score, String release) {
        this.title = title;
        this.score = score;
        this.release = release;
    }
    public movie () {

    }

    public String getTitle(String s) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRelease() {
        return release;
    }
    public void print() {
        System.out.printf(
                "영화제목: %s [%.1] (개봉일: %s)\n",
                title, score, release
        );
    }

    public void setRelease(String release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "movie{" +
                "title='" + title + '\'' +
                ", score=" + score +
                ", release='" + release + '\'' +
                '}';
    }

    @Override
    public int compareTo(movie m) {
        Double dScore1 = this.score;
        Double dScore2 = m.score;
        int result = dScore1.compareTo(dScore2);
        if(result < 0) {
            return -1;
        } else if(result > 0) {
            return 1;
        }
        return 0;
    }
}

