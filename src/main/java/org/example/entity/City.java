package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity(name = "cities")
public class City {
    @Id
    @Column(name = "city_id", columnDefinition = "SMALLINT")
    private Long cityId;
    @Column(name = "city")
    private String name;
    @Column(name = "country_id")
    private int countryId;
    @Column(name = "last_update")
    private Timestamp update;
}
