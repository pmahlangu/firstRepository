import java.util.*;
public class myGame {
				Random randomNumbers = new Random();
				int answer; // for the correct answer
				
				// ask the user to answer multiplication problems
				public void quiz()
				{
				Scanner input = new Scanner( System.in );
				int guess; // the user's guess
				//call method checkResponse to display the question 
				createQuestion();
				System.out.println( "Enter your answer (-1 to exit):" );
				guess = input.nextInt();
				while ( guess != -1 )
				{
				// call the method to check the user􀳦s answer 
				checkResponse( guess);
				System.out.println( "Enter your answer (-1 to exit):" );
				guess = input.nextInt();
				} // end while
				} // end method
				
				// create  createQuestion method 
				private void createQuestion()
				{
				// get two random numbers between 0 and 9
				// to get two random numbers and store them in variables digit1 and digit2
				int digit1 = randomNumbers.nextInt( 9 );
				int digit2 = randomNumbers.nextInt( 9 );
				// multiply the two variables and store the result in variable answer 
				answer = digit1 * digit2;
//				System.out.printf("How much is %d times %d? \n",digit1,digit2);
				System.out.println("How much is "+ digit1 + " times " + digit2);
				} // end method createQuestion
				// create method checkResponse to checks if the user answered correctly
				private void checkResponse( double guess )
				{
				
				//  tell the user to try again, if the answer is incorrect 
				if (guess != answer)
				{
				System.out.println("Wrong answer. Please try again.");
				}
				else
				System.out.println( "Very Good!" );
				{
				// to call method createQuestion to display another question 
				createQuestion();
				} // end else
				} // end method checkResponse
				public static void main(String[] args){
					// instantiate an object of a type Mygame
					myGame game = new myGame();
					game.quiz();
					game.createQuestion();
					game.checkResponse(0);
					}
	}
