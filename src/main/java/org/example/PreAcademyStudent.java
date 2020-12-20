package org.example;

public class PreAcademyStudent implements Comparable<PreAcademyStudent> {
    final String studentName;

    final int quizzesPoints;
    final int tasksPoints;
    final int activityPoints;

    final int totalPoints;

    public PreAcademyStudent(String studentName, int quizzesPoints, int tasksPoints, int activityPoints) {
        this.studentName = studentName;
        this.quizzesPoints = quizzesPoints;
        this.tasksPoints = tasksPoints;
        this.activityPoints = activityPoints;
        this.totalPoints = quizzesPoints + tasksPoints + activityPoints;
    }

    @Override
    public String toString() {
        return studentName + ',' +
               quizzesPoints + "," +
               tasksPoints + "," +
               activityPoints + "," +
               totalPoints + "\n";
    }

    @Override
    public int compareTo(PreAcademyStudent o) {
        PreAcademyStudent pas1 = this;
        PreAcademyStudent pas2 = o;
        return Integer.compare(pas1.totalPoints, pas2.totalPoints);
    }
}
