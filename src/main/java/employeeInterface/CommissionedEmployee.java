package employeeInterface;

public class CommissionedEmployee extends Employee {

    private double grossSales;
    private double commissionRate;

    public CommissionedEmployee(String firstN, String lastN, String sSN, double grossSales, double commissionRate) {
        super(firstN, lastN, sSN);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    public double getPaymentAmount() {
        return earnings();
    }



    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}