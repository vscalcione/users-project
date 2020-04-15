package it.intersistemi.springframework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @RequestMapping
    public String form() {
        return "calculator";
    }

    @RequestMapping(params = "sum")
    public String sum(@RequestParam(name="value1", required=true) int value1, @RequestParam(name="value2", required=true) int value2, Model model) {
        int result = value1 + value2;
        model.addAttribute("operation", "Sum");
        model.addAttribute("result", result);
        return "calculator";
    }

    @RequestMapping(params="sottrai")
    public String sottrai(@RequestParam(name="op1", required=true) int op1, @RequestParam(name="op2", required=true) int op2, Model model) {
        int risultato = op1 - op2;
        model.addAttribute("operazione", "Differenza");
        model.addAttribute("risultato", risultato);
        return "calcolatrice";
    }

    //	@RequestMapping("/moltiplica")
    @RequestMapping(params="moltiplica")
    public String moltiplica(
            @RequestParam(name="op1", required=true) int op1,
            @RequestParam(name="op2", required=true) int op2,
            Model model
    ) {
        int risultato = op1 * op2;
        model.addAttribute("operazione", "Moltiplicazione");
        model.addAttribute("risultato", risultato);
        return "calcolatrice";
    }

    //	@RequestMapping("/dividi")
    @RequestMapping(params="dividi")
    public String dividi(
            @RequestParam(name="op1", required=true) int op1,
            @RequestParam(name="op2", required=true) int op2,
            Model model
    ) {
        int risultato = op1 / op2;
        model.addAttribute("operazione", "Divisione");
        model.addAttribute("risultato", risultato);
        return "calcolatrice";
    }

}
