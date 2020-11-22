package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

public class Visit extends BaseEntity{
    private LocalDate visit;
    private String description;
    private Pet pet;

    public LocalDate getVisit() {
        return visit;
    }

    public void setVisit(LocalDate visit) {
        this.visit = visit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
