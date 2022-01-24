package oops.employees;

public class Driver {
    public static void main(String[] args){
        Employee e1 = new PermanentEmployee();
        e1.setName("Naveen");

        Employee e2 = new ContractEmployee();
        e2.setName("Test");

        Employee[] employees = new Employee[2];
        employees[0] = e1;
        employees[1] = e2;

        for(Employee employee: employees){
           int salary =  employee.computeSalary();
           System.out.println(salary);
        }
    }

}
