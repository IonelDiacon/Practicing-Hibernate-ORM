package demo.model;

import jakarta.persistence.*;


@Entity
@Table(name = "EmployeeOnetoOne")
public class EmployeeOnetoOne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private String sex;

//    @OneToOne(mappedBy = "employeeOnetoOne")  // This is correct
//    private EmployeeDetails employeeDetails;

    // Getters and setters


    public EmployeeOnetoOne() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

//    public EmployeeDetails getEmployeeDetails() {
//        return employeeDetails;
//    }
//
//    public void setEmployeeDetails(EmployeeDetails employeeDetails) {
//        this.employeeDetails = employeeDetails;
//    }

    @Override
    public String toString() {
        return "EmployeeOnetoOne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
//                ", employeeDetails=" + employeeDetails +
                '}';
    }
}

