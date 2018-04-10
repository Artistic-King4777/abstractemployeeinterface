package employeeInterface;

public class Main {
    public static void main(String[] args) {

        Employee hourEmployee = new HourlyEmployee("Yuzuru", "Satomi", "343-44-7255", 40.00, 28.00);

        Employee salaryEmployee = new SalariedEmployee("Morinaga", "Souichi", "444-53-4454", 10000.00);

        Employee commissionEmployee = new CommissionedEmployee("Wade", "Wilson", "666-33-6646", 2000.00, 0.35);

        Employee basePlusComEmployee = new BasePlusCommissionEmployee("Zee", "Thompsonowak", "77-77-7777", 5000.00, 0.5, 165.50);


        Invoice receipt = new Invoice("666333", "Engine", 5, 250.00);


        System.out.println("=====================================");

        Employee[] staff = new Employee[]{hourEmployee, salaryEmployee, commissionEmployee, basePlusComEmployee};

        for(Employee eStaff : staff){
            System.out.println(eStaff.getFirstName() + " " + eStaff.getLastName() + " : " + "\n" + " | Earnings $" + eStaff.earnings());
        }

        for(Employee eStaff : staff){
            System.out.println("\n" + "HR owes " + eStaff.getFirstName() + " " + eStaff.getLastName() + ": $" + eStaff.getPaymentAmount());
        }

        System.out.println( "\n" + "Part Number #" + receipt.getPartNumber() + " / Desccription: " +  receipt.getPartDescription() + "\n" + "You owe: $" +  receipt.getPaymentAmount());


        //MAKE A UML FOR THIS THEN DO SUPERHEROES  IMPLEMENTATION
    }
}
