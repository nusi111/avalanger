package ch.zhaw.avalanger.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class Avalange {
    private String country;
    private String state;
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


