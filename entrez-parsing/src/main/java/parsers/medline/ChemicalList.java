//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.26 at 10:14:53 AM PDT 
//


package parsers.medline;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "chemical"
})
@XmlRootElement(name = "ChemicalList")
public class ChemicalList {

    @XmlElement(name = "Chemical", required = true)
    protected List<Chemical> chemical;

    /**
     * Gets the value of the chemical property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chemical property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChemical().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link parsers.medline.Chemical }
     *
     *
     */
    public List<Chemical> getChemical() {
        if (chemical == null) {
            chemical = new ArrayList<Chemical>();
        }
        return this.chemical;
    }

}
