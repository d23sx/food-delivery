package com.d23sx.restaurantlisting.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDTO {
    @Id
    private  int id;
    private String name;
    private String address;
    private String city;
    private String restaurantDescription;
}

