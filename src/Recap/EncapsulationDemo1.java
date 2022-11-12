package Recap;

public class EncapsulationDemo1 {

    private String empName;
    private int empAge;

    public EncapsulationDemo1(String empName, int empAge) {
        this.empName = empName;
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }
    public int getEmpAge(){
        return empAge;
    }
}
class Tee{
    public static void main(String[] args) {
        EncapsulationDemo1 encapsulationDemo1=new EncapsulationDemo1("John",30);
        System.out.println("Employee Name: " + encapsulationDemo1.getEmpName());
        System.out.println("Employee Age: "  + encapsulationDemo1.getEmpAge());


    }
}




