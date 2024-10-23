package demo.controller;

import demo.model.EmployeeOnetoOne;
import demo.model.EmployeeDetails;
import demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public EmployeeDetails getEmployeeDetails(@PathVariable int id) {
        return employeeService.getEmployeeDetailsById(id);
    }

    @GetMapping("/{id}/employee")
    public EmployeeOnetoOne getEmployee(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/")
    public List<EmployeeDetails> getAllEmployees() {
        return employeeService.getAllEmployees();

    }

    @PostMapping("/")
    public EmployeeOnetoOne createEmployee(@RequestBody EmployeeOnetoOne employeeOnetoOne) {
        return employeeService.saveEmployee(employeeOnetoOne);
    }

    @PostMapping("/details")
    public EmployeeDetails createEmployeeDetails(@RequestBody EmployeeDetails details) {
        return employeeService.saveEmployeeDetails(details);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployeeById(id);
    }
}
