package com.sanix.RecipeApp.services;

import com.sanix.RecipeApp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
