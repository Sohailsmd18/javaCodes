import java.util.ArrayList;
import java.util.HashMap;
public class AvgScores {
    public static void main(String[] args) {
        String[][] s = {{"Bobby", "87"},{"Charles", "100"},{"Eric", "64"},{"Charles", "22"}
        };
        HashMap<String, ArrayList<Integer>> hm = new HashMap<>();
        int n = s.length;
        for (int i = 0; i < n; i++) {
            String name = s[i][0];
            int score = Integer.parseInt(s[i][1]);

            if (hm.containsKey(name)) {
                hm.get(name).add(score);
            } else {
                ArrayList<Integer> scores = new ArrayList<>();
                scores.add(score);
                hm.put(name, scores);
            }
        }
        int max = 0;
        for (String name : hm.keySet()) {
            ArrayList<Integer> scores = hm.get(name);
            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            int avg = sum / scores.size();
            max = Math.max(max, avg);
        }

        System.out.println(max);
    }
}