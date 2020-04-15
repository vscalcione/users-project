package it.intersistemi.springframework.controller;

@Controller
@RequestMapping("/attivita")
public class ActivityController extends CrudController<AttivitaDto, String, AttivitaService> {

    @Autowired
    private DipendenteService dipendenteService;

    @Autowired
    public ActivityController(AttivitaService service) {
        super(service);
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class,
                new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value="/{id}/visualizzaDipendenti", method=RequestMethod.GET)
    public String showEditForm(@PathVariable("id") String idAttivita, Model model) {
        model.addAttribute("idAttivita", idAttivita);
        model.addAttribute("listaDipendenti", this.dipendenteService.listaDipendentiAttivita(idAttivita));
        return "attivita/listaDipendentiAttivita";
    }


    @Override
    protected String getEntityListModelName() {
        return "listaAttivita";
    }

    @Override
    protected String getEntityModelName() {
        return "attivita";
    }

    @Override
    protected String getListView() {
        return "attivita/listaAttivita";
    }

    @Override
    protected String getDetailsView() {
        return "attivita/dettaglioAttivita";
    }

    @Override
    protected String getFormView() {
        return "attivita/formAttivita";
    }

    @Override
    protected String getListUrl() {
        return "/attivita";
    }

}
