package hotel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="employers")
public class EmployerSpringJPA implements Serializable {


    private static final long serialVersionUID = -3009157732242241606L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="salary")
    private String salary;

    @Column(name="position")
    private String position;

    @Column(name="hire_date")
    private String hire_date;


    public EmployerSpringJPA(int id, String name, String surname, String salary, String position, String hire_date) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
        this.hire_date = hire_date;
    }
    protected EmployerSpringJPA() {
    }
    @Override
    public String toString() {
        return " Id pracownika: "+id+" Imie: "+name+" Nazwisko: " + surname+" Wynagrodzenie: "+salary+" pln brutto"+" Stanowisko: "+position+" Data zatrudnienia: "+hire_date;
    }
}
