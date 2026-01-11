
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int teamMatches = 0;
        int teamTotalWins = 0;
        int teamTotalLosses = 0;
        
        try(Scanner file = new Scanner(Paths.get(fileName))) {
            while(file.hasNextLine()) {
                String[] matchInfo = file.nextLine().split(",");
                
                String homeTeam = matchInfo[0];
                int homeTeamPoints = Integer.valueOf(matchInfo[2]);
                
                String visitingTeam = matchInfo[1];
                int visitingTeamPoints = Integer.valueOf(matchInfo[3]);
                
                if(homeTeam.equals(teamName)) {
                    teamMatches++;
                    
                    if(homeTeamPoints > visitingTeamPoints) {
                        teamTotalWins++;
                        continue;
                    }
                    
                    teamTotalLosses++;
                }
                
                if(visitingTeam.equals(teamName)) {
                    teamMatches++;
                    
                    if(visitingTeamPoints > homeTeamPoints) {
                        teamTotalWins++;
                        continue;
                    }
                    
                    teamTotalLosses++;
                }
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Games: " + teamMatches);    
        System.out.println("Wins: " + teamTotalWins);
        System.out.println("Losses: " + teamTotalLosses);
    }
}
