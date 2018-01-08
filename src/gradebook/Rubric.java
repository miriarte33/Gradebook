
package gradebook;
//Throughout the class we divide the worth by 100 because I am assuming
//the user will enter the worth of each grade as a percentage rather than as a 
//decimal

public class Rubric {
    private double midtermWorth;
    private double finalWorth;
    private double hwWorth;
    private double participationWorth;
    private double labWorth;

    public double getMidtermWorth() {
        return midtermWorth;
    }

    public void setMidtermWorth(double midtermWorth) {
        this.midtermWorth = midtermWorth/100;
    }

    public double getFinalWorth() {
        return finalWorth;
    }

    public void setFinalWorth(double finalWorth) {
        this.finalWorth = finalWorth/100;
    }

    public double getHwWorth() {
        return hwWorth;
    }

    public void setHwWorth(double hwWorth) {
        this.hwWorth = hwWorth/100;
    }

    public double getParticipationWorth() {
        return participationWorth;
    }

    public void setParticipationWorth(double participationWorth) {
        this.participationWorth = participationWorth/100;
    }

    public double getLabWorth() {
        return labWorth;
    }

    public void setLabWorth(double labWorth) {
        this.labWorth = labWorth/100;
    }

    @Override
    public String toString() {
        return "Grading Rubric:\n" + "Final is worth= " + (finalWorth*100) + "%" + "\nMidterm is worth= " + (midtermWorth*100) + "%" + "\nParticipation is worth= " + (participationWorth*100) + "%" + "\nHomework is worth= " + (hwWorth*100) + "%" + "\nLabs are worth= " + (labWorth*100) + "%";
    }
    
    public Rubric() {
        midtermWorth = 0.20;
        finalWorth = 0.20;
        hwWorth = 0.20;
        participationWorth = 0.20;
        labWorth = 0.20;
    }
    
    public Rubric(double finalWorth, double midtermWorth, double participationWorth, double hwWorth, double labWorth) {
        if ((midtermWorth+finalWorth+hwWorth+participationWorth+labWorth)!=100.0) {
            System.exit(0);
        }
        this.midtermWorth = midtermWorth/100;
        this.finalWorth = finalWorth/100;
        this.hwWorth = hwWorth/100;
        this.participationWorth = participationWorth/100;
        this.labWorth = labWorth/100;
    }
    
}
