  public class EncapsTest{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setEmpName("Mario");
         obj.setEmpAge(32);
         obj.setEmpSSN(112233);
         System.out.println("Employee Name: " +getEmpName());
         System.out.println("Employee SSN: " +getEmpSSN());
         System.out.println("Employee Age: " +getEmpAge());
    } 
}