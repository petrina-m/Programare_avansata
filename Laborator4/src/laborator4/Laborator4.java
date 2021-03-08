/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

/**
 *
 * @author 40757
 */
public class Laborator4 {

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
        stdPrefMap.put(students[0], Arrays.asList(schools[0], schools[1], schools[2]));
        stdPrefMap.put(students[1], Arrays.asList(schools[0], schools[1], schools[2]));
        stdPrefMap.put(students[2], Arrays.asList(schools[0], schools[1]));
        stdPrefMap.put(students[3], Arrays.asList(schools[0], schools[2]));
        
        Map<School, List<Student>> schPrefMap = new LinkedHashMap<>();
        schPrefMap.put(schools[0], Arrays.asList(students[3], students[0], students[1], students[2]));
        schPrefMap.put(schools[1], Arrays.asList(students[0], students[2], students[1]));
        schPrefMap.put(schools[2], Arrays.asList(students[0], students[1], students[3]));

        System.out.println(schPrefMap.toString());
        System.out.println(stdPrefMap.toString());
       
    }
}
