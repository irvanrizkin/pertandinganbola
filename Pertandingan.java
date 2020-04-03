public class Pertandingan {
    // Data Field for Input
    private int scoreHome;
    private String awayClub;
    private int scoreAway;

    // Data field for home
    private static int win;
    private static int draw;
    private static int lose;

    // Constructor with specified parameters
    Pertandingan(int scoreHome, String awayClub, int scoreAway) {
        this.scoreHome = scoreHome;
        this.awayClub = awayClub;
        this.scoreAway = scoreAway;
        calculateStatistics();
    }

    // Calculate statistics
    // Increment static variable 
    // with each condition
    private void calculateStatistics(){
        if(getScoreHome() > getScoreAway()){
            win++; // Home > Away
        } else if(getScoreHome() < getScoreAway()){
            lose++; // Home < Away
        } else {
            draw++; // Home = Away
        }
    }

    // Getter for home and away
    public int getScoreHome() {
        return scoreHome;
    }

    public String getAwayClub() {
        return awayClub;
    }

    public int getScoreAway() {
        return scoreAway;
    }

    // Getter for home statistics
    public static int getWin(){
        return win;
    }

    public static int getDraw(){
        return draw;
    }

    public static int getLose(){
        return lose;
    }

    // Print for home and away
    public void printHomeAway(){
        System.out.printf("Home : %s, score -> %d\n", "barcelona", getScoreHome());
        System.out.printf("Away : %s, score -> %d\n", getAwayClub(), getScoreAway());
    }

    // Print for home statistics
    public static void printHomeStatistics(){
        System.out.printf("Jumlah menang kandang : %d\n", getWin());
        System.out.printf("Jumlah kalah kandang : %d\n", getLose());
        System.out.printf("Jumlah seri kandang : %d\n", getDraw());
    }
}