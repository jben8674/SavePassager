package com.jean.SavePassager.repository;
import com.jean.SavePassager.model.Passager;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  PassagerRepository extends JpaRepository<Passager, Long> {
}
