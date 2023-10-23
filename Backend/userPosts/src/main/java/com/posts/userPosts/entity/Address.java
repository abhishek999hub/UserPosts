package com.posts.userPosts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


    @Entity
    @Table(name = "address")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Address {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String street;
        private String suite;
        private String city;
        private String zipcode;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "geo_id")
        private Geo geo;
}
