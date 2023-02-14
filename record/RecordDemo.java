package record;
import java.util.Arrays;
/** JDK 16 */
record Employee(String name, int idNum){
    static int pendingId = -1;

    public Employee{
        name = name.trim();
    }
    public Employee(String name){
        this(name, pendingId);
    }
}
public class RecordDemo {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Sabyasachi", 1);
        employees[1] = new Employee("Pragyan", 2);

        employees[2] = new Employee("Aariketh");
        System.out.println(Arrays.toString(employees));

        for(Employee emp : employees){
            if(emp.idNum() == Employee.pendingId) System.out.println("Pending");
            else System.out.println(emp.idNum()+" "+emp.name());
        }

    }
}
