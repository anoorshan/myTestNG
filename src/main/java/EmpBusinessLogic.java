public class EmpBusinessLogic {
    // Calculate the yearly salary of employee
    public double calculateYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    // Calculate the appraisal amount of employee
    public double calculateAppraisal(EmployeeDetails employeeDetails) {

        double appraisal = 0;

        if(employeeDetails.getMonthlySalary() < 10000) {
            appraisal = 500;

        } else {
            appraisal = 1000;
        }

        return appraisal;
    }

    // Calculate the allowance of employee
    public int calculateAllowance(EmployeeDetails employeeDetails){
        int allowance = 0;
        if(employeeDetails.getAge() > 50){
            allowance = 5000;
        }
        return allowance;
    }
    //Calculate the total income of employee
    public double calculateTotalIncome(EmployeeDetails employeeDetails){
        return calculateYearlySalary(employeeDetails) + calculateAppraisal(employeeDetails) + calculateAllowance(employeeDetails);
    }
}
