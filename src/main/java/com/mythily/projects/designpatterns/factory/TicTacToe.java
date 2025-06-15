package com.mythily.projects.designpatterns.factory;

public class TicTacToe extends BoardGame{
    public TicTacToe(String name) {
        super(name);
    }
    @Override
    public void play() {
        //Tic Tac Toe game logic
        System.out.println("Tic-Tac-Toe");
    }

    @Override
    public GameType gameType() {
        return GameType.TIC_TAC_TOE;
    }
}
