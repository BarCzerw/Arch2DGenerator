package app.geometry.entities.collectionsofbasics;

import app.geometry.entities.basicentities.Entity;
import app.geometry.entities.basicentities.EntityType;
import app.geometry.entities.interfaces.Countable;
import app.mtcfile.MctDataType;

import java.util.*;

public class Group<T extends Entity> {

    protected Set<T> elements;
    protected MctDataType mctDataType;
    protected EntityType entityType;

    public Group(MctDataType mctDataType, EntityType entityType) {
        this.mctDataType = mctDataType;
        this.entityType = entityType;
        this.elements = new HashSet<>();
    }

    public boolean add(T element) {
        return elements.add(element);
    }

    public int size() {
        return elements.size();
    }

    public List<? extends Entity> getElements() {
        List<? extends Entity> returnList = new ArrayList<>(elements);
        returnList.sort(Comparator.comparingInt(Countable::getId));
        return returnList;
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public MctDataType getMctDataType() {
        return mctDataType;
    }

}
