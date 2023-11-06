package org.example.problem_A;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type KWICMain
 */
public class KWICMain {
    public static void main(String[] args) {
        List<Line> lines = new ArrayList<>();
        lines.add(new Line("This is a test sentence"));
        lines.add(new Line("Another example for KWIC"));

        KWICSystem kwicSystem = new KWICSystem(lines);
        List<String> kwic = kwicSystem.getKWIC();

        for (String line : kwic) {
            System.out.println(line);
        }
    }
}
