package _01_Case01;

public class Employee {
    protected String name;
    protected double salary;
    protected int workHours;
    protected int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax(double formalSalary) {
        double tax = 0;
        if (formalSalary > 1000)
            tax = formalSalary * 3 / 100;
        return -tax;
    }

    private int bonus(int formalWorkHours) {
        int bonus = 0;
        if (formalWorkHours > 40) {
            bonus = (formalWorkHours - 40) * 30;
        }
        return bonus;
    }

    private double raiseSalary(int formalHireYear) {
        int workYear = (2021 - formalHireYear);
        double raiseSalary;
        double raiseRate;

        if (0 <= workYear && workYear < 10)
            raiseRate = 0.05;
        else if (9 < workYear && workYear < 20)
            raiseRate = 0.10;
        else
            raiseRate = 0.15;

        raiseSalary = raiseRate * salary + bonus(workHours) + tax(salary);
        return raiseSalary;
    }

    @Override
    public String toString() {
        return "*****************************************************************************\n" +
                "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary + " TL" +
                ", workHours=" + workHours + " Hours" +
                ", hireYear=" + hireYear +
                '}' + "\n" +
                "Bonus : " + bonus(workHours) + " TL" +"\n" +
                "Total Salary : " + (salary + bonus(workHours)) + " TL" + "\n" +
                "--------------------------------------------------" + "\n" +
                "Tax : " + tax(salary) + " TL" +"\n" +
                "Raise Salary (including bonus and tax) : " + raiseSalary(hireYear) + " TL" +"\n" +
                "--------------------------------------------------" + "\n" +
                "Salary after tax and bonus is : " + (salary + raiseSalary(hireYear)) + " TL" + "\n"
                ;

    }
}
