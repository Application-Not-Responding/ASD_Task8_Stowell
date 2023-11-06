package org.example.problem_A;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type CircularShift
 */
public class CircularShift {
    public List<String> generateCircularShifts(Line line) {
        List<String> shifts = new ArrayList<>();
        List<String> words = line.getWords();
        int n = words.size();
        for (int i = 0; i < n; i++) {
            StringBuilder shift = new StringBuilder();
            for (int j = 0; j < n; j++) {
                shift.append(words.get((i + j) % n)).append(" ");
            }
            shifts.add(shift.toString().trim());
        }
        return shifts;
    }
}
