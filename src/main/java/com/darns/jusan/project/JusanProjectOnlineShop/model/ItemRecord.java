package com.darns.jusan.project.JusanProjectOnlineShop.model;

import com.darns.jusan.project.JusanProjectOnlineShop.repostories.ItemRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@EnableJpaRepositories(basePackageClasses = ItemRepository.class)
public class ItemRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public boolean actual;
    public String details;

    public String name;

    public double price;

    public Type type;

    public String img;



}
