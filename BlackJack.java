package rock_papperGame;

import java.util.*;

public class BlackJack {
	
	
	public static String playersCards() {
		
		String[]playersCards;
    	playersCards = new String[10];
    	playersCards[0] = "1";
    	playersCards[1] = "2";
    	playersCards[2] = "3";
    	playersCards[3] = "4";
    	playersCards[4] = "5";
    	playersCards[5] = "6";
    	playersCards[6] = "7";
    	playersCards[7] = "8";
    	playersCards[8] = "9";
    	playersCards[9] = "10";
		
	int random = (int) (Math.random()*10);
			{
				System.out.println("Here is your  Card: " + playersCards[random]);
				return playersCards[random];
			}
	}
	
			
	

	public static String playersExtra() {
		 
	
	
		Scanner myObj = new Scanner(System.in);  
		System.out.println("Will you Hold, Or Hit?");
		String userInput = myObj.nextLine(); 
		
		
		
			if ((userInput = myObj.nextLine()) != "Hold") {
				String newCard = playersCards();
					System.out.println("Your  card is: " + newCard);
					System.out.println("Hold Or Hit ");
			}
					else {
        		System.out.println("Your Holding");
        		
        			
			}
				
			return userInput;
	}
	

	public static void main(String[] args) {
		
		
		String card1 = playersCards();
		String card2 = playersCards();
		String card3 = playersCards();
		String card4 = playersCards();
		String myarPlayer[] = {card1, card2};
		String myarComputer[] = {card3, card4};
		//System.out.println(myarPlayer);
		//System.out.println(myarComputer);
	
		playersExtra();
		
	}
	
}


 
