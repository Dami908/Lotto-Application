package emmanuel_Ajayi_sec008_exercise1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionBank {
//initialize variables
Boolean isCorrect;
int score=0;
int total;
Scanner input=new Scanner(System.in);
Random rnd = new Random();

public  Question[] simulateQuestion() {
	//Simulate the question
	ArrayList<Question> questions = new ArrayList<Question>();
	questions.add(new Question("Information is passed to a method in?", "1.The method name", "2.The arguments to the method", "3.Thats's methods return", "4.The methods body", 2));
	questions.add(new Question("A well designed method?", "1.Perform a single,well defined task", "2.Performs multiple unrelated tasks", "3.Repeats code found in other methods", "4.Contains thousands of lines of code", 1));
	questions.add(new Question("Which of the following methods is not in the math class?", "1.Ceil", "2.Parse int", "3.abs", "4.Log", 2));
	questions.add(new Question("A field declared with keyword_________________is constant?", "1.Static", "2.Const", "3.Constan", " 4.Final", 4));
	questions.add(new Question("Which operator can be used in string concactenation?", "1. *", "2. ++", "3. +=", "4.=+", 3));
	
	//Compares questions to ensure that no two questions are shown more than once
	Question[] questionsInPlay = new Question[5];
	Question temp = new Question();
	boolean exists = false;
	for (int i = 0; i < 5; i++) {
		do {
			temp = questions.get(rnd.nextInt(5));
			for (int j = 0; j < questionsInPlay.length; j++) {
				if (questionsInPlay[j] != null) {
					if (questionsInPlay[j].question == temp.question) {
						exists = true;
					} 
					else {
						exists = false;
					}
				}
			}
		} while (exists == true);
		questionsInPlay[i] = temp;
	}
	return questionsInPlay;
}
public void inputAnswer()
{
	//Calls for the users input
	int userAnswer;
	Question[] questions = simulateQuestion();
	for (int i = 0; i < questions.length; i++) {
		System.out.println(questions[i].toString());
		System.out.print("Select your answer: ");
		userAnswer = input.nextInt();
		generateMessage(CheckAnswer(questions[i], userAnswer));
		System.out.printf("Your  score is %d out of 5\n",score);
		total=(int)(score*100)/5;
		System.out.printf("Your  percentage is %d percent",total);
	}
}
public boolean CheckAnswer(Question question, int userAnswer) 
{
	//Checks if user input is correct
	if (question.rightAnswer == userAnswer) {
		isCorrect = true;
		score++;
	}
	else {
		isCorrect = false;
	}
	return isCorrect;
}

public void generateMessage(boolean result) {
	//returns a random message depending on the results from the user
	if (result) {
		int message = rnd.nextInt(4);
		switch (message) {
		case 0:
			System.out.println("Good!");
			break;
		case 1:
			System.out.println("Excellent");
			break;
		case 2:
			System.out.println("Keep up the good work");
			break;
		default:
			System.out.println("Nice done!");
		}
	}
	else {
		int message = rnd.nextInt(4);
		switch (message) {
		case 0:
			System.out.println("No.Please try again");
			break;
		case 1:
			System.out.println("Wrong.Try once more");
			break;
		case 2:
			System.out.println("Dont give up");
			break;
		default:
			System.out.println("No keep trying");
		}
	}
}


}
