import java.util.*;

class Employee{
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salary_rate;
    
    Employee(int id, String name, int age, String department, String code, double salary_rate) {
        this.id = id;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salary_rate = salary_rate;
    }

    public int getId(){
        return this.id;
    }

    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", code='" + code + '\'' +
                ", salaryRate=" + salary_rate +
                '}';
    }
}

public class Main {

    static List < Employee > employees = new ArrayList<>();
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.printf("Your query is: ");
        String q = in.nextLine();

        do{
            if(q.equals("Add")){
                System.out.printf("The number of employee to add: ");
                int number = in.nextInt();
                addEmployee(number,in);

                in.nextLine(); // input buffer
            }
            else if(q.equals("Print")){
                displayEmployees();
            }
            else if(q.equals("Remove")){
                System.out.printf("The id of employee to remove: ");
                int id  = in.nextInt();
                removeEmployee(id);
                displayEmployees();

                in.nextLine(); // input buffer
            }

            System.out.printf("Your query is: ");
            q = in.nextLine();
        }
        while (!q.isEmpty());

        in.close();

    }

    public static void addEmployee(int n,Scanner in){
        try{
            for(int i = 0; i < n; i++){
                //input id
                System.out.printf("Employee id: ");
                int id = in.nextInt();
    
                in.nextLine(); // input buffer
    
                // input name
                System.out.printf("Employee name: ");
                String name = in.nextLine();
    
                //input age
                System.out.printf("Employee age: ");
                int age = in.nextInt();
    
                in.nextLine(); // input buffer
    
                //input department
                System.out.printf("Employee department: ");
                String department = in.nextLine();
    
                //input code
                System.out.printf("Employee code: ");
                String code = in.nextLine();
    
                //input salary rate
                System.out.printf("Employee salary rate: ");
                double salary_rate = in.nextDouble();
                
                Employee employee = new Employee(id, name, age, department, code, salary_rate);

                employees.add(employee);

                System.out.println(employee.toString());
            }
        }
        catch(Exception e){
            System.out.println("Having exception");
        }
    }


    public static void displayEmployees(){
        for(Employee employee:employees){
            System.out.println(employee.toString());
        }
    }

    public static void removeEmployee(int id){
        for(Employee employee:employees){
            if(id == employee.getId()){
                employees.remove(employee);
            }
        }
    }
}