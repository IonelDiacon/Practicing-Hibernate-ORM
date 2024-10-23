package demo.model;

import jakarta.persistence.*;
@Entity
@Table(name = "employeedetailses")
public class EmployeeDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "position")
    private String position;

    @Column(name = "departament")
    private String departament;

    @OneToOne // This relationship should be unidirectional; it points to the owning side
    @JoinColumn(name = "employee_id") // The column name in EmployeeDetails that references EmployeeOnetoOne
    private EmployeeOnetoOne employeeOnetoOne;  // This should be the name of the relationship


    public EmployeeDetails() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public EmployeeOnetoOne getEmployeeOnetoOne() {
        return employeeOnetoOne;
    }

    public void setEmployeeOnetoOne(EmployeeOnetoOne employeeOnetoOne) {
        this.employeeOnetoOne = employeeOnetoOne;
    }

    @Override
    public String toString() {
        return "detalii de la employee{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", departament='" + departament + '\'' +
                ", employee=" + employeeOnetoOne +
                '}';
    }
}
