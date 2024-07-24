package encapsulation;

public class Employee {
    private int empID;
    private String name;
    private int ph;
    private int basicSal;
    private int incentive;
    private void countSalary(){
        int finalSalary = basicSal + incentive;
        System.out.println("Final Salary: " + finalSalary);
    }

    //    constructor
    public Employee(String employeeName, int employeeID){
        name=employeeName;
        empID=employeeID;
    }

    //    getter and setter

    //    updating the value by setters

    public void setName(String name){
        this.name=name;
    }

    public void setempID(int empID){
        this.empID=empID;
    }

    public void setPh(int ph){
        this.ph = ph;
    }

    public void setBasicSal(int basicSal){
        this.basicSal = basicSal;
    }

    public void setIncentive(int incentive){
        this.incentive = incentive;
    }

    //    getting the value by getters
    public int getempID(){
        return empID;
    }

    public String getName(){
        return name;
    }

    public int getPh(){
        return ph;
    }

    public int getBasicSal(){
        return basicSal;
    }

    public int getIncentive(){
        return incentive;
    }


    //       total salary
    public void calculateSalary(){
        countSalary();
    }

}

