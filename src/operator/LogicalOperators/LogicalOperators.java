package operator.LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean isInterviewQuestionsSent = true, isJavaHomeworkSent = true;
        // sent interview questions or JavaHomework
        System.out.println("The student is okay: " + (isInterviewQuestionsSent || isJavaHomeworkSent));

        // sent interview questions and JavaHomework
        System.out.println(" The student is okay: " + (isInterviewQuestionsSent && isJavaHomeworkSent));
    }
}
