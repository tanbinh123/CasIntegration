//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1-b171012.0423 
//         See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
//         Any modifications to this file will be lost upon recompilation of the source schema. 
//         Generated on: 2018.10.05 at 12:33:48 PM CEST 
//


package rs.dzoks.dokumenti.model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Java class for documentsListSOAP complex type.
 *
 * <p>The following schema fragment specifies the expected         content contained within this class.
 *
 * <pre>
 * &lt;complexType name="documentsListSOAP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documents" type="{http://dzoks.rs/service/soap}documentSOAP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
public class DocumentsListSOAP {

    @Expose
    protected List<DocumentSOAP> documents;

    /**
     * Gets the value of the documents property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documents property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocuments().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentSOAP }
     */
    public List<DocumentSOAP> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<DocumentSOAP>();
        }
        return this.documents;
    }

}
