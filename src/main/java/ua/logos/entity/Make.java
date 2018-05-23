package ua.logos.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "car_make")
@Getter @Setter @NoArgsConstructor
@ToString(callSuper = true, exclude = "models")
public class Make extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "make")
    private List<Model> models = new ArrayList<>();

}
