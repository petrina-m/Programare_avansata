/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 *
 * @author 40757
 */
public class Algorithm {
    //toate scolile au aceeasi preferinta pentru studenti
    //studentii sunt preferati in functie de nota obtinuta la un test

    //parcurg toti studentii ini ordineaa descrescatoare a notelor lor
    //daca prima optiune a lor este valabila, acesta este asignata, daca este ocupata, se testeaza a doua optiune etc
    //Map<School, Integer> capacitateOcupata = new HashMap<>();
    List<Student> orderedStudentList = new ArrayList<>();
    List<School> scoalaPreferata = new ArrayList<>();
    Map<Student, School> match = new HashMap<>();
    boolean acceptat;

    public void computeAlg(List<Student> studentList, Set<School> schoolList, Map<Student, List<School>> stdPrefMap) {
        orderedStudentList = studentList.stream()
                .sorted(Comparator.comparing(student -> student.getNotaExamen()))
                .collect(Collectors.toList());

        for (int i = orderedStudentList.size(); i >= 0; i--) {
            //ma plimb prin lista de preferinte astudentilor
            scoalaPreferata.clear();
            //returneaza lista de scoli
            scoalaPreferata = stdPrefMap.get(orderedStudentList.get(i));
            acceptat = false;
            for (int j = 0; j < scoalaPreferata.size() && acceptat == false; j++) {
                if (scoalaPreferata.get(j).capacitate > scoalaPreferata.get(j).capacitateOcupata) {
                    //studentul va fi acceptat
                    scoalaPreferata.get(j).capacitateOcupata++;
                    acceptat = false;
                    match.put(orderedStudentList.get(i), scoalaPreferata.get(j));

                }
            }

        }

    }
 

}
