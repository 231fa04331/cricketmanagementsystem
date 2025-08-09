package view;

import java.util.List;
import java.util.Scanner;
import model.PlayerModel;

public class PlayerView {
    private Scanner sc = new Scanner(System.in);

    public PlayerModel getPlayerInput() {
        System.out.print("Enter Player ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Team: ");
        String team = sc.nextLine();

        System.out.print("Enter Role: ");
        String role = sc.nextLine();

        System.out.print("Enter Runs: ");
        int runs = sc.nextInt();

        System.out.print("Enter Wickets: ");
        int wickets = sc.nextInt();

        return new PlayerModel(id, name, team, role, runs, wickets);
    }

    public int getPlayerIdInput() {
        System.out.print("Enter Player ID: ");
        return sc.nextInt();
    }

    public String getTeamInput() {
        System.out.print("Enter Team Name: ");
        sc.nextLine();
        return sc.nextLine();
    }

    public void showPlayer(PlayerModel player) {
        if (player != null) {
            System.out.println(player);
        } else {
            System.out.println("Player not found.");
        }
    }

    public void showAll(List<PlayerModel> players) {
        if (players.isEmpty()) {
            System.out.println("No players found.");
        } else {
            for (PlayerModel p : players) {
                System.out.println(p);
            }
        }
    }

    public int showMenuAndGetChoice() {
        System.out.println("\n--- IPL Player Management ---");
        System.out.println("1. Add Player");
        System.out.println("2. View All Players");
        System.out.println("3. View Player by ID");
        System.out.println("4. View Players by Team");
        System.out.println("5. Update Player Stats");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public int[] getUpdatedStats() {
        System.out.print("Enter Updated Runs: ");
        int runs = sc.nextInt();
        System.out.print("Enter Updated Wickets: ");
        int wickets = sc.nextInt();
        return new int[]{runs, wickets};
    }
}
