package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine;

/**
 * Interface representing a Search Engine that performs searching based on provided FilterInfo.
 *
 * @author João Henrique
 */
public interface SearchEngine {

    /**
     * Searches based on the provided FilterInfo.
     *
     * @param info the FilterInfo containing the details for search
     * @return the search result as an Object
     */
    Object search(FilterInfo info);
}
