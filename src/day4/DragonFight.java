package day4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/test/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth=100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth=100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerAttack=0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonAttack=0;
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String yk=JOptionPane.showInputDialog("would you like to attack by yelling or kicking?"
				+ "(type in either yell or kick)");
		// 9. If they typed in "yell":
		if(yk.equals("yell")) {
			playerAttack = new Random().nextInt(10);
			dragonHealth=dragonHealth - playerAttack;
		}else if(yk.equals("kick")) {
			playerAttack = new Random().nextInt(25);
			dragonHealth -= playerAttack;
		}else {
			playerAttack = new Random().nextInt(5);
		dragonHealth=dragonHealth - playerAttack;
		JOptionPane.showMessageDialog(null,"you patheticly slap the dragon");
		}
			//-- Find a random number between 0 and 10 and store it in dragonDamage
		
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
		
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
dragonAttack = new Random().nextInt(35);	
playerHealth=(playerHealth - dragonAttack);
		// 12. Subtract this number from the player's health
		
		
		
		// 13. If the user's health is less than or equal to 0
		if(playerHealth>0 && dragonHealth>0) {
			JOptionPane.showMessageDialog(null,"your health: "+playerHealth);
			JOptionPane.showMessageDialog(null,"the dragon's health: "+dragonHealth);
		
		}
		}
		
		if(playerHealth<=0 && dragonHealth<=0) { 
			JOptionPane.showMessageDialog(null,"Both you and the dragon are destroyed by another, bigger dragon."); }else {}	
		
		
		
		
 if(playerHealth<=0) {
		JOptionPane.showMessageDialog(null,"you are killed by the dragon. The dragon eats you as a snack the next day. GAME OVER.");}else {
			JOptionPane.showMessageDialog(null,"You killed the dragon, took the gold, and become a legendary (and rich) hero."); 	
		}
			//-- Tell the user that they lost
	
		
		// 14. Else if the dragon's health is less than or equal to 0
		
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		
	

}}