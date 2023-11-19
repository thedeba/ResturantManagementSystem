
public interface EmployeeManagement {

    boolean insertEmployee(Employee e);

    boolean removeEmployee(Employee e);

    Employee searchEmployee(String empId);

    void showAllEmployees();
}
