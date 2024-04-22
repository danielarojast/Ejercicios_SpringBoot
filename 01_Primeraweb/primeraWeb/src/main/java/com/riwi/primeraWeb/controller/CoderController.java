package com.riwi.primeraWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.riwi.primeraWeb.entity.Coder;
import com.riwi.primeraWeb.service.CoderService;

@Controller
//RequestMapping crea la ruta donde se activara el controlador
@RequestMapping("/")
public class CoderController {
    
    @Autowired
    private CoderService objCoderService; 

    //Metodo para mostrar la vista y enviarle tola la lista de coders


    @GetMapping
    public String showViewCoder(Model objModel, 
        @RequestParam(defaultValue = "1")int page, 
        @RequestParam(defaultValue = "3")int size){
        Page<Coder> listCoders= this.objCoderService.findAllPaginate(page - 1, size);
        
        objModel.addAttribute("listCoders", listCoders);// llave, valor
        objModel.addAttribute("CurrentPage", page);
        objModel.addAttribute("totalPage", listCoders.getTotalPages());
        
        return "viewCoders"; 
    }

    /*
     * Metodo para mostrar la vista del formulario y ademas enviar una instancia del coder vacia;
     */
    @GetMapping("form")
    public String showViewFrom(Model model){
        model.addAttribute("coder", new Coder());
        model.addAttribute("action", "/create-coder");
        return "viewForm";
    }

    /*
     * Metodo para recibir toda la informacion del formulario
     * ModelAttribute lo usamospara recibir informacion de la vista 
    */
    
    @PostMapping("create-coder")

    public String createCoder(@ModelAttribute Coder objCoder){
        this.objCoderService.create(objCoder);
        return "redirect:/";
    }
    

    /*Controlador para eliminar, recibira como parametro el id por url 
      * @pathvariable funciona para obtener el variable  de una url 
      solo si es de tipo path (ejm /delete/10 donde el 10 es dinamico).
    */

    @GetMapping("/delete/{id}")
    public String deleteCoder(@PathVariable Long id){
        this.objCoderService.delete(id);

        //Redireccionar a la lista de coders
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String updateCoder(@PathVariable Long id, Model model){
        Coder objCoder = this.objCoderService.findById(id);
        model.addAttribute("coder", objCoder);
        model.addAttribute("action", "/edit/" + id);

        return "viewForm";
    }

    @PostMapping("edit/{id}")
    public String  updateCoder(@PathVariable Long id, @ModelAttribute Coder objCoder){
        this.objCoderService.update(id, objCoder);
        return "redirect:/";
    }
    
}
