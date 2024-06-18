package com.jean.SavePassager.controller;


import com.jean.SavePassager.model.Passager;
import com.jean.SavePassager.service.PassagerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/passager")
public class PassagerController {
   @Autowired
  private PassagerService passagerService;




   @GetMapping()
   public List<Passager> getAllPassagerService() {
      return passagerService.findAll();
   }
    @GetMapping("/{id}")
    public Passager getPassagerById(@PathVariable long id) {
      return passagerService.findById(id);
    }
    @PostMapping()
    public Passager creatPassager(  @RequestBody Passager passager) {
      return passagerService.save(passager);
    }
    @PutMapping("/{id}")
    public Passager updatePassager(@PathVariable Long id, @RequestBody Passager passager) {
        return passagerService.update(id, passager);
    }

    @DeleteMapping("/{id}")
    public void deleteSavePassager(@PathVariable Long id) {
      passagerService.delete(id);
    }



}
