package app.geometry.entities;

import app.geometry.entities.interfaces.Countable;
import app.geometry.entities.interfaces.MctRepresentable;
import app.geometry.entities.interfaces.MctNameable;

import java.io.Serializable;

public abstract class Entity implements Serializable, Countable, MctNameable, MctRepresentable {

    private static int COUNT;
    protected int id;

}
