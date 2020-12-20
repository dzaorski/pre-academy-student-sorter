package org.example;

import java.util.Collections;

public class PreAcademyStudentsSorter {

    public void sortStudents(PreAcademyStudents preAcademyStudents, SortingOptions option) {
        switch (option) {
            case QUIZZES -> Collections.sort(preAcademyStudents.getStudentsList(), new StudentComparators.StudentByQuizzesComparator());
            case TASKS -> Collections.sort(preAcademyStudents.getStudentsList(), new StudentComparators.StudentByTasksComparator());
            case ACTIVITY -> Collections.sort(preAcademyStudents.getStudentsList(), new StudentComparators.StudentByActivityComparator());
            case TOTAL -> Collections.sort(preAcademyStudents.getStudentsList());
        }
        preAcademyStudents.getStudentsList();
    }
}
