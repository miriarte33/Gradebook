/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebook;

import java.util.Scanner;

public class GradeBook {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to your Gradebook!");
        System.out.println("Let's begin by customizing your Grading Rubric.");

        double finalExam, midterm, participation, hw, labs;
        do {
            System.out.println("Enter the following values as percentages. The sum of all the values must equal 100.");
            System.out.println("How much is the Final Exam worth?");

            do {
                finalExam = input.nextDouble();
            } while (finalExam < 1);

            System.out.println("How much is the Midterm Exam worth?");

            do {
                midterm = input.nextDouble();
            } while (midterm < 1);

            System.out.println("How much is participation worth?");

            do {
                participation = input.nextDouble();
            } while (participation < 1);

            System.out.println("How much is homework worth?");

            do {
                hw = input.nextDouble();
            } while (hw < 1);

            System.out.println("How much are labs worth?");

            do {
                labs = input.nextDouble();
            } while (labs < 1);

        } while ((labs + hw + participation + midterm + finalExam) != 100);

        Rubric TeacherRubric = new Rubric(finalExam, midterm, participation, hw, labs);
        System.out.println(TeacherRubric);

        System.out.println("Let's now enter the information for your students.");
        System.out.println("How many students are in your class?");

        int classSize = input.nextInt();
        input.nextLine();//this is done so we could enter strings later b/c this consumes the \n character

        Student[] students = new Student[classSize];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(TeacherRubric);//must initialize all the students so they're not null
        }

        System.out.println("Enter all of the students names");
        for (Student student : students) {
            student.setName(input.nextLine());
        }

        System.out.println("==============================");

        for (Student student : students) {
            System.out.println(student.getName() + " Final Exam grade: ");
            student.setFinalTest(input.nextDouble());
        }

        System.out.println("==============================");

        for (Student student : students) {
            System.out.println(student.getName() + " Midterm grade: ");
            student.setMidtermTest(input.nextDouble());
        }

        System.out.println("==============================");

        for (Student student : students) {
            System.out.println(student.getName() + " Participation grade: ");
            student.setParticipation(input.nextDouble());
        }

        System.out.println("==============================");

        System.out.println("How many homeworks did you assign for your students?");

        int hwAmount = input.nextInt();

        for (Student student : students) {
            System.out.println(student.getName() + " Homework grades: ");
            double[] hwGrades = new double[hwAmount];//create new array each loop
            for (int j = 0; j < hwGrades.length; j++) {
                hwGrades[j] = input.nextDouble();
            }
            student.setHwGrades(hwGrades);
        }

        System.out.println("==============================");

        System.out.println("How many labs did you assign for your students?");

        int labAmount = input.nextInt();

        for (Student student : students) {
            System.out.println(student.getName() + " Lab grades: ");
            double[] labGrades = new double[labAmount];//create new array each loop
            for (int j = 0; j < labGrades.length; j++) {
                labGrades[j] = input.nextDouble();
            }
            student.setLabGrades(labGrades);
        }

        input.nextLine();

        System.out.println("==============================");

        String studentName;
        System.out.println("Enter a students name to see there grades. Enter -1 to stop viewing grades.");

        do {
            for (Student student : students) {
                System.out.println(student.getName());
            }
            studentName = input.nextLine();
            for (Student student : students) {
                if(studentName.equals(student.getName())) {
                    System.out.println(student);
                    System.out.println();
                }
            }
        } while (!"-1".equals(studentName));

        }

    }
