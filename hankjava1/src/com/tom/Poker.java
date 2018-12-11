package com.tom;

public class Poker {
   public Poker(){
	 int cards[] = new int [52];
	 char y ;
   } 	  	 
     public void print(){
   
    	 for(int i =0;i<52;i++){
    		 char y = 0;
    	 
    	 	    	 switch(i/13){
    	 			  case 0:
    	 				  y ='\u2660';
    	 				  break;
    	 			  case 1:	
    	 				  y ='\u2663';
    	 				  break;
    	 			  case 2:
    	 				  y ='\u2665';
    	 				  break;
    	 			  case 3:
    	 				 y = '\u2666';
    	 			      break;
    	 			  }   	
    		 System.out.print(i%13+1+""+y+" ");	  
    	 if(i%13==12){
    	 System.out.println();
    	 
    	 }
   }
}
}