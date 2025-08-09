package main;

import controller.PlayerController;
import model.PlayerDatabase;
import view.PlayerView;

public class PlayerMain {
    public static void main(String[] args) {
        PlayerDatabase db = new PlayerDatabase();
        PlayerView view = new PlayerView();
        PlayerController controller = new PlayerController(db, view);
        controller.start();
    }
}
