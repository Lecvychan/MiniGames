package highscores;
import java.util.Comparator;

public class Compare implements Comparator<Score> {
    public int compare (Score score1, Score score2) {

	int s1 = score1.getScore ();
	int s2 = score2.getScore ();

	if (s1 > s2) 
	    return -1;
	if (s1 < s2)
	    return 1;
	else 
	    return 0;
    }
}