package java8;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

/**
 * Created by Administrator on 05.12.16.
 */
public class Main {
    public static Set<Course> t1(List<Lecture> lectures) {
        //вернуть список курсов
        return lectures.stream().map(Lecture::getCourse).collect(toSet());
    }

    public Set<String> lecturers(List<Lecture> lectures) {
        return lectures.stream()
                .map(Lecture::getCourse)
                .filter(course -> course.getLength() < 20)
                .map(Course::getLecturer)
                .collect(toSet());
        //список имен преподов, которые ведут курс длиной меньше 20
    }

    public Course mostBoring(List<Lecture> lectures) {
        return lectures.stream().map(Lecture::getCourse).max(Comparator.comparing(Course::getLength)).orElse(null);
        //вернуть самый длинный курс

    }

    public Map<Course, List<Lecture>> courseToLecture(List<Lecture> lectures) {
        return lectures.stream()
                .collect(groupingBy(Lecture::getCourse));
    }

    public static void main(String[] args) {

    }
}
