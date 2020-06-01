package emmanuel_Ajayi_sec008_exercise1;
//This is a question class which has public access and is used by the QuestionBank class
public class Question {
	// Class has members
			// First type of members are instance variables / data members
			// they represent attributes of a class
			// they are initialized with default values
	String question;
	String answer1;
	String answer2;
	String answer3;
	String answer4;
	int rightAnswer;
	
	// constructor
	public Question() {}
	
	// Next member type is constructor
		// it has same name as class name
		// can not have return type
		// invoked automatically with the creation of an object
		// purpose is to initialize object's data at the time of creating the object
	public Question(String quest, String ans1, String ans2, String ans3, String ans4, int right) {
		question = quest;
		answer1 = ans1;
		answer2 = ans2;
		answer3 = ans3;
		answer4 = ans4;
		rightAnswer = right;
	}
	@Override
	//to string method
	public String toString() {
		return "\n\n"+question+"\n"+answer1+"\n"+answer2+"\n"+answer3+"\n"+answer4;
	}
}
