package com.microsoft.bingads.internal.restful.adaptor.generated.reporting.enums;

import java.util.Collection;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.microsoft.bingads.v13.reporting.*;
import com.microsoft.bingads.internal.restful.adaptor.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public interface AccountPerformanceReportFilterEnumsMixIn{
		
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = AccountStatusReportFilterDeserializer.class)
	Collection<AccountStatusReportFilter> getAccountStatus();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = AdDistributionReportFilterDeserializer.class)
	Collection<AdDistributionReportFilter> getAdDistribution();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = DeviceOSReportFilterDeserializer.class)
	Collection<DeviceOSReportFilter> getDeviceOS();

    	
	@JsonSerialize(using = EnumListSerializer.class)
	@JsonDeserialize(using = DeviceTypeReportFilterDeserializer.class)
	Collection<DeviceTypeReportFilter> getDeviceType();

    }