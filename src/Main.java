public class Main {
    public static void main(String[] args) {
        SalariedEmployee bob = new SalariedEmployee("Bob", "04/20/1993", "02/22/2024", 234902422,"02/22/2021",
                43242432, true );

        bob.retire();
    }
}

class Worker{
    protected String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        return 56;
    }

    protected String getName(){
        return this.name;
    }

    public double collectPay(){
        return 2000;
    }

    public void terminate(String endDate){
        System.out.println("Terminated " + endDate);
    }
}




class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    public Employee(String name, String birthDate, String endDate, long employeeId, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }
}


class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public void retire(){
        System.out.println("Employee" + super.getName() + "Retired");
    }

    public SalariedEmployee(String name, String birthDate, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}