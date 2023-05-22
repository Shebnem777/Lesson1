package Task1;

import java.time.LocalDate;

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, LocalDate birthDate, String employeeId, double hourlyRate, double hoursWorked) {
        super(name, birthDate, employeeId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double collectPay() {
        return hourlyRate * hoursWorked;
    }

    public void performJob() {
        System.out.println("Saatlıq işçi kimi iş vəzifələrini yerinə yetirmək.");
    }
}
