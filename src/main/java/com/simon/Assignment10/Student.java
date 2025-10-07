package com.simon.Assignment10;

public class Student {

    int score;    // 1 - 100;
    String grade; // ig, g, vg

    public Student() {

    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGradeBasedOnCurrentScore() {

        if( this.score >= 75 )
            return "vg";

        else if( this.score >= 50 )
            return "g";

        else
            return "ig";
    }
}
