package launcher;

import app.geometry.entities.Element2D;
import app.geometry.entities.Node;
import app.geometry.generalproperties.GeneralProperties;
import app.geometry.generalproperties.element.ElementPurpose;
import app.geometry.generalproperties.element.ElementType;
import app.geometry.generalproperties.material.ConcreteClass;
import app.geometry.generalproperties.material.Material;
import app.geometry.generalproperties.material.MaterialType;
import app.geometry.generalproperties.section.Section;

public class AppMain {

    public static void main(String[] args) {

        Node n1 = new Node(0, 0, 0);
        Node n2 = new Node(n1, 5, 0, 1);

        Material betonPref = new Material(MaterialType.CONC, ConcreteClass.C50_60);
        Section przekroj1 = new Section(250,120,"belka");
        GeneralProperties belkaProperties = new GeneralProperties(betonPref,przekroj1, ElementType.BEAM, ElementPurpose.ARCH);
        Element2D b1 = new Element2D(n1, n2, belkaProperties);

        System.out.println(n1.getMctName());
        System.out.println(n1.represent());
        System.out.println(n2.represent());

        System.out.println(b1.getMctName());
        System.out.println(b1.represent());


    }

}
