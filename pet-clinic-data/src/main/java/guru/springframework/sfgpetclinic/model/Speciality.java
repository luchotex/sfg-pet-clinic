package guru.springframework.sfgpetclinic.model;

/**
 * Created by Luis
 * on 02/10/2018.
 */
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
