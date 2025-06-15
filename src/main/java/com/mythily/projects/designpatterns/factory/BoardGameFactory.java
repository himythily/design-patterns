package com.mythily.projects.designpatterns.factory;

public class BoardGameFactory {
    public static BoardGame createBoardGame(GameType gameType, String name) {
        switch (gameType) {
            case TIC_TAC_TOE:
                return new TicTacToe(name);
            case LUDO:
                return new LudoBoardGame(name);
            case CHESS:
                return new ChessBoardGame(name);
            default: return null;
        }
    }
}
