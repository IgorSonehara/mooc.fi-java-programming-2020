 
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class SportStatistics {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine(); 
        
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        // we create a scanner for reading the file
        try (Scanner f = new Scanner(Paths.get(file))) {
 
            // we read all the lines of the file
            while (f.hasNextLine()) {
                String line = f.nextLine();
 
                if (line.equals("")) {
                    break;
                }
 
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam  = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                
                //ENCE,Vitality,9,16
                if (team.equals(homeTeam) || team.equals(visitingTeam)) {
                    gamesPlayed++;
                }
                if (team.equals(homeTeam)) {
                    if (homeTeamPoints > visitingTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                } 
                if (team.equals(visitingTeam)) {
                    if (visitingTeamPoints > homeTeamPoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
 
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}