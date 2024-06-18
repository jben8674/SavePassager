package com.jean.SavePassager.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;




@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="passagers")
public class Passager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long code;
    @Column(nullable = false)
    private   String name;
    @Column(nullable = false)
     private  String firstName;
    @Column(nullable = false)
    private  String destination;
    @Column(nullable = false)
    private  Date date;
}
