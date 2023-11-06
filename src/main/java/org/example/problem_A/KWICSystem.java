package org.example.problem_A;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type KWICSystem
 */
public class KWICSystem {
    private List<String> circularShifts;

    public KWICSystem(List<Line> lines) {
        circularShifts = new ArrayList<>();
        CircularShift circularShifter = new CircularShift();
        Alphabetizer alphabetizer = new Alphabetizer();

        for (Line line : lines) {
            circularShifts.addAll(circularShifter.generateCircularShifts(line));
        }

        circularShifts = alphabetizer.alphabetize(circularShifts);
    }

    public List<String> getKWIC() {
        return circularShifts;
    }
}
