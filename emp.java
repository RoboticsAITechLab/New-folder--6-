public class emp {
    private int empId;
    private String empName;
    private double empSalary;
    private double netSalary;

    public int getId() {
        return empId;
    }

    public void setempId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setempName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }

    public void calculateNetSalary(int pfPercentage) {
        double pfAmount = (empSalary * pfPercentage) / 100;
        netSalary = empSalary - pfAmount;
    }

    public static void main(String[] args) {
        emp employee = new emp();
        employee.setempId(101);
        employee.setempName("Ankit");
        employee.setEmpSalary(50000);

        int pfPercentage = 10; // Example PF percentage
        employee.calculateNetSalary(pfPercentage);

        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Salary: " + employee.getSalary());
        System.out.println("Employee Net Salary after PF deduction: " + employee.getNetSalary());
    }
}