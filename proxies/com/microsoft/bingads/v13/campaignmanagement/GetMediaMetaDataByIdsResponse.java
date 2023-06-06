
package com.microsoft.bingads.v13.campaignmanagement;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MediaMetaData" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfMediaMetaData" minOccurs="0"/>
 *         <element name="PartialErrors" type="{https://bingads.microsoft.com/CampaignManagement/v13}ArrayOfBatchError" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mediaMetaData",
    "partialErrors"
})
@XmlRootElement(name = "GetMediaMetaDataByIdsResponse")
public class GetMediaMetaDataByIdsResponse {

    @XmlElement(name = "MediaMetaData", nillable = true)
    protected ArrayOfMediaMetaData mediaMetaData;
    @XmlElement(name = "PartialErrors", nillable = true)
    protected ArrayOfBatchError partialErrors;

    /**
     * Gets the value of the mediaMetaData property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMediaMetaData }
     *     
     */
    public ArrayOfMediaMetaData getMediaMetaData() {
        return mediaMetaData;
    }

    /**
     * Sets the value of the mediaMetaData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMediaMetaData }
     *     
     */
    public void setMediaMetaData(ArrayOfMediaMetaData value) {
        this.mediaMetaData = value;
    }

    /**
     * Gets the value of the partialErrors property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public ArrayOfBatchError getPartialErrors() {
        return partialErrors;
    }

    /**
     * Sets the value of the partialErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchError }
     *     
     */
    public void setPartialErrors(ArrayOfBatchError value) {
        this.partialErrors = value;
    }

}
