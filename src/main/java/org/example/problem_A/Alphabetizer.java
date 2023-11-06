package org.example.problem_A;

import java.util.Collections;
import java.util.List;

/**
 * todo Document type Alphabetizer
 */
public class Alphabetizer {
    public List<String> alphabetize(List<String> shifts) {
        Collections.sort(shifts);
        return shifts;
    }
}
