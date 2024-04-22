package com.riwi.tallerSpringBoot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.riwi.tallerSpringBoot.entity.Tarea;
import com.riwi.tallerSpringBoot.service.TareaService;

@Controller
@RequestMapping("/")
public class TareaController {
    @Autowired
    private TareaService objTareaService;

    //Metodo para mostrar la vista y enviar a la lista  tareas
    @GetMapping
    public String showView(Model objModel){
        List<Tarea> listTarea= this.objTareaService.findAll();
        objModel.addAttribute("listTarea", listTarea);// llave
        return "viewTarea";
    }

    //Metodo para mostrar la vista del formulario y enviar uan instancia de tareas vacia
    /*@GetMapping("form")
    public String showViewForm(Model model){
        model.addAttribute("tarea", new Tarea()); //llave, valor
        model.addAttribute("action", "/create-tarea");
        return "viewForm";
    }
    */

    //Metodo para recibir informacion del formulario
    /*@PostMapping("create-tarea")
    public String createTarea(@ModelAttribute Tarea objTarea){
        objTareaService.create(objTarea);
        return "redirect:/";
    }*/

}
