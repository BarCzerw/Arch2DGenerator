package app.geometry.exceptions;

import app.geometry.entities.basicentities.EntityType;

public class ElementAlreadyInGroupException extends Exception{
    public ElementAlreadyInGroupException(EntityType entityType) {
        System.out.println("Element already in group collection - " + entityType);
    }
}
