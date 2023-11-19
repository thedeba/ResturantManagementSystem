
public class Management extends Employee implements EmployeeManagement {

    private Employee employees[] = new Employee[150];

    public boolean insertEmployee(Employee e) {

        boolean flag = false;

        for (int i = 0;i < employees.length;i++) {
            if (employees[i] == null) {
                employees[i] = e;
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public boolean removeEmployee(Employee e) {
        boolean flag = false;

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == e) {
                employees[i] = null;
                flag = true;
                break;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public Employee searchEmployee(String empId) {
        Employee e = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (employees[i].getEmpId().equals(empId)) {
                    e = employees[i];
                    break;
                }
            }
        }
        return e;
    }

    public void showAllEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("\n*****************************************\n");
                System.out.println("Employee ID : " + employees[i].getEmpId());
                System.out.println("Employee Name : " + employees[i].getName());
                System.out.println("Employee Salary : " + employees[i].getSalary());
                System.out.println("\n*****************************************\n");
            }
        }
    }
}
