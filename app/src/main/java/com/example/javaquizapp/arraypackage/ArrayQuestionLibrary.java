package com.example.javaquizapp.arraypackage;

public class ArrayQuestionLibrary {
    // We need 3 arrays
    // 1st would hold the questions
    String mQuestions[] = {
            "What will this code print?\nint arr[] = new int [5];\nSystem.out.print(arr);",
            "In Java, each array object has a final field named ________ that stores the size of the array",
            "Which of these is an incorrect statement?",
            "Which of the following declaration of the array contains error?",
            "The 4th element in an array has an index __________.",
            "Which of these operators is used to allocate memory to an array variable in Java?",
    };

    // 2nd is Choices
    String mChoices[][] = {
            {"0","00000","Garbage Value"},
            {"width","size","length"},
            {"It is necessary to use new operator to initialize an array","Array can be initialized using comma separated expressions surrounded by curly braces","Array can be initialized when they are declared"},
            {"int x[] = int[10]","float d[] = {1,2,3}","char Java[]={'g','p','a'}"},
            {"4","Unknown","3"},
            {"malloc","alloc","new"}
    };
    String mCorrectAnswers[] = {
            "Garbage Value",
            "length",
            "It is necessary to use new operator to initialize an array",
            "int x[] = int[10]",
            "3",
            "new"
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
