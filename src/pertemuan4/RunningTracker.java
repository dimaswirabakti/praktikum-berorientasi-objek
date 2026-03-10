package pertemuan4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RunningTracker {
    private List<Double> distances;

    public RunningTracker() {
        this.distances = new ArrayList<>();
    }
    public void addDistance(double distance) {
        this.distances.add(distance);
    }
    public double getTotalDistance() {
        double total = 0;
        for (double d : distances) {
            total += d;
        }
        return total;
    }
    public double getAverageDistance() {
        if (distances.isEmpty()) return 0;
        return getTotalDistance() / distances.size();
    }
    public double getLongestDistance() {
        if (distances.isEmpty()) return 0;
        return Collections.max(distances);
    }
    public double getShortestDistance() {
        if (distances.isEmpty()) return 0;
        return Collections.min(distances);
    }
    public double getDistanceDifference() {
        if (distances.isEmpty()) return 0;
        return getLongestDistance() - getShortestDistance();
    }
}