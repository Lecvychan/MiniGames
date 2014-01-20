package highscores;

import java.util.*;
import java.io.*;

public class HighscoreManager {
    private ArrayList <Score> scores;

    private static final String HIGHSCORE_FILE = "scores.dat";

    ObjectOutputStream outputStream = null;
    ObjectInputStream inputStream = null;

    public HighscoreManager () {
	scores = new ArrayList <Score> ();
    }
}