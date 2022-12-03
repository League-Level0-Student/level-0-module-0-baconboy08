package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
int score = 0;		
		// ASK A QUESTION AND CHECK THE ANSWER
String input = JOptionPane.showInputDialog("is a house big");	
System.out.println(input);
if (input.equals("yes")) {
	score = score + 1;
}else {
	score = score - 1;
}
System.out.println(score);
String input2 = JOptionPane.showInputDialog("is a house small");	
System.out.println(input2);
if (input2.equals("no")) {
	score = score + 1;
}else {
	score = score - 1;
}
System.out.println(score);



String input3 = JOptionPane.showInputDialog("is a elephant big");	
System.out.println(input3);
if (input3.equals("yes")) {
	score = score + 1;
}else {
	score = score - 1;
}
System.out.println(score);

JOptionPane.showMessageDialog(null,score);
				// 2.  Ask the user a question 
				
				// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
