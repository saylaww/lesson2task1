package uz.pdp.task1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private boolean active = true;

    @ManyToOne(optional = false)
    private Category category;

    @OneToOne
    private Attachment photo;

    private  String code;

    @ManyToOne(optional = false)
    private Measurement measurement;



}
