package Recap;

public class EncapsulationDemo {
    private String empName;
    private int empAge;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

}
class TestEn{
    public static void main(String[] args) {
        EncapsulationDemo encapsulationDemo=new EncapsulationDemo();
        encapsulationDemo.setEmpName(" John");
        encapsulationDemo.setEmpAge( 30 );
        System.out.println("Employee Name:"+encapsulationDemo.getEmpName());
        System.out.println("Employee Age: " +encapsulationDemo.getEmpAge());
    }
}






