package com.jean.SavePassager.service;


import com.jean.SavePassager.model.Passager;
import com.jean.SavePassager.repository.PassagerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class PassagerService {

    private PassagerRepository passagerRepository;

    public Passager save(Passager passager) {
        return passagerRepository.save(passager);

    }

    public Passager findById(Long id) {
        return passagerRepository.findById(id).orElse(null);
    }

    public List<Passager> findAll() {
        return passagerRepository.findAll();
    }

    public void delete(Long id) {
        passagerRepository.deleteById(id);
    }


    public Passager update(Long id, Passager passager) {
        Passager passagerToUpdate = passagerRepository.findById(id).orElse(null);
        if (passagerToUpdate != null) {
            passagerToUpdate.setName(passager.getName());
            passager.setFirstName(passager.getFirstName());
            passager.setDestination(passager.getDestination());
            return passagerRepository.save(passagerToUpdate);
        }
            return null;

        //public Passager update(Passager passager) {
        //     return passagerRepository.save(passager);
        //}
    }
}