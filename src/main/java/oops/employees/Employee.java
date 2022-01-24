package oops.employees;

import java.util.Date;

abstract public class Employee {
   private String name;
   private Date dob;

   public void setName(String name){
       this.name = name;
   }

   public void setDob(Date dob){
       this.dob = dob;
   }

   public String getName(){
       return this.name;
   }

   public Date getDob(){
       return this.dob;
   }

   public abstract int computeSalary();

}
