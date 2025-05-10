package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine;

import java.util.Base64;

/**
 * AbstractSearchEngine class is an abstract implementation of the SearchEngine interface.
 * It provides common functionality and structure for different types of search engines.
 * Subclasses must implement the search method to define specific search behavior.
 *
 * @author João Henrique
 */
public abstract class AbstractSearchEngine implements SearchEngine {

    /**
     * Decodes a base64 encoded string into a byte array.
     *
     * @param base64String the base64 encoded string to decode
     * @return the decoded byte array
     */
    protected byte[] decode(String base64String) {
        return Base64.getDecoder().decode(base64String);
    }

    /**
     * Decodes a base64 encoded string into a String.
     *
     * @param base65String the base64 encoded string to decode
     * @return the decoded string
     */
    protected String decodeAsString(String base65String) {
        return new String(decode(base65String));
    }

}
