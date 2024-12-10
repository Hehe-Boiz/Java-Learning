package Others;

import java.util.List;
import java.util.function.Predicate;

public class Lamda {

    @FunctionalInterface
    interface CheckPerson{
        boolean test(Person p); // vì ở đây đã nói test chỉ hoạt động với tham số đầu vào là Person 
    }    
    
    static class CheckPersonEligibleForSelectiveSearch implements CheckPerson{
        @Override
        public boolean test(Person p){
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }

    // Approach 1
    public static void printPersonOlderThan(List<Person> people, int age){
        for(Person p: people){
            if(p.getAge() >= age){
                p.printPerson();
            }
        }
    }

    // Approach 2
    public static void printPersonWithinAgeRange(List<Person> people, int low, int high){
        for(Person p: people){
            if(low<=p.getAge() && p.getAge() < high){
                p.printPerson();
            }
        }
    }

    // Approach 3
    public static void printPeople(List<Person> people, CheckPerson tester){
        for(Person p: people){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }

    public static void printPeopleWithPredicate(List<Person> people, Predicate<Person> tester){
        for(Person p: people){
            if(tester.test(p)){
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        List<Person> people = Person.generateDefaultList();
        // printPersonOlderThan(people, 20);
        // printPersonWithinAgeRange(people, 20, 21);
        // printPeople(people, new CheckPersonEligibleForSelectiveSearch());

        printPeople(people, new CheckPerson() {
            @Override
            public boolean test(Person p){
                return p.gender == Person.Sex.MALE &&
                        p.getAge() >= 18 &&
                        p.getAge() <= 25;
            }
        });

        // Approach 5
        printPeople(people, p -> // không cần đặt Person p để như đang ra hiệu với java là đang làm việc với lớp Person 
            // nếu chỉ có 1 câu lệnh trong lamda thì có thể không cần {} và java cũng biết rằng đang trả về 1 số giá trị  => không cần chỉ định bằng lệnh 
                p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25
        );

        printPeopleWithPredicate(people, p -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
    }

    // ý nghĩa biểu thức lamda: nếu mỗi lần người dùng muốn tìm kiếm theo tiêu chí này nọ thì chúng ta sẽ cần phải tạo phương thức bằng 2 cách đầu 
    // và biểu thức lamda có thể thay thế chúng ta làm điều đó 
}
