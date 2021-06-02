package com.company.work2;

public class Employee {

   private String firstName;
   private String lastName;
   private String occupation;
   private String telephone;
   static int numberOfEmployees;

    {
        numberOfEmployees++;
    }

   public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getTelephone() {
        return telephone;
    }

    public Employee() {
    }

    public Employee(String firstName, String lastName, String telephone) {
        this(firstName, lastName, null, telephone);

       /* this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;*/
    }

    public Employee(String firstName, String lastName, String occupation, String telephone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.telephone = telephone;
    }
}
