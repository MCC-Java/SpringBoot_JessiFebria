/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mcc.crud.controllers;

import com.mcc.crud.entities.Region;
import com.mcc.crud.services.RegionServices;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author JESSI
 */
@Controller
public class RegionController {
    @Autowired
    RegionServices regionservices;
    @RequestMapping("/")
    public String index(Model model, String keyword) {
        Integer key= Integer.parseInt(keyword);
        model.addAttribute("regions", regionservices.findbyid(key));
        model.addAttribute("keyword", keyword);
        return "index";
    }
    
    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("region",new Region());
        model.addAttribute("regions",regionservices.getAll());
        return "index";
    }
    
  
    
    @RequestMapping("/save")
    public String gotosavepage(Model model){
       model.addAttribute("region", new Region());
       return "newdata";
    }
    
    @PostMapping("/savedata")
    public String save(@Valid Region region){
        regionservices.save(region);
        return "redirect:/";
    }
    
    @RequestMapping("/edit/{id}")
    public ModelAndView gotoeditpage(@PathVariable(name = "id") Integer id){
        ModelAndView mav= new ModelAndView("editdata");
        mav.addObject("region", new Region(id));
        return mav;
    }
    
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable(name = "id") Integer id){
        regionservices.delete(id);
        return "redirect:/";
    }
    

}
