package edu.cnm.deepdive.cards;

import java.util.Comparator;

public class Test {
  public static void main(String[] args) {
// Local Class
//    class AlternateSorter implements Comparator<Card> {
//
//      @Override
//      public int compare(Card card1, Card card2) {
//        if(card1.rank != card2.rank){
//          return  card1.rank.compareTo(card2.rank);
//        }
//        return  card1.suit.compareTo(card2.suit);
//      }
//
//    }
    Deck deck = new Deck();
    deck.shuffle();
    System.out.println(deck);
    deck.sort();
    System.out.println(deck);
    // Anonymous class
//    deck.sort(new Comparator<Card>() {
//      @Override
//      public int compare(Card card1, Card card2) {
//          if(card1.rank != card2.rank){
//            return  card1.rank.compareTo(card2.rank);
//          }
//          return  card1.suit.compareTo(card2.suit);
//        }
//    });

// lambda Expression, with explicit body and return
//    deck.sort((card1, card2) -> {
//      if(card1.rank != card2.rank){
//        return  card1.rank.compareTo(card2.rank);
//      }
//      return  card1.suit.compareTo(card2.suit);
//    });
    // lambda Expression,with implicit body and return
    deck.sort((card1, card2) -> (card1.rank != card2.rank)
        ? card1.rank.compareTo(card2.rank)
        :card1.suit.compareTo(card2.suit));

    System.out.println(deck);
  }

//Nested Class
//  private static class AlternateSorter implements Comparator<Card> {
//
//    @Override
//    public int compare(Card card1, Card card2) {
//      if(card1.rank != card2.rank){
//        return  card1.rank.compareTo(card2.rank);
//      }
//      return  card1.suit.compareTo(card2.suit);
//    }
//
//  }
}

// Top-Level  (non-public) Class
//  class AlternateSorter implements Comparator<Card> {
//
//    @Override
//    public int compare(Card card1, Card card2) {
//      if(card1.rank != card2.rank){
//        return  card1.rank.compareTo(card2.rank);
//      }
//      return  card1.suit.compareTo(card2.suit);
//    }
//
//  }


