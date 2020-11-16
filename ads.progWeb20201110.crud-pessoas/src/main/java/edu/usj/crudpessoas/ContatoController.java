package edu.usj.crudpessoas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class ContatoController {
    
    @Autowired
    ContatoRepository contatoRepository;

    @GetMapping(value="/")
    public ModelAndView getListaContatos() {
        List<Contato> listaContatos = contatoRepository.findAll();
        
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("listaContatos", listaContatos);
        return modelAndView;
    }

    @PostMapping(value="add")
    public ModelAndView createContato(@RequestParam String nome, @RequestParam String tipo, @RequestParam String telefone) {
        
        Contato contato = new Contato();
        contato.setNome(nome);
        contato.setTipo(tipo);
        contato.setTelefone(telefone);

        contatoRepository.save(contato);
        
        List<Contato> listaContatos = contatoRepository.findAll();

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("listaContatos", listaContatos);
        return modelAndView;
    }
    
    
}
