package com.mythily.projects.designpatterns.factory;

public class ChessBoardGame extends BoardGame{
    public ChessBoardGame(String name) {
        super(name);
    }
    @Override
    public void play() {
        //Chess board game logic goes here
        System.out.println("Play chess game");
    }

    @Override
    public GameType gameType() {
        return GameType.CHESS;
    }
}
