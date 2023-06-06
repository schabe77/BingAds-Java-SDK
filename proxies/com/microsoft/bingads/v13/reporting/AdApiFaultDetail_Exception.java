
package com.microsoft.bingads.v13.reporting;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebFault(name = "AdApiFaultDetail", targetNamespace = "https://adapi.microsoft.com")
public class AdApiFaultDetail_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AdApiFaultDetail faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AdApiFaultDetail_Exception(String message, AdApiFaultDetail faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param cause
     * @param faultInfo
     * @param message
     */
    public AdApiFaultDetail_Exception(String message, AdApiFaultDetail faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.microsoft.bingads.v13.reporting.AdApiFaultDetail
     */
    public AdApiFaultDetail getFaultInfo() {
        return faultInfo;
    }

}
