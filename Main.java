package net.mytrivia2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* My trivia part 2 with methods*/


        String[] que = new String[6];
        que[0] = "If x = 12 and y = 12, solve x * y";
        que[1] = "if z = -200, what is the absolute value of z?";
        que[2] = "if z = -200, x = 12, and y = 12...what is  |z| - x * y ?";
        que[3] = "what is |z| + x * y?";
        que[4] = "what is 344 - 56?";
        que[5] = "Do you wish to play again?";


        String[] ans = new String[6];
        ans[0] = "144";
        ans[1] = "200";
        ans[2] = "56";
        ans[3] = "344";
        ans[4] = "288";
        ans[5] = "yes";

        outputQuestionsAndAnswers(que, ans);
        myScore(que, ans);

    }


    public static void outputQuestionsAndAnswers(String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(questions[0]);
            if (scanner.next().equals(answers[0])) {
                System.out.println("Correct Answer!");


                System.out.println(questions[1]);
                if (scanner.next().equals(answers[1])) {
                    System.out.println("Correct answer!");

                    System.out.println(questions[2]);
                    if (scanner.next().equals(answers[2])) {
                        System.out.println("Correct Answer!");

                        System.out.println(questions[3]);
                        if (scanner.next().equals(answers[3])) {
                            System.out.println("Correct Answer");

                            System.out.println(questions[4]);
                            if (scanner.next().equals(answers[4])) {
                                System.out.println("Correct Answer!");




                            } else { // belongs to fourth if statement
                                while (!scanner.nextLine().equalsIgnoreCase(answers[4])) {
                                    System.out.println("Incorrect answer... try again!");
                                    System.out.println(questions[4]);



                                }
                                System.out.println("Correct answer!");
                                System.out.println("but start over and try to get all correct answers!");


                            }
                        } else { // belongs to third if statement
                            while (!scanner.nextLine().equalsIgnoreCase(answers[3])) {
                                System.out.println("Incorrect answer... try again!");
                                System.out.println(questions[3]);


                            }
                            System.out.println("Correct Answer!");
                            System.out.println("but start over and try to get all correct answers!");


                        }
                    } else { // Belongs to second if statement
                        while (!scanner.nextLine().equalsIgnoreCase(answers[2])) {
                            System.out.println("Incorrect answer... try again!");
                            System.out.println(questions[2]);


                        }
                        System.out.println("Correct answer!");
                        System.out.println("but start over and try to get all correct answers!");


                    }


                } else { // Belongs to First if statement
                    while (!scanner.nextLine().equalsIgnoreCase(answers[1])) {
                        System.out.println("Incorrect answer... try again!");
                        System.out.println(questions[1]);

                    }
                    System.out.println("Correct Answer!");
                    System.out.println("but start over and try to get all correct answers!");


                }

                {
                }


            } else {
                System.out.println("Incorrect answer... try again!");
                continue;

            }
break;

        }


    }

    public static void myScore(String[] questions, String[] answers) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Your scored a 5 out 5! Congratulations!!!!");
            System.out.println(questions[5]);
            if (scanner.next().equals("yes")) {
                outputQuestionsAndAnswers(questions, answers);
            }else{
                System.out.println("Have a nice day!!! goodbye!!!");
                break;
            }



        }


    }

}




















































