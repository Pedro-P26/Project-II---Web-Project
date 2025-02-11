package org.example.projeto2web;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import projeto2java.basedados.entity.*;
import projeto2java.basedados.bll.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {



        @PostMapping("/login")
        public void login(@RequestParam("username") String username,@RequestParam("password") String password, HttpServletResponse response) throws IOException {
                Funcionariobll func_b = new Funcionariobll();

                PrintWriter out = response.getWriter();
                var func_e = func_b.getbyusername(username);

                if (func_e != null && func_e.getPassword().equals(password) && func_e.getIdTipofuncionario()==1) {
                        response.sendRedirect("/rececionista_dash.html");
                }else{
                        out.println("<html>");
                        out.println("<head><title>Alerta</title></head>");
                        out.println("<body>");
                        out.println("<script>alert('Dados incorretos. Por favor, verifique os campos novamente.');</script>");
                        out.println("</body>");
                        out.println("</html>");

                }
                if (func_e != null && func_e.getPassword().equals(password) && func_e.getIdTipofuncionario()==2) {
                        response.sendRedirect("/encomenda_dash.html");
                }else{
                        out.println("<html>");
                        out.println("<head><title>Alerta</title></head>");
                        out.println("<body>");
                        out.println("<script>alert('Dados incorretos. Por favor, verifique os campos novamente.');</script>");
                        out.println("</body>");
                        out.println("</html>");

                }
                if (func_e != null && func_e.getPassword().equals(password) && func_e.getIdTipofuncionario()==3) {
                        response.sendRedirect("/producao_dash.html");
                }else{
                        out.println("<html>");
                        out.println("<head><title>Alerta</title></head>");
                        out.println("<body>");
                        out.println("<script>alert('Dados incorretos. Por favor, verifique os campos novamente.');</script>");
                        out.println("</body>");
                        out.println("</html>");

                }
        }





        @PostMapping("/")
        public String logout(Model model){
                return "login";
        }

        @GetMapping("/")
        public String home(Model model){
                return "login";
        }

        loterecebidobll loter_b = new loterecebidobll();
        encomendabll enc_b = new encomendabll();
        fornecedorbll for_b = new fornecedorbll();

        @GetMapping("static/rececionista_dash.html")
        public String rececionista_dash(Model model) {


                List<LoterecebidoEntity> lotesrecebidos = loter_b.listarloterecebido();
                model.addAttribute("lotesrecebidos",lotesrecebidos);

                List<EncomendaEntity> encomendas = enc_b.listarencomenda();
                model.addAttribute("encomendas",encomendas);

                List<FornecedorEntity> fornecedores = for_b.listarforn();
                model.addAttribute("fornecedores",fornecedores);


                return "rececionista_dash";
        }




}
