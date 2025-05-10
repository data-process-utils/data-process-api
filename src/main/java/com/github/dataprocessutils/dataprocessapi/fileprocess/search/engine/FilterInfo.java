package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine;

import com.github.dataprocessutils.dataprocessapi.fileprocess.search.FileType;
import com.github.dataprocessutils.dataprocessapi.fileprocess.search.SearchParams;

import java.util.Collection;

/**
 * The FilterInfo class represents information related to a file filter criteria.
 *
 * @author João Henrique
 */
public class FilterInfo {

    /**
     * Private variable to store the content of a file.
     */
    private String fileContent;

    /**
     * This private variable type represents the FileType of a file.
     */
    private FileType type;

    /**
     * Private variable to store a collection of search parameters.
     * An instance of Collection<SearchParams> contains search parameters consisting of field names, comparison operators, and values.
     */
    private Collection<SearchParams> params;

    /**
     *
     * @return
     */
    public String getFileContent() {
        return fileContent;
    }

    /**
     * Sets the content of the file.
     *
     * @param fileContent the content to be set for the file
     */
    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    /**
     * Retrieves the FileType of this FilterInfo.
     *
     * @return the FileType of this FilterInfo
     */
    public FileType getType() {
        return type;
    }

    /**
     * Sets the type of the file within this FilterInfo instance.
     *
     * @param type the FileType to be set for the file
     */
    public void setType(FileType type) {
        this.type = type;
    }


    /**
     * Retrieves the search parameters associated with this FilterInfo.
     *
     * @return A Collection of SearchParams representing the search parameters consisting of field names, comparison operators, and values
     */

    public Collection<SearchParams> getParams() {
        return params;
    }

    /**
     * Sets the search parameters for this FilterInfo instance.
     *
     * @param params A Collection of SearchParams representing the search parameters consisting of field names, comparison operators, and values
     */
    public void setParams(Collection<SearchParams> params) {
        this.params = params;
    }
}
