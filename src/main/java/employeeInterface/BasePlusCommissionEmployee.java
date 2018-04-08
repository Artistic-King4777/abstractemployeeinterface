package employeeInterface;

public class BasePlusCommissionEmployee extends CommissionedEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstN, String lastN, String sSN, double grossSales, double commissionRate, double baseSalary) {
        super(firstN, lastN, sSN, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }


    double earnings() {
        return super.earnings() + getBaseSalary();
    }

    public double getPaymentAmount() {
        return earnings();
    }


    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


