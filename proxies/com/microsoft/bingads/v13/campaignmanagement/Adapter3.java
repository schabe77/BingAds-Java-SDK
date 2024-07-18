
package com.microsoft.bingads.v13.campaignmanagement;

import java.util.Collection;
import jakarta.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3
    extends XmlAdapter<String, Collection<HotelAdGroupType>>
{


    public Collection<HotelAdGroupType> unmarshal(String value) {
        return (com.microsoft.bingads.v13.campaignmanagement.HotelAdGroupTypeConverter.convertToList(value));
    }

    public String marshal(Collection<HotelAdGroupType> value) {
        return (com.microsoft.bingads.v13.campaignmanagement.HotelAdGroupTypeConverter.convertToString(value));
    }

}
