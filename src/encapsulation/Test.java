package encapsulation;

public class Test {
    public static void main(String[] args) {

        Employee engineer = new Employee("Manan", 12);    //  it use constructor

//        using setter
        engineer.setName("Panchal");
        engineer.setempID(315);
        engineer.setPh(123456789);
        engineer.setIncentive(10000);
        engineer.setBasicSal(25000);

//        using getter
        System.out.println(engineer.getName());
        System.out.println(engineer.getempID());
        System.out.println(engineer.getPh());
        System.out.println(engineer.getIncentive());
        System.out.println(engineer.getBasicSal());

//        total salary
        engineer.calculateSalary();

    }
}
