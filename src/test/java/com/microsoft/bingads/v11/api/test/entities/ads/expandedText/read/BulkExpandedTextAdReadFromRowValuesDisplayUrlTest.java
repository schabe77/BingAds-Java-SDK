package com.microsoft.bingads.v11.api.test.entities.ads.expandedText.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v11.api.test.entities.ads.expandedText.BulkExpandedTextAdTest;
import com.microsoft.bingads.v11.bulk.entities.BulkExpandedTextAd;

public class BulkExpandedTextAdReadFromRowValuesDisplayUrlTest extends BulkExpandedTextAdTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            { "Display Url", "Display Url" },
            { "", "" },  
            { null, ""},});
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Display Url", this.datum, this.expectedResult,
                new Function<BulkExpandedTextAd, String>() {
                    @Override
                    public String apply(BulkExpandedTextAd c) {
                        return c.getExpandedTextAd().getDisplayUrl();
                    }
                });
    }
}