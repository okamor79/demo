package ua.logos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import ua.logos.entity.enums.BodyType;
import ua.logos.entity.enums.FuelType;

import javax.persistence.*;

@Entity
@Table(name = "car_model")
@Getter @Setter @NoArgsConstructor @ToString(callSuper = true)
public class Model extends BaseEntity {

    private String name;

    private String year;

    @ManyToOne
    @JoinColumn(name = "make_id")
    private Make make;

    @Enumerated(EnumType.STRING)
    private BodyType bodyType;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;



}
