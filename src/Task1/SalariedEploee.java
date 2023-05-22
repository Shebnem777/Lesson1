package Task1;

import java.time.LocalDate;

class SalariedEmployee extends Employee {
    private double annualSalary;

    public SalariedEmployee(String name, LocalDate birthDate, String employeeId, double annualSalary) {
        super(name, birthDate, employeeId);
        this.annualSalary = annualSalary;
    }

    public double collectPay() {
        return annualSalary / 12;
    }

    public void performJob() {
        System.out.println("Maaşlı işçi kimi iş vəzifələrini yerinə yetirmək");
    }
}
