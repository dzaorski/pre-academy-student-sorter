package org.example;

public class StudentListCreator {

    public PreAcademyStudents createPreAcademyStudentList(String csvFile) {
        ReaderCSV readerCSV = new ReaderCSV();
        int numberOfStudents = readerCSV.readCSV(csvFile).size();
        PreAcademyStudents preAcademyStudentsList = new PreAcademyStudents();
        for (int i = 1; i < numberOfStudents; i++)
            preAcademyStudentsList.addStudentLists(readerCSV.readCSV(csvFile).get(i));
        return preAcademyStudentsList;
    }
}
