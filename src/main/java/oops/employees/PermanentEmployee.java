package oops.employees;

public class PermanentEmployee extends Employee{
    @Override
    public int computeSalary() {
        System.out.println("Computing salary for permanent employee");
        return 100;
    }
}
