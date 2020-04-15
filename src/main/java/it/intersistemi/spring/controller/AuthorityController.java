package it.intersistemi.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/authorities")
public class AuthorityController extends CrudController<AuthorityDto, String, Authority> {



}
