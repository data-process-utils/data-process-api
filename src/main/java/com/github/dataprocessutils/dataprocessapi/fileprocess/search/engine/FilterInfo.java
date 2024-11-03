package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine;

import com.github.dataprocessutils.dataprocessapi.fileprocess.search.FileType;
import com.github.dataprocessutils.dataprocessapi.fileprocess.search.SearchParams;

import java.util.Collection;

public class FilterInfo {
    private String fileContent;
    private FileType type;
    private Collection<SearchParams> params;

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public FileType getType() {
        return type;
    }

    public void setType(FileType type) {
        this.type = type;
    }


    public Collection<SearchParams> getParams() {
        return params;
    }

    public void setParams(Collection<SearchParams> params) {
        this.params = params;
    }
}
