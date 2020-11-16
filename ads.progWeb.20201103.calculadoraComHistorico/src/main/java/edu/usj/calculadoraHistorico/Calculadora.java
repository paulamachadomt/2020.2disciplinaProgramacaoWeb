package edu.usj.calculadoraHistorico;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Calculadora {

    List<String> historico = new ArrayList<>();

    @PostMapping(value="somar")
    public ModelAndView postSomar(@RequestParam String a, @RequestParam String b) {
        
        ModelAndView modelAndView = new ModelAndView("index");
        Double aDouble = Double.valueOf(a);
        Double bDouble = Double.valueOf(b);
        Double resultado = aDouble + bDouble;
        String operacao = a + " + " + b + " = " + resultado;

        historico.add(operacao);

        modelAndView.addObject("resultado", operacao);

        modelAndView.addObject("historico", historico);
        
        return modelAndView;
    }
    
    
}
