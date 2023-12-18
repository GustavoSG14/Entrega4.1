package com.demo.gsg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.gsg.model.Compras;
import com.demo.gsg.services.ComprasService;

@Controller
@RequestMapping("/compras")
public class ComprasController {

    @Autowired
    private ComprasService comprasService;

    // Listar
    @GetMapping
    public String listCompras(Model model) {
        List<Compras> compras = comprasService.getAllCompras();
        model.addAttribute("compras", compras);
        return "ListarCompras";
    }

    // Formulário de criação
    @GetMapping("/novo")
    public String showFormForAdd(Model model) {
        Compras compras = new Compras();
        model.addAttribute("compras", compras);
        return "comprasForm";
    }

    // Persistencia da criação
    @PostMapping("/save")
    public String saveCompras(@ModelAttribute("compras") Compras compras) {
        comprasService.saveCompras(compras);
        return "redirect:/compras";
    }

    // Formulário de edição
    @GetMapping("/editar/{id}")
    public String showFormForUpdate(@PathVariable Long id, Model model) {
        Compras compras = comprasService.getComprasById(id);
        model.addAttribute("compras", compras);
        return "editarCompras";
    }

    // Persistencia da edição
    @PostMapping("/editar/{id}")
    public String updateCompras(@PathVariable Long id, @ModelAttribute("compras") Compras compras) {
        comprasService.updateCompras(id, compras);
        return "redirect:/compras";
    }

    // Excluir compras
    @GetMapping("/deletar/{id}")
    public String deleteCompras(@PathVariable Long id) {
        comprasService.deleteCompras(id);
        return "redirect:/compras";
    }
}

