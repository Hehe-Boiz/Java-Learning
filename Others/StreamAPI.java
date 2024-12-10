package Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {
    static List<Employee> employees = new ArrayList<>();
    static {
        employees.add(new Employee("Shabbir", "Dawoodi", 5000.0, List.of("Project 1", "Project 2")));
        employees.add(new Employee("Nikhil", "Gupta", 6000.0, List.of("Project 1", "Project 3")));
        employees.add(new Employee("Shivam", "Kumar", 5000.0, List.of("Project 4", "Project 2")));
    }

    public static void main(String[] args) {
        // có thể chuyển bất kì đối tượng kiểu List, Array, File, .... đều có thể chuyển thành đối tượng Stream 
        // Stream.of(employees);

        // chuyển dữ liệu -> stream 
        // forEach 
        employees.stream().forEach(employee -> System.out.println(employee));

        //map, collect
        List<Employee> increasedSal = 
                                    employees.stream()
                                    .map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.10, employee.getProject()))
                                    .collect(Collectors.toList()); // thu thập dữ liệu vào danh sách 
        
        System.out.println(increasedSal);

        // filter 
        List<Employee> filterEmployee = employees
                .stream()
                .filter(employee -> employee.getSalary() > 5000.0) // nếu đúng thì sẽ chuyển qua giai đoạn tiếp theo 
                .map(employee -> new Employee(employee.getFirstName(), employee.getLastName(), employee.getSalary() * 1.10, employee.getProject()))
                .collect(Collectors.toList());
        System.out.println(filterEmployee);

        // findFirst
        Employee firstEmployee = employees.stream()
                        .filter(employee -> employee.getSalary() > 5000.0)
                        .findFirst() // lấy phần tử đầu tiên ra khỏi bộ lọc 
                        .orElse(null); // trả về giá trị đầu tiên nếu giá trị đầu tiên không có thì trả về null
        System.out.println(firstEmployee);

        // flatMap 
        String projects = employees
                                .stream()
                                .map(employee -> employee.getProject()) // trả về 1 stream danh sách 
                                .flatMap(strings -> strings.stream()) // chuyển mỗi stream danh sách thành stream chuỗi và sau flatMap sẽ chuyển tất cả stream thành 1 stream 
                                .collect(Collectors.joining(","));
        System.out.println(projects);

        // short circuit operations 
        List<Employee> shortCircuit =
                employees
                .stream()
                .skip(1) // bỏ qua phần tử đầu tiên trong luồng 
                .limit(1) // lấy tối ta 1 phần tử từ luồng hiện tại 
                .collect(Collectors.toList());
        System.out.println(shortCircuit);

        // Finite Data
        // Math::random : Method reference là cách để tham chiếu một phương thức đã tồn tại
        Stream.generate(Math::random) // generate yêu đầu Supplier<T>, nghĩa là một hàm trả về giá trị mỗi khi được gọi (yêu cầu 1 hàm)
                .limit(5)
                .forEach(value -> System.out.println(value));
        
        // sorting 
        List<Employee> sortedEmployees = employees
                .stream()
                .sorted((o1,o2) -> -o1.getFirstName().compareToIgnoreCase(o2.getFirstName()))
                .collect(Collectors.toList());
        System.out.println(sortedEmployees);

        // min or max 
        employees
                .stream()
                .max(Comparator.comparing(Employee::getSalary)) // comparing nhận vào 1 hàm ánh xạ (hàm ánh xạ là một hàm dùng để lấy ra một giá trị cụ thể (key) từ một đối tượng ban đầu.)
                .orElseThrow(NoSuchElementException::new); // "::new": là một constructor reference (là cách rút gọn để tham chiếu đến hàm khởi tạo (constructor) của một lớp) =new NoSuchElementException()
        
        // reduce: tích lũy vào 1 số 
        Double totalSal = employees
                .stream()
                .map(employee -> employee.getSalary())
                .reduce(0.0, Double::sum); // 0.0 là giá trị ban đầu những số sau sẽ được cộng vào, Double::sum = (a,b) -> a+b 
                // .reduce((a,b) -> a+b);
        System.out.println(totalSal);

        // parallel Stream: áp dụng cho các thao tác không theo thứ tự 
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = numbers.parallelStream()
                 .filter(n -> n % 2 == 0)
                 .mapToInt(Integer::intValue) // chuyển Integer -> int (Stream<Integer> -> IntStream) thông qua 1 hàm ánh xạ 
                 .sum(); // chỉ có trong IntStream 
        System.out.println(sum);
    }
}
