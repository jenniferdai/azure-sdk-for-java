// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.credentials;

import com.azure.storage.common.Utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Code snippets for {@link SasTokenCredential}.
 */
public final class SASTokenCredentialJavaDocCodeSnippets {
    private final URL url = new URL("https://www.example.com?queryString");

    /**
     * @throws MalformedURLException ignored
     */
    public SASTokenCredentialJavaDocCodeSnippets() throws MalformedURLException {
    }

    /**
     * Code sample for {@link SasTokenCredential#fromSASTokenString(String)}.
     */
    public void fromSASTokenString() {
        String preformattedSASToken = "sasToken";
        // BEGIN: com.azure.storage.common.credentials.SasTokenCredential.fromSASTokenString#String
        SasTokenCredential credential = SasTokenCredential.fromSASTokenString(preformattedSASToken);
        // END: com.azure.storage.common.credentials.SasTokenCredential.fromSASTokenString#String
    }

    /**
     * Code sample for {@link SasTokenCredential#fromQueryParameters(Map)}.
     */
    public void fromQueryParameters() {
        // BEGIN: com.azure.storage.common.credentials.SasTokenCredential.fromQueryParameters#Map
        SasTokenCredential credential = SasTokenCredential
            .fromQueryParameters(Utility.parseQueryString(url.getQuery()));
        // END: com.azure.storage.common.credentials.SasTokenCredential.fromQueryParameters#Map
    }
}
