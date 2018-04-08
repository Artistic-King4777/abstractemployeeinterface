package employeeInterface;

public class SalariedEmployee extends Employee{

    private double weeklySal; //weekly salary


    public SalariedEmployee(String firstN, String lastN, String sSN, double weeklySal) {
        super(firstN, lastN, sSN);
        this.weeklySal = weeklySal;
    }

    double earnings() {
        return getWeeklySal();
    }


    public double getPaymentAmount() {
        return earnings();
    }




    public double getWeeklySal() {
        return weeklySal;
    }

    public void setWeeklySal(double weeklySal) {
        this.weeklySal = weeklySal;
    }

    @Override
    public String toString() {
        return super.toString();
    }



}
