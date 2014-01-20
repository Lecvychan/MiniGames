package highscores;

import java.io.Serializable;

public class Score implements Serializable {
    private int score;

    public Score (int score) {
	this.score = score;
    }
    public int getScore () {
	return score;
    }
}