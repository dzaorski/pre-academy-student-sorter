package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class WriterCSV {

    public void writeCSV(PreAcademyStudents studentsList, SortingOptions option) throws IOException {
        FileWriter csvWriter = new FileWriter("src/main/resources/sorted-students-by-" + option.name() + ".csv");
        
        csvWriter.append("studentName");
        csvWriter.append(",");
        csvWriter.append("quizzes points");
        csvWriter.append(",");
        csvWriter.append("tasks points");
        csvWriter.append(",");
        csvWriter.append("activity points");
        csvWriter.append(",");
        csvWriter.append("total points");
        csvWriter.append("\n");

        for (int i = 0; i < studentsList.getStudentsList().toArray().length; i++)
            csvWriter.append(studentsList.getStudentsList().get(i).toString());

        csvWriter.flush();
        csvWriter.close();
    }

}
