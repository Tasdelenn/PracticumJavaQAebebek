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
        return tax;
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

        raiseSalary = raiseRate * salary ;
        return raiseSalary;
    }

    @Override
    public String toString() {
        return "*****************************************************************************\n" +
                "ADI : " + name + "\n" +
                "MAAŞI : " + salary + " TL" + "\n" +
                "HAFTALIK ÇALIŞMA SAATİ : " + workHours + " Hours" + "\n" +
                "BAŞLANGIÇ YILI : " + hireYear + "\n" +
                "VERGİ : " + tax(salary) + " TL" + "\n" +
                "BONUS : " + bonus(workHours) + " TL" + "\n" +
                "MAAŞ ARTIŞI : " + raiseSalary(hireYear) + " TL" + "\n" +
                "VERGİ VE BONUS UYGULANDIKTAN SONRA MAAŞ : " + (salary + bonus(workHours) - tax(salary)) + " TL" + "\n" +
                "TOPLAM MAAŞ : " + (salary + bonus(workHours) - tax(salary) + raiseSalary(hireYear)) + " TL" + "\n"
                ;
    }
}
