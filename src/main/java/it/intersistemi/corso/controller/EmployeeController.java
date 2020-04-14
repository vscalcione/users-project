package it.intersistemi.corso.controller;

import it.intersistemi.springframework.todo.controller.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class EmployeeController extends CrudController<EmployeeDto, Integer, EmployeeService> {

    @Autowired
    private ActivityService activityService;

    @Autowired
    public EmployeeController(EmployeeService service) {
        super(service);
    }

    @RequestMapping(value="/{id}/assignActivity", method= RequestMethod.GET)
    public String showAssignActivity(@PathVariable("id") Integer idEmployee, Model model) {
        EmployeeDto dto = this.service.findById(idEmployee);
        model.addAttribute(this.getEntityModelName(), dto);
        model.addAttribute("id", idEmployee);
        model.addAttribute("employeesActivityList", activityService.employeesActivityList(idEmployee));
        Iterable<ActivityDto> activitiesList = activityService.findAll();
        model.addAttribute("activitiesList", activitiesList);
        return "employee/assignActivity";
    }

    @RequestMapping(value="/{id}/assignActivity", method=RequestMethod.POST)
    public String saveAssignActivity(@PathVariable("id") Integer idMatricola, @RequestParam(value="idActivity", required=true) String idActivity, Model model) {
        this.activityService.assignEmployeeActivity(idActivity, idEmployee);
        return "redirect:/employee/" + id + "/assignActivity";
    }

    @RequestMapping(value="/{id}/removeActivity", method=RequestMethod.GET)
    public String removeActivity(@PathVariable("idEmployee") Integer id, @RequestParam(value="idActivity", required=true) String idActivity, Model model) {
        this.activityService.removeEmployeeActivity(idActivity, idEmployee);
        return "redirect:/employee/" + idEmployee + "/assignActivity";
    }

    @Override
    protected String getEntityListModelName() {
        return "employeesList";
    }

    @Override
    protected String getEntityModelName() {
        return "employee";
    }

    @Override
    protected String getListView() {
        return "employee/employeesList";
    }

    @Override
    protected String getDetailsView() {
        return "employee/employeeDetails";
    }

    @Override
    protected String getFormView() {
        return "employee/employeeForm";
    }

    @Override
    protected String getListUrl() {
        return "/employee";
    }

}
