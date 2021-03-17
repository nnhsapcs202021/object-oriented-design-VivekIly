import java.util.Scanner;

/*

The FillInQuestino class extends (i.e., is a subclass of) the Question class.

 */
public class FillInQuestion extends Question {
/*
    Do not declare instance variables for text and answer! The text and answer instance variables are inherited from the Question class.
*/

    /**
     * Constructs a FillInQuestion object with the specified text that contains the answer within.
     *
     * @param question the specified question text with the embedded answer.
     */
    public FillInQuestion(String question) {
        /*
        Explicitly call the Question class's contructor that takes one parameter.
            Calling the super class's constructor *msut* be the first line of code in the subclasses' constructor.

        If we don't explicitly call the super class's constructor, Java will autmoatically call the superclass's default (e.g., no parameters) constructor.
         */
        super(question);
    }

/*
    Use the @Override annotation when overriding a method to help the compiler verify that you in fact overriding and not overloading by mistake.
*/

    /**
     * @param questionText the text of this question
     */
    @Override
    public void setText(String questionText) {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();            // "The inventor of Java is "
        String answer = parser.next();              // "James Gosline"
        question += "___________" + parser.next();  // "_________."

/*
        The inherited instance variables are private; they cannot be directly accessed. We must use the mutator and accessor methods.
*/

/*
        Use the "super" reserved word to call the steText method as defined int he superclass (e.g., Question).
 */

        super.setText(question);

/*
        Should use "this" reserved word to call the setAnswer method. if the subclass doesn't override the method, the superclass's method will be called.

        We don't want to sue "super in this case because if we later override setAnswer, the overriden method would not be called.
 */
        this.setAnswer(answer);
    }
}