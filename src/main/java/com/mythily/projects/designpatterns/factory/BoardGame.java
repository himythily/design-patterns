package com.mythily.projects.designpatterns.factory;

public abstract class BoardGame {
    private String boardGameName;

    public BoardGame(String boardGameName) {
        this.boardGameName = boardGameName;
    }

    public String getBoardGameName() {
        return boardGameName;
    }
    public abstract void play();
    public abstract GameType gameType();
}
