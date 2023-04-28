package function;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPractice {
    record Student(String name, int score){}
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("kira",74);
        studentList.add(student1);
        Student student2 = new Student("kiddo",82);
        studentList.add(student2);
        Student student3 = new Student("fufi",85);
        studentList.add(student3);
        Student student4 = new Student("ro",84);
        studentList.add(student4);
        Student student5 = new Student("rufi",78);
        studentList.add(student5);

        //全員分のスコアの合計値を出力
//        int sum = studentList.stream().mapToInt(Student::score).sum();
//        System.out.println(sum);

        //スコアが80以上のレコードだけ出力
//        studentList.stream().filter(s -> s.score() >= 80).forEach(System.out::println);

        //スコアが高い順に並び替え出力
        studentList.stream().sorted(Comparator.comparing(Student::score).reversed()).collect(Collectors.toList()).forEach(System.out::println);
    }

}
