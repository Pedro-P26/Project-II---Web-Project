package org.example.projeto2web.RececionistController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import projeto2java.basedados.bll.*;
import projeto2java.basedados.entity.*;

import java.util.List;


@Controller
public class Rececionista_dash {

    FuncionarioEntity func_e = new FuncionarioEntity();
    Funcionariobll func_b  = new Funcionariobll();
    LoterecebidoEntity loter_e = new LoterecebidoEntity();

    @PostMapping("/add_loterecebido.html")
    public String registarLote(){
        return "redirect:/add_loterecebido.html";
    }


}
