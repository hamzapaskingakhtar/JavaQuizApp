package com.example.javaquizapp.controlstatementspackage;

public class ControlStatementsQuestionLibrary {
    // We need 3 arrays
    // 1st would hold the questions
    String mQuestions[] = {
            "The Java if statement",
            "Which of these are selection statements in Java?",
            "Which of these statements can skip processing remainder of code in its body for a particular iteration?",
            "Which of the following is not a valid flow control statement?",
            "The condition statement,____________ can only test for equality, whereas ________ can evaluate any type of BOOLEAN expression",
            "Which of the following loops will execute the body of loop even when condition controlling the loop is initially false",
            "__________ statement provides an easy way to dispatch execution to different parts of your code based on the value of the expression",
            "What is true about break?"
    };

    // 2nd is Choices
    String mChoices[][] = {
            {"Evaluates whether an expression is equal or not","Evaluates whether an expression is true or false","Evaluates whether an expression is less than or more than a number"},
            {"if()","for()","break"},
            {"return","break","continue"},
            {"exit()","break","return"},
            {"if,switch","switch,if","while,if"},
            {"do-while","while","for"},
            {"if()-else()","switch()","if()"},
            {"Break stops the execution of entire program","Break halts the execution and forces the control out of the loop","Break forces the control out of the loop and starts the execution of next iteration"}
    };
    String mCorrectAnswers[] = {
            "Evaluates whether an expression is true or false",
            "if()",
            "continue",
            "exit()",
            "switch,if",
            "do-while",
            "switch()",
            "Break halts the execution and forces the control out of the loop"
    };
    public String getQuestion(int a) // returns question from the mQuestion array
    {
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a) // return the first item in an array of the mChoices
    {
        String choice1 = mChoices[a][0];
        return choice1;
    }
    public String getChoice2(int a) // return the second item in an array of the mChoices
    {
        String choice2 = mChoices[a][1];
        return choice2;
    }
    public String getChoice3(int a) // return the third item in an array of the mChoices
    {
        String choice3 = mChoices[a][2];
        return choice3;
    }
    public String getCorrectAnswer (int a) // This would get the correct answer
    {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
