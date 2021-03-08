/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author 40757
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        var students = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new Student("S" + i))
                .toArray(Student[]::new);

        List<Student> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(students));

        Collections.sort(studentList, ((s1, s2) -> s1.getName().compareTo(s2.getName())));

        var schools = IntStream.rangeClosed(0, 3)
                .mapToObj(i -> new School("h" + i))
                .toArray(School[]::new);

        Set<School> schoolList = new TreeSet<>();

        Map<Student, List<School>> stdPrefMap = new HashMap<>();
        List<School> prefList = new ArrayList<>();
        School[] h = null;
        prefList.add(h[0]);
        prefList.add(h[1]);
        prefList.add(h[2]);
        stdPrefMap.put(students[0], prefList);

       

    }
}
