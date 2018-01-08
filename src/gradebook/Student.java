
package gradebook;

public class Student extends Rubric {
    private String name;
    private double finalTest;
    private double midtermTest;
    private double[] hwGrades = {0.0};
    private double participation;
    private double[] labGrades = {0.0};
    private Rubric rubric = new Rubric();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFinalTest() {
        return finalTest;
    }

    public void setFinalTest(double finalTest) {
        this.finalTest = finalTest;
    }

    public double getMidtermTest() {
        return midtermTest;
    }

    public void setMidtermTest(double midtermTest) {
        this.midtermTest = midtermTest;
    }

    public double[] getHwGrades() {
        return hwGrades;
    }

    public void setHwGrades(double[] hwGrades) {
        this.hwGrades = hwGrades;
    }

    public double getParticipation() {
        return participation;
    }

    public void setParticipation(double participation) {
        this.participation = participation;
    }

    public double[] getLabGrades() {
        return labGrades;
    }

    public void setLabGrades(double[] labGrades) {
        this.labGrades = labGrades;
    }
    
    public double calculateHwAverage() {
       double sum = 0.0;
       
       for (int i=0; i<hwGrades.length; i++) {
           sum+=hwGrades[i];
       }
       double hwAverage = sum/hwGrades.length;
       
       return hwAverage;
    }
    
    public double calculateLabAverage() {
       double sum = 0.0;
       
       for (int i=0; i<labGrades.length; i++) {
           sum+=labGrades[i];
       }
       double labAverage = sum/labGrades.length;
       
       return labAverage;
    }
    
    public double calculateGrade(Rubric temp) {
        double finalGrade = (finalTest * temp.getFinalWorth()) + (midtermTest*temp.getMidtermWorth()) + (participation * temp.getParticipationWorth()) + (calculateLabAverage() * temp.getLabWorth()) + (calculateHwAverage() * temp.getHwWorth());
        return finalGrade;
    }

    @Override
    public String toString() {
        return "name= " + name + ":\nfinal= " + finalTest + "\nmidterm= " + midtermTest + "\nparticipation= " + participation + "\nhomework= " + calculateHwAverage() + "\nlabs= " + calculateLabAverage() + "\nFinal Grade= " + calculateGrade(rubric);
    }
    
    public Student() {
        name = "";
        finalTest = 0.0;
        midtermTest = 0.0 ;
        
        for (int i = 0; i <hwGrades.length; i++) {
            hwGrades[i] = 0;
        }
        
        participation = 0.0;
        
        for (int i = 0; i <labGrades.length; i++) {
            labGrades[i] = 0;
        }
    }
    
    public Student(Rubric rubric) {
        this.rubric = rubric;
        name = "";
        finalTest = 0.0;
        midtermTest = 0.0 ;
        
        for (int i = 0; i <hwGrades.length; i++) {
            hwGrades[i] = 0;
        }
        
        participation = 0.0;
        
        for (int i = 0; i <labGrades.length; i++) {
            labGrades[i] = 0;
        }
    }

    public Student(String name, double finalTest, double midtermTest, double participation) {
        this.name = name;
        this.finalTest = finalTest;
        this.midtermTest = midtermTest;
        this.participation = participation;
    }
    
    public Student(String name, double finalTest, double midtermTest, double participation, Rubric rubric) {
        this.rubric = rubric;
        this.name = name;
        this.finalTest = finalTest;
        this.midtermTest = midtermTest;
        this.participation = participation;
    }
    
    public Student(String name, double finalTest, double midtermTest, double participation, double[] hwGrades, double[] labGrades) {
        this.name = name;
        this.finalTest = finalTest;
        this.midtermTest = midtermTest;
        this.participation = participation;
        this.hwGrades = hwGrades;
        this.labGrades = labGrades;
    }
    
    public Student(String name, double finalTest, double midtermTest, double participation, double[] hwGrades, double[] labGrades, Rubric rubric) {
        this.name = name;
        this.finalTest = finalTest;
        this.midtermTest = midtermTest;
        this.participation = participation;
        this.hwGrades = hwGrades;
        this.labGrades = labGrades;
        this.rubric = rubric;
    }
}
