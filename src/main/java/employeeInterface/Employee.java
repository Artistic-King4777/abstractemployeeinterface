package employeeInterface;

public abstract class Employee implements IPayable {

    //instance variables
    private static int count = 0;
    private String firstName; //firstN
    private String lastName;  //lastN
    private final String socialSecurityNumber; //sSN

    //method signature / stubs
    abstract double earnings();

    //constructor
    public Employee(String firstN, String lastN, String sSN) {
        this.firstName = firstN;
        this.lastName = lastN;
        this.socialSecurityNumber = sSN;
        count++;

        System.out.printf("Constructed employee %s %s | count=%d%n", firstName, lastName, count);
    }





    //getters
    public static int getCount() {
        return count;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    //getters-setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    //toString Override
    @Override
    public String toString() {
        return "Employee{" +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                '}';
    }

}
