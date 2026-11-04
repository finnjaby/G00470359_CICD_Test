package ie.atu.sample.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="Bookings")
public class Booking {
    @ManyToOne
    @JoinColumn(name = "roomId")
    @Getter @Setter

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @NotBlank
    @Length(min=2, max=60)
    private String organiser;
    @Positive
    private Long attendCount;
    private String status;
    @NotEmpty
    private Long room;


    public Booking(){};

public Booking(Long Id, String organiser, Long attendCount, String status, Long room) {
    this.Id = Id;
    this.organiser = organiser;
    this.attendCount = attendCount;
}
public void setId() {

}

    public Long getId() {
    return Id;
    }
}
