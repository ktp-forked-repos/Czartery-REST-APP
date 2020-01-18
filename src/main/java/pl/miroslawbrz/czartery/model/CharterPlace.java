package pl.miroslawbrz.czartery.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class CharterPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long charterPlaceId;
    private String charterPlaceName;
    private String webSiteUrl;
    private double mapLatitude;
    private double mapLongitude;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "addressId")
    private CharterPlaceAddress charterPlaceAddress;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "userId")
    private User user;


}
