package oops.employees;

public class EmployeeFactory {

    public static Employee create(String empType){
        if(empType.equals("permanent")){
            return new PermanentEmployee();
        }
        else if(empType.equals("contract")){
            return new ContractEmployee();
        }
        return null;
    }
}
