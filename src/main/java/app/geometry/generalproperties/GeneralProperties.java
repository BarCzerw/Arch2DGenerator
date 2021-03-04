package app.geometry.generalproperties;

import app.geometry.generalproperties.section.Section;
import app.geometry.generalproperties.element.ElementPurpose;
import app.geometry.generalproperties.element.ElementType;
import app.geometry.generalproperties.material.Material;

public class GeneralProperties {

    private Material material;
    private Section section;
    private ElementType elementType;
    private ElementPurpose elementPurpose;

    public GeneralProperties(Material material, Section section, ElementType elementType, ElementPurpose elementPurpose) {
        this.material = material;
        this.section = section;
        this.elementType = elementType;
        this.elementPurpose = elementPurpose;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public ElementType getElementType() {
        return elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    public ElementPurpose getElementPurpose() {
        return elementPurpose;
    }

    public void setElementPurpose(ElementPurpose elementPurpose) {
        this.elementPurpose = elementPurpose;
    }
}
