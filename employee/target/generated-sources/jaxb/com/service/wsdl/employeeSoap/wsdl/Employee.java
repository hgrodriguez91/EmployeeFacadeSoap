//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.13 a las 01:12:12 PM CST 
//


package com.service.wsdl.employeeSoap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para employee complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="employee"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="names" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="document_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="document_number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="job_date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="job_position" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pay_rate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employee", propOrder = {
    "id",
    "names",
    "lastName",
    "documentType",
    "documentNumber",
    "birthday",
    "jobDate",
    "jobPosition",
    "payRate"
})
public class Employee {

    protected int id;
    @XmlElement(required = true)
    protected String names;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;
    @XmlElement(name = "document_type", required = true)
    protected String documentType;
    @XmlElement(name = "document_number", required = true)
    protected String documentNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "job_date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar jobDate;
    @XmlElement(name = "job_position", required = true)
    protected String jobPosition;
    @XmlElement(name = "pay_rate")
    protected double payRate;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad names.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNames() {
        return names;
    }

    /**
     * Define el valor de la propiedad names.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNames(String value) {
        this.names = value;
    }

    /**
     * Obtiene el valor de la propiedad lastName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Define el valor de la propiedad lastName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Obtiene el valor de la propiedad documentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * Define el valor de la propiedad documentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentType(String value) {
        this.documentType = value;
    }

    /**
     * Obtiene el valor de la propiedad documentNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Define el valor de la propiedad documentNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad birthday.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Define el valor de la propiedad birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Obtiene el valor de la propiedad jobDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getJobDate() {
        return jobDate;
    }

    /**
     * Define el valor de la propiedad jobDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setJobDate(XMLGregorianCalendar value) {
        this.jobDate = value;
    }

    /**
     * Obtiene el valor de la propiedad jobPosition.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPosition() {
        return jobPosition;
    }

    /**
     * Define el valor de la propiedad jobPosition.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPosition(String value) {
        this.jobPosition = value;
    }

    /**
     * Obtiene el valor de la propiedad payRate.
     * 
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * Define el valor de la propiedad payRate.
     * 
     */
    public void setPayRate(double value) {
        this.payRate = value;
    }

}
