package oops.employees;

public class ContractEmployee extends Employee{
    @Override
    public int computeSalary() {
        System.out.println("Computing salary for contract employee");
        return 10;
    }
}
