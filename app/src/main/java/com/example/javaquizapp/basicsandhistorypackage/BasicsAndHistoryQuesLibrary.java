package com.example.javaquizapp.basicsandhistorypackage;

public class BasicsAndHistoryQuesLibrary {
    // We need 3 arrays
    // 1st would hold the questions
    String mQuestions[] = {
            "Range of Byte Data Type is ____________",
            "Which of the following is NOT a primitive data type?",
            "JVM is a ____________",
            "The first public implementation was ___________",
            "Java is called as platform independent language. Do you agree with this statement?",
            "Which of the following personality is called as father of Java Programming Language",
            "Java Programming was designed by",
            "Which of the tool is used to compile java code?",
            "Integer Data type does not include following primitive data type",
            "Java was publicly released with it's First Version in _______________"
    };

    // 2nd is Choices
    String mChoices[][] = {
            {"-128 to 256","-127 to 128","-128 to 127"},
            {"short","byte","enum"},
            {"Debugger","Compiler","Interpreter"},
            {"Java 1.1","1.0","0.1"},
            {"Yes","No","Null"},
            {"Bill Gates","James Gosling","Charles Babage"},
            {"Microsoft","Sun Microsystems","Google"},
            {"jar","java","javac"},
            {"double","long","short"},
            {"May 27 1993","Feb 27 1995","Jan 23 1996"}

    };
    String mCorrectAnswers[] = {
            "-128 to 127",
            "enum",
            "Interpreter",
            "1.0",
            "Yes",
            "James Gosling",
            "Sun Microsystems",
            "javac",
            "double",
            "Jan 23 1996"
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
