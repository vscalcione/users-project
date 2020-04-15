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

    @RequestMapping(params = "difference")
    public String difference(@RequestParam(name="value1", required=true) int value1, @RequestParam(name="value2", required=true) int value2, Model model) {
        int result = value1 - value2;
        model.addAttribute("operation", "Difference");
        model.addAttribute("result", result);
        return "calculator";
    }

    @RequestMapping(params = "product")
    public String product(@RequestParam(name="value1", required=true) int value1, @RequestParam(name="value2", required=true) int value2, Model model) {
        int result = value1 * value2;
        model.addAttribute("operation", "Product");
        model.addAttribute("result", result);
        return "calculator";
    }

    @RequestMapping(params = "quozient")
    public String quozient(@RequestParam(name="value1", required=true) int value1, @RequestParam(name="value2", required=true) int value2, Model model) {
        int result = value1 / value2;
        model.addAttribute("operation", "Quozient");
        model.addAttribute("result", result);
        return "calculator";
    }

}
