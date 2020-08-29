package com.sanix.RecipeApp.domain;

import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity

public class Notes {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    private String recipeNotes;
}
