import java.util.Scanner;

public class Employee {
    private String name;
    private String surname;
    private float salary;
    private float bonus;

    public Employee(String name, String surname, float salary, float bonus) {
        this.name=name;
        this.surname=surname;
        if (salary>0) this.salary=salary;
        if (bonus>0) this.bonus=bonus;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname=surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSalary(Float salary) {
        this.salary=salary;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setBonus(Float bonus) {
        this.bonus=bonus;
    }

    public float getBonus() {
        return this.bonus;
    }

    public boolean increaseBonus(){
        if (this.salary>1000) {
            this.bonus*=1.1;
            return true;
        }
        return false;
    }

    public void printEmployee() {
        System.out.println(this.name + ": " + this.bonus);
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Kamran", "Xelilov", 100.0f, 10.0f);

        System.out.println(employee.getName());
        System.out.println(employee.getSurname());
        System.out.println(employee.getSalary());
        System.out.println(employee.getBonus());

        employee.printEmployee();

        Scanner scanner = new Scanner(System.in);
        String newEmployeeName = scanner.nextLine();
        String newEmployeeSurname = scanner.nextLine();
        Float newEmployeeSalary = scanner.nextFloat();
        Float newEmployeeBonus = scanner.nextFloat();

        Employee employee2 = new Employee(newEmployeeName, newEmployeeSurname, newEmployeeSalary, newEmployeeBonus);

        System.out.println(employee2.getName());
        System.out.println(employee2.getSurname());
        System.out.println(employee2.getSalary());
        employee2.increaseBonus();
        System.out.println(employee2.getBonus());
        
    }
}
