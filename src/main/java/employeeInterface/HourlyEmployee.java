package employeeInterface;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

    public HourlyEmployee(String firstN, String lastN, String sSN, double wage, double hours) {
        super(firstN, lastN, sSN);
        this.wage = wage;
        this.hours = hours;
    }

    double earnings() {
        return getWage() * getHours();
    }


    public double getPaymentAmount() {
        return earnings();
    }



    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public String toString() {
        return super.toString();
    }

}

