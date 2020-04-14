package it.intersistemi.springframework.usersweb.controller;

import it.intersistemi.corso.users.model.AuthorityDto;
import it.intersistemi.corso.users.service.AuthorityService;
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
