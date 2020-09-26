package com.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author lhw
 * @date 2020/9/20
 */
@Data
@Entity
@Table(name = "position")
public class Position implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String salary;

    private String city;


}
