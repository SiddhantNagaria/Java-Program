package Map_and_FlatMap;


import java.util.Arrays;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private List<String> skills;

    public Employee(int id, String name, List<String> skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", skills=" + skills + '}';
    }
}

public class Code {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "Siddhant", Arrays.asList("Java", "Spring Boot", "Docker")),
                new Employee(102, "Rahul", Arrays.asList("React", "NodeJS")),
                new Employee(103, "Aman", Arrays.asList("Kafka", "Redis")));


        // map() Example
        System.out.println("Using map():");
        employees.stream().map(Employee::getName).forEach(System.out::println);


        // flatMap() Example
        System.out.println("\nUsing flatMap():");
        employees.stream().flatMap(emp -> emp.getSkills().stream()).forEach(System.out::println);

    }
}