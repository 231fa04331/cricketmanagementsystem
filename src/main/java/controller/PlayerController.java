package controller;

import model.PlayerDatabase;
import model.PlayerModel;
import view.PlayerView;
import java.util.List;

public class PlayerController {
    private PlayerDatabase db;
    private PlayerView view;

    public PlayerController(PlayerDatabase db, PlayerView view) {
        this.db = db;
        this.view = view;
    }

    public void start() {
        boolean running = true;

        while (running) {
            int choice = view.showMenuAndGetChoice();
            switch (choice) {
                case 1:
                    db.addPlayer(view.getPlayerInput());
                    break;
                case 2:
                    view.showAll(db.getAllPlayers());
                    break;
                case 3:
                    view.showPlayer(db.findById(view.getPlayerIdInput()));
                    break;
                case 4:
                    List<PlayerModel> teamPlayers = db.getPlayersByTeam(view.getTeamInput());
                    view.showAll(teamPlayers);
                    break;
                case 5:
                    int id = view.getPlayerIdInput();
                    int[] stats = view.getUpdatedStats();
                    boolean updated = db.updatePlayerStats(id, stats[0], stats[1]);
                    System.out.println(updated ? "Player stats updated." : "Player not found.");
                    break;
                case 6:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
