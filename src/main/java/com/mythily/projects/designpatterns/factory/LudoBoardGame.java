package com.mythily.projects.designpatterns.factory;

public class LudoBoardGame extends BoardGame{
    public LudoBoardGame(String name) {
        super(name);
    }
    @Override
    public void play() {
        //Ludo game logic
        System.out.println("Ludo Board Game");
    }

    @Override
    public GameType gameType() {
        return GameType.LUDO;
    }
}
