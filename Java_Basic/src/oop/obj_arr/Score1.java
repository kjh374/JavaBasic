package oop.obj_arr;

public class Score1 {

    private String name;
    private int korean;
    private int english;
    private int math;
    private int total;
    private double average;
    
    Score1() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
    
    
    
    public void scoreCalc() {
        this.total = this.korean+this.english+this.math;
        this.average = this.total/3.0;    
    }
    
    public void scoreInfo() {
        System.out.printf("이름: %s   국어성적: %d   영어성적: %d   수학성적: %d   총점: %d   평균: %.2f\n"
                ,this.name, this.korean, this.english, this.math, this.total, this.average );
    }
    
}
