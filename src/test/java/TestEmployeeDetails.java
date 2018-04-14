import org.testng.Assert;
import org.testng.annotations.*;
public class TestEmployeeDetails {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();
    @Test
    @Parameters("myName")
    public void parameterTest(String myName) {
        System.out.println("Parameterized value is : " + myName);
    }
    @Test
    public void testCalculateAppriasal() {

        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        System.out.println("begin testCalculateAppriasal ！");
        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        Assert.assertEquals(500, appraisal, 0.0, "500");

}

    // Test to check yearly salary
    @Test(enabled = false)
    public void testCalculateYearlySalary() {

        employee.setName("Rajeev");
        employee.setAge(55);
        employee.setMonthlySalary(8000);
        System.out.println("begin testCalculateYearlySalary ！");
        double salary = empBusinessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(96000, salary, 0.0, "testCalculateYearlySalary fail");
    }
    // Test calculateTotalIncome
    @Test
    public void testCalculateTotalIncome(){
        employee.setName("Susan");
        employee.setAge(55);
        employee.setMonthlySalary(8000);
        System.out.println("begin testCalculateTotalIncome !");
        double totalIncome = empBusinessLogic.calculateTotalIncome(employee);
        Assert.assertEquals(101500, totalIncome, 0.0, "testCalculateTotalIncome fail");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("in beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("in afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("in beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("in afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("in beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("in afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in afterSuite");
    }

}
