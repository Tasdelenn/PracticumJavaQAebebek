package _01_Case01;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Hakan Tasdelen",100000,40,2021);
        employees[1] = new Employee("Ali Yeşil", 60000,50,2018);
        employees[2] = new Employee("Ayşe Sarı", 80000,36,2020);
        employees[3] = new Employee("Mehmet Turuncu", 90000,48,2011);
        employees[4] = new Employee("Şükrü Kırmızı", 120000,48,2005);

        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }


    }
}
