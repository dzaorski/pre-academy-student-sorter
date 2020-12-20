package org.example;

import java.io.IOException;

/**
 * Pre-academy-student-sorter!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello in pre academy student sorter!" );
        StudentListCreator creator = new StudentListCreator();
        PreAcademyStudents preAcademyStudents = creator.createPreAcademyStudentList("students");

        PreAcademyStudentsSorter preAcademyStudentsSorter = new PreAcademyStudentsSorter();
        SortingOptions sortingOption = Menu.chooseSortingOption();
        preAcademyStudentsSorter.sortStudents(preAcademyStudents, sortingOption);

        WriterCSV writerCSV = new WriterCSV();
        writerCSV.writeCSV(preAcademyStudents, sortingOption);

        System.out.println("\nNew .csv file with students sorted by your choice was created");
    }
}
