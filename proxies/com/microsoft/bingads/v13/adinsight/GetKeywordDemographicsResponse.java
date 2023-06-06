
package com.microsoft.bingads.v13.adinsight;

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
 *         <element name="KeywordDemographicResult" type="{https://bingads.microsoft.com/AdInsight/v13}ArrayOfKeywordDemographicResult" minOccurs="0"/>
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
    "keywordDemographicResult"
})
@XmlRootElement(name = "GetKeywordDemographicsResponse")
public class GetKeywordDemographicsResponse {

    @XmlElement(name = "KeywordDemographicResult", nillable = true)
    protected ArrayOfKeywordDemographicResult keywordDemographicResult;

    /**
     * Gets the value of the keywordDemographicResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKeywordDemographicResult }
     *     
     */
    public ArrayOfKeywordDemographicResult getKeywordDemographicResult() {
        return keywordDemographicResult;
    }

    /**
     * Sets the value of the keywordDemographicResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKeywordDemographicResult }
     *     
     */
    public void setKeywordDemographicResult(ArrayOfKeywordDemographicResult value) {
        this.keywordDemographicResult = value;
    }

}
