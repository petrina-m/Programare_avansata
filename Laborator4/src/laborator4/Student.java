/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laborator4;

import java.util.Objects;
import static java.util.Objects.isNull;

/**
 *
 * @author 40757
 */
public class Student implements Comparable<Student> {

    private String name;
    int notaExamen;

    public Student(String name, int notaExamen) {
        this.name = name;
        this.notaExamen = notaExamen;

    }

    public int getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(int notaExamen) {
        this.notaExamen = notaExamen;
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Student other) {
       //compar notele
       //le voi ordona descrescator
       return other.getNotaExamen()-this.notaExamen;
        
       /* if (isNull(other.name)) //dacanumele este null
        {
            System.out.println("There is no name");
        } else {
            return this.name.compareTo(other.name);
        }
        return 0;
        */
    }
}

