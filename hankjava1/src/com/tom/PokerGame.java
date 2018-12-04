package com.tom;

import java.util.Random;


public class PokerGame {

	public static void main(String[] args) {
		int n = 4;
	    int[] nn = new int[52];
	    
	    Card c =new Card(5);
	    Card[] cards =new Card[52];
	    
	    
		Poker poker = new Poker();
		poker.print();
		 
		
		/* Random random = new Random();
	    System.out.println("The card is");
	    char[] flower ={0x2663,0x2664,0x2665,0x2660};	  
	    int[] num = new int[13+1];
	    
	    num[1] =1;
	    num[2] =2;
	    num[3] =3;
	    num[4] =4;
	    num[5] =5;
	    num[6] =6;
	    num[7] =7;
	    num[8] =8;
	    num[9] =9;
	    num[10] =10;
	    num[11] =11;
	    num[12] =12;
	    num[13] =13;
	    System.out.println(num.length);
	    char f = 0x2663;
	    for(int i =0;i<num.length;i++){
	    	System.out.println(num[i]);	
	    	System.out.println(f);
	    }*/
	    /*for(int i=0;i<52;i++){  
	      int x = random.nextInt(13)+1;
		  int y = random.nextInt(4)+1;
		  switch(y){
		  case 1:
			  System.out.println("S"+x);
			  break;
		  case 2:	
			  System.out.println("H"+x);
			  break;
		  case 3:
			  System.out.println("D"+x);
			  break;
		  case 4:
			  System.out.println("C"+x);
		      break;
		  }
		 }
			
			
			/*if(y == 1){
		    	System.out.println("S"+x);
		    }
		    if(y==2){
		    	System.out.println("H"+x);
		    }
		    if(y == 3){
		    	System.out.println("D"+x);
		    }
		    if(y == 4){
		    	System.out.println("C"+x);
		    	
		   
		}*/
	}
 }

	