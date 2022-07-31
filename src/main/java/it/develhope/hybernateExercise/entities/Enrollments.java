package it.develhope.hybernateExercise.entities;

import javax.persistence.*;

@Entity
@Table
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name = "students_id")
    private Students students;


    @ManyToOne
    @JoinColumn(name = "classes_id")
    private Classes Classes;

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public it.develhope.hybernateExercise.entities.Classes getClasses() {
        return Classes;
    }

    public void setClasses(it.develhope.hybernateExercise.entities.Classes Classes) {
        this.Classes = Classes;
    }

    public Enrollments(){}

    public Enrollments(long id, Students students, it.develhope.hybernateExercise.entities.Classes classes) {
        this.id = id;
        this.students = students;
        Classes = classes;
    }
}
