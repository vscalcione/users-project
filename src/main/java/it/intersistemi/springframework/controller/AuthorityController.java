package it.intersistemi.springframework.controller;

import it.intersistemi.springframework.dto.AuthorityDto;
import it.intersistemi.springframework.service.AuthorityService;
import it.intersistemi.springframework.usersboot.controller.CrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authorities")
public class AuthorityController extends CrudController<AuthorityDto, String, AuthorityService> {

    @Autowired
    public AuthorityController(AuthorityService repository) {
        super(repository);
    }

    @Override
    protected String getEntityListModelName() {
        return "authorityList";
    }

    @Override
    protected String getEntityModelName() {
        return "authority";
    }

    @Override
    protected String getListView() {
        return "authorities/authorityList";
    }

    @Override
    protected String getDetailsView() {
        return "authorities/authorityDetails";
    }

    @Override
    protected String getFormView() {
        return "authorities/authorityForm";
    }

    @Override
    protected String getListUrl() {
        return "/authorities";
    }

}
