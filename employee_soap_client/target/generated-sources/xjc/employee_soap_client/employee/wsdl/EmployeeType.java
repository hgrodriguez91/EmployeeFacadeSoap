//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.11.15 a las 03:52:10 AM CST 
//


package employee_soap_client.employee.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para employeeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="employeeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="names" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="documentNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="boindingJob" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="jobPosition" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payRate" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employeeType", propOrder = {
    "names",
    "lastName",
    "documentType",
    "documentNumber",
    "birthday",
    "boindingJob",
    "jobPosition",
    "payRate"
})
public class EmployeeType {

    @XmlElement(required = true)
    protected String names;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;
    @XmlElement(required = true)
    protected String documentType;
    @XmlElement(required = true)
    protected String documentNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar boindingJob;
    @XmlElement(required = true)
    protected String jobPosition;
    protected double payRate;

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
     * Obtiene el valor de la propiedad boindingJob.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBoindingJob() {
        return boindingJob;
    }

    /**
     * Define el valor de la propiedad boindingJob.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBoindingJob(XMLGregorianCalendar value) {
        this.boindingJob = value;
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

    @Override
    public String toString() {
        return "EmployeeType{" +
                "names='" + names + '\'' +
                ", lastName='" + lastName + '\'' +
                ", documentType='" + documentType + '\'' +
                ", documentNumber='" + documentNumber + '\'' +
                ", birthday=" + birthday +
                ", boindingJob=" + boindingJob +
                ", jobPosition='" + jobPosition + '\'' +
                ", payRate=" + payRate +
                '}';
    }
}
