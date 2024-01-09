package Week6.Ex_06_10_Playing_cards;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Card {

    private String suit;
    private String rank;

    public Card(String suit,String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        System.out.println("How many cards would you like? (1..5) 1");
        int cardCount = keyboard.nextInt();



        String[] suits = {
                "clubs", "diamonds", "spades", "hearts"
        };
        String[] ranks = {
                "ace", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "jack", "queen", "king"
        };

        Card card1 = new Card("clubs", "ace");
        Card card2 = new Card("clubs", "ace");
        Card[] cards = new Card[52];



        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[i* ranks.length+j] = new Card(suits[i],ranks[j]);
//                switch (i){
//                    case 0:cards[j] = new Card(suits[i],ranks[j]); break;
//                    case 1:cards[j+13] = new Card(suits[i],ranks[j]); break;
//                    case 2:cards[j+26] = new Card(suits[i],ranks[j]); break;
//                    case 3:cards[j+39] = new Card(suits[i],ranks[j]); break;
//                }
            }
        }

        Card[] selectedCards=new Card[cardCount];

        Random random = new Random();

        System.out.println();

        for (int i = 0; i < selectedCards.length; i++) {
            selectedCards[i]=cards[random.nextInt(51)];
            System.out.printf("%s of %s\n",selectedCards[i].getRank(),selectedCards[i].getSuit());
        }








    }
}
