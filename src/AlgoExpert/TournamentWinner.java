package AlgoExpert;

import java.util.*;

public class TournamentWinner {

    public static void main(String[] args) {

        ArrayList<ArrayList<String>> competitions = new ArrayList<>();
        competitions.add(new ArrayList<>(List.of("HTML", "C#")));
        competitions.add(new ArrayList<>(List.of("C#", "Python")));
        competitions.add(new ArrayList<>(List.of("Python", "HTML")));

        ArrayList<Integer> results = new ArrayList<>(List.of(0, 1, 1));

        String ans = tournamentWinner(competitions, results);

        System.out.println(ans);


    }


    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {


        Map<String, Integer> scoreMap = new HashMap<>();
        for(int i = 0; i < results.size(); i++){
            if(results.get(i) == 1){
                scoreMap.put(competitions.get(i).get(0), scoreMap.getOrDefault(competitions.get(i).get(0), 0) + 1);
                scoreMap.put(competitions.get(i).get(1), scoreMap.getOrDefault(competitions.get(i).get(1), 0) - 1);
            }else{
                scoreMap.put(competitions.get(i).get(1), scoreMap.getOrDefault(competitions.get(i).get(1), 0) + 1);
                scoreMap.put(competitions.get(i).get(0), scoreMap.getOrDefault(competitions.get(i).get(0), 0) - 1);
            }
        }

        int max = 0;
        String ans = "";

        System.out.println("map " + scoreMap);

        for(int i = 0; i < competitions.size(); i++){
            ArrayList<String> competition = competitions.get(i);
            if(scoreMap.get(competition.get(0)) >= max){
                max = scoreMap.get(competition.get(0));
                ans = competition.get(0);
            }else{
                max = scoreMap.get(competition.get(1));
                ans = competition.get(1);
            }
        }


        return ans;
    }
}
