package Task1;
import java.time.LocalDate;



abstract class Employee extends Worker {
    private String employeeId;

    public Employee(String name, LocalDate birthDate, String employeeId) {
        super(name, birthDate);
        this.employeeId = employeeId;
    }

    public abstract void performJob();

    public String toString() {
        return super.toString() + " (işçi ID: " + employeeId + ")";
    }
}







