package it.intersistemi.springframework.controller;

import it.intersistemi.springframework.dto.GroupDto;
import it.intersistemi.springframework.service.GroupService;
import it.intersistemi.springframework.usersboot.controller.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/groups")
public class GroupController extends CrudController<GroupDto, String, GroupService> {

    @Autowired
    public GroupController(GroupService repository) {
        super(repository);
    }

    @Override
    protected String getEntityListModelName() {
        return "groupList";
    }

    @Override
    protected String getEntityModelName() {
        return "group";
    }

    @Override
    protected String getListView() {
        return "groups/groupList";
    }

    @Override
    protected String getDetailsView() {
        return "groups/groupDetails";
    }

    @Override
    protected String getFormView() {
        return "groups/groupForm";
    }

    @Override
    protected String getListUrl() {
        return "/groups";
    }

}
