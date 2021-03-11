package app.geometry.entities.basicentities;

import app.geometry.entities.interfaces.Countable;
import app.geometry.entities.interfaces.MctRepresentable;
import app.mtcfile.MctDataType;

import java.io.Serializable;

public abstract class Entity implements Serializable, Countable, MctRepresentable {

    protected int id;

}
