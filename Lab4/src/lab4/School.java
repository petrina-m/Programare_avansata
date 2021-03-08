/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Objects;
/**
 *
 * @author 40757
 */
public class School{
    private String SchoolName;

    public School(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String SchoolName) {
        this.SchoolName = SchoolName;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.SchoolName);
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
        final School other = (School) obj;
        if (!Objects.equals(this.SchoolName, other.SchoolName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "School{" + "SchoolName=" + SchoolName + '}';
    }
    
    
}
