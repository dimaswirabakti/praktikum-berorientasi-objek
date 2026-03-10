package pertemuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScoreManager {
    private List<Double> scores;

    public ScoreManager() {
        this.scores = new ArrayList<>();
    }
    public void addScore(double score) {
        this.scores.add(score);
    }
    public double getTotalScore() {
        double total = 0;
        for (double score : scores) {
            total += score;
        }
        return total;
    }
    public double getAverageScore() {
        if (scores.isEmpty()) return 0;
        return getTotalScore() / scores.size();
    }
    public double getHighestScore() {
        if (scores.isEmpty()) return 0;
        return Collections.max(scores);
    }
    public double getLowestScore() {
        if (scores.isEmpty()) return 0;
        return Collections.min(scores);
    }
    public double getScoreDifference() {
        if (scores.isEmpty()) return 0;
        return getHighestScore() - getLowestScore();
    }
}