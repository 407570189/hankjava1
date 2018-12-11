package com.tom;

public class Card2 {
   String suits = "\u2663\u2666\u2665\u2660";
   int value;
   public Card2(int value){
	   this.value = value;
   }
   public String get(){
	   int type = value/13;
	   int num = value%13+1;
	   return num+""+suits.charAt(type);
   }
}
