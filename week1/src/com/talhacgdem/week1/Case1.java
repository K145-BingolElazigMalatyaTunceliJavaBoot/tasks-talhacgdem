package com.talhacgdem.week1;

import java.util.Random;

public class Case1 {
    Random random = new Random();
    int grade;
    String letterGrade;


    public Case1(){
        grade = random.nextInt(100);
        setLetterGrade();
    }

    public Case1(int grade){
        this.grade = grade;
        setLetterGrade();
    }

    private void setLetterGrade(){
        if (grade > 0 && grade < 35) {          // 0 < grade <= 35 ise FF değeri döndü
            this.letterGrade = "FF";
        } else if (grade >= 35 && grade < 50) { // 35 < grade <= 50 ise DC değeri döndü
            this.letterGrade = "DC";
        } else if (grade >= 50 && grade < 70) { // 50 < grade <= 70 ise BB değeri döndü
            this.letterGrade = "BB";
        } else {                                // 70 < grade <= 100 ise AA değeri döndü
            this.letterGrade = "AA";
        }
    }

    public String getGradeDetails(){
        return this.grade + " -> " + this.letterGrade;
    }

}
