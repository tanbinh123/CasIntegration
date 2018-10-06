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

public class DocumentSOAP {
    @Expose
    protected long birthDate;
    @Expose
    protected List<DrivingCategorySOAP> categories;
    @Expose
    protected String citizenship;
    @Expose
    protected String countryCode;
    @Expose
    protected Long dateOfIssue;
    @Expose
    protected String documentType;
    @Expose
    protected String entityCitizenship;
    @Expose
    protected String fname;
    @Expose
    protected Integer id;
    @Expose
    protected String issuingAuthority;
    @Expose
    protected String jmbg;
    @Expose
    protected String lname;
    @Expose
    protected Byte male;
    @Expose
    protected String placeOfBirth;
    @Expose
    protected String residence;
    @Expose
    protected String serialNumber;
    @Expose
    protected Long validUntil;

    /**
     * Gets the value of the birthDate property.
     */
    public long getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     */
    public void setBirthDate(long value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the categories property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categories property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategories().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DrivingCategorySOAP }
     */
    public List<DrivingCategorySOAP> getCategories() {
        if (categories == null) {
            categories = new ArrayList<DrivingCategorySOAP>();
        }
        return this.categories;
    }

    /**
     * Gets the value of the citizenship property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * Sets the value of the citizenship property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCitizenship(String value) {
        this.citizenship = value;
    }

    /**
     * Gets the value of the countryCode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the dateOfIssue property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setDateOfIssue(Long value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the documentType property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the entityCitizenship property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEntityCitizenship() {
        return entityCitizenship;
    }

    /**
     * Sets the value of the entityCitizenship property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEntityCitizenship(String value) {
        this.entityCitizenship = value;
    }

    /**
     * Gets the value of the fname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFname() {
        return fname;
    }

    /**
     * Sets the value of the fname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFname(String value) {
        this.fname = value;
    }

    /**
     * Gets the value of the id property.
     *
     * @return possible object is
     * {@link Integer }
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value allowed object is
     *              {@link Integer }
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the issuingAuthority property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * Sets the value of the issuingAuthority property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIssuingAuthority(String value) {
        this.issuingAuthority = value;
    }

    /**
     * Gets the value of the jmbg property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getJmbg() {
        return jmbg;
    }

    /**
     * Sets the value of the jmbg property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setJmbg(String value) {
        this.jmbg = value;
    }

    /**
     * Gets the value of the lname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getLname() {
        return lname;
    }

    /**
     * Sets the value of the lname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setLname(String value) {
        this.lname = value;
    }

    /**
     * Gets the value of the male property.
     *
     * @return possible object is
     * {@link Byte }
     */
    public Byte getMale() {
        return male;
    }

    /**
     * Sets the value of the male property.
     *
     * @param value allowed object is
     *              {@link Byte }
     */
    public void setMale(Byte value) {
        this.male = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPlaceOfBirth(String value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the residence property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getResidence() {
        return residence;
    }

    /**
     * Sets the value of the residence property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setResidence(String value) {
        this.residence = value;
    }

    /**
     * Gets the value of the serialNumber property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the validUntil property.
     *
     * @return possible object is
     * {@link Long }
     */
    public Long getValidUntil() {
        return validUntil;
    }

    /**
     * Sets the value of the validUntil property.
     *
     * @param value allowed object is
     *              {@link Long }
     */
    public void setValidUntil(Long value) {
        this.validUntil = value;
    }

}
