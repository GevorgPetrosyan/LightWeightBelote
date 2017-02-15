package com.company.belote;

import java.util.*;

/**
 * Created by gpetrosy on 11-Feb-17.
 */
public class Game {
    private CardDealer dealer;
    private List<Player> players;
    private Queue<Card> playedGame =new LinkedList<>();

    public Game(CardDealer dealer, List<Player> players) {
        this.dealer = dealer;
        this.players = players;
        Collections.shuffle(players,new Random(System.nanoTime()));
    }

    public void startGame(){
        dealer.dealCards(players);
        while (true){
            Player firstPlayer = players.get(0);
            if (!firstPlayer.hasCard()){
                break;
            }
            Card card = firstPlayer.play();
            playedGame.add(card);
            for (int i=1;i<4;i++){
                Player nextPlayer = players.get(i);
                playedGame.add(nextPlayer.play(card.getType()));
            }
        }
    }
    public void printGame(){
        while (!playedGame.isEmpty()){
            System.out.print(playedGame.remove()+"|");
            System.out.print(playedGame.remove()+"|");
            System.out.print(playedGame.remove()+"|");
            System.out.println(playedGame.remove());
        }
    }
}
