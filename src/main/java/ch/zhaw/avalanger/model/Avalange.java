package ch.zhaw.avalanger.model;

import org.springframework.boot.availability.AvailabilityState;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@Document(collection = "avalanges")
public class Avalange {
    @Id
    private String id;
    @NonNull
    private String country;
    private AvalangeState state = AvalangeState.NEW;
    @NonNull
    private String description;

    
}



// Folgendes wird von Lombok generiert, daher auskommentiert
//    public Avalange(String country, String state, String description) {
//       this.country = country;
//        this.state = state;
//        this.description = description;
    

//    public String getCountry() {
//        return country;
//    }   

//    public String getState() {
//        return state;
//    }   
//    public String getDescription() {
//        return description;
//    }


//}


