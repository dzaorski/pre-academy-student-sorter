package org.example;

import java.util.Comparator;

public abstract class StudentComparators implements Comparator<PreAcademyStudent> {

    @Override
    public abstract int compare(PreAcademyStudent firstStudent, PreAcademyStudent secondStudent);

    public static class StudentByQuizzesComparator extends StudentComparators {

        @Override
        public int compare(PreAcademyStudent firstStudent, PreAcademyStudent secondStudent) {
            return Integer.compare(firstStudent.quizzesPoints, secondStudent.quizzesPoints);
        }
    }

    public static class StudentByTasksComparator extends StudentComparators {

        @Override
        public int compare(PreAcademyStudent firstStudent, PreAcademyStudent secondStudent) {
            return Integer.compare(firstStudent.tasksPoints, secondStudent.tasksPoints);
        }
    }

    public static class StudentByActivityComparator extends StudentComparators {

        @Override
        public int compare(PreAcademyStudent firstStudent, PreAcademyStudent secondStudent) {
            return Integer.compare(firstStudent.activityPoints, secondStudent.activityPoints);
        }
    }
}
