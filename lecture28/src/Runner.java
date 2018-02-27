public class Runner {

    public static void main(String[] args) {

        displayHighScorePosition("John",calculateHighScorePosition(1500));
        displayHighScorePosition("Frank",calculateHighScorePosition(900));
        displayHighScorePosition("Ros",calculateHighScorePosition(400));
        displayHighScorePosition("Greg",calculateHighScorePosition(50));

    }
    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the high score table");

    }
    public static int calculateHighScorePosition(int score) {

        if (score>=1000) {
            return 1;
        }
        else if (score >= 500 && score < 1000) {
            return 2;
        }
        else if (score >= 100 && score < 500) {
            return 3;
        }
        return 4;

    }
}
