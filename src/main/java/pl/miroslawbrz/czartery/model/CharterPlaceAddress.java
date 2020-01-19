package pl.miroslawbrz.czartery.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
public class CharterPlaceAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String addressStreet;
    private String addressCity;
    private String addressBuildingNumber;
    private String addressPostalCode;
    public static final String addressCountry = "Poland";
    private double mapLatitude;
    private double mapLongitude;
    @OneToOne(mappedBy = "charterPlaceAddress")
    private CharterPlace charterPlace;

}
