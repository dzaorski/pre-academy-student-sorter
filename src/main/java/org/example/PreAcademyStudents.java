package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PreAcademyStudents {

    private List<PreAcademyStudent> studentsList = new ArrayList<>();

    public List<PreAcademyStudent> getStudentsList() {
        return this.studentsList;
    }

    public void addStudentLists(String[] rows) {
        String[] student = Arrays.copyOf(rows, rows.length);
        studentsList.add(new PreAcademyStudent(
                rows[0],
                Integer.parseInt(rows[1]),
                Integer.parseInt(rows[2]),
                Integer.parseInt(rows[3])
        ));
    }
}
