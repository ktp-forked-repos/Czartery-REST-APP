package pl.miroslawbrz.czartery.api.request;

import lombok.Data;
import pl.miroslawbrz.czartery.model.User;

@Data
public class CreateCharterPlaceRequest {

    private String charterPlaceName;
    private String webSiteUrl;
    private String addressStreet;
    private String addressBuildingNumber;
    private String addressCity;
    private Long userId;

    public static final class Builder{

        private String charterPlaceName = null;
        private String webSiteUrl = null;
        private String addressStreet = null;
        private String addressCity = null;
        private String addressBuildingNumber = null;
        private Long userId = null;


        public Builder charterPlaceName(String charterPlaceName){
            this.charterPlaceName = charterPlaceName;
            return this;
        }
        public Builder webSiteUrl(String webSiteUrl){
            this.webSiteUrl = webSiteUrl;
            return this;
        }
        public Builder addressStreet(String addressStreet){
            this.addressStreet = addressStreet;
            return this;
        }
        public Builder addressCity(String addressCity){
            this.addressCity = addressCity;
            return this;
        }
        public Builder addressBuildingNumber(String addressBuildingNumber){
            this.addressBuildingNumber = addressBuildingNumber;
            return this;
        }
        public Builder userId(Long userId){
            this.userId = userId;
            return this;
        }

        public CreateCharterPlaceRequest build(){
            CreateCharterPlaceRequest createCharterPlaceRequest = new CreateCharterPlaceRequest();
            createCharterPlaceRequest.charterPlaceName = this.charterPlaceName;
            createCharterPlaceRequest.webSiteUrl = this.webSiteUrl;
            createCharterPlaceRequest.addressStreet = this.addressStreet;
            createCharterPlaceRequest.addressCity = this.addressCity;
            createCharterPlaceRequest.addressBuildingNumber = this.addressBuildingNumber;
            createCharterPlaceRequest.userId = this.userId;
            return createCharterPlaceRequest;
        }

    }


}
