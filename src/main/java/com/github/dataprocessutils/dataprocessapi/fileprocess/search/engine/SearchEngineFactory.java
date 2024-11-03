package com.github.dataprocessutils.dataprocessapi.fileprocess.search.engine;

import com.github.dataprocessutils.dataprocessapi.fileprocess.search.FileType;

public class SearchEngineFactory {

    public static SearchEngine createSearchEngine(FileType type) {
//        if (type == FileType.CSV) {
//            return new CsvSearchEngine();
//        } else if (type == FileType.XML) {
//
//        }
//        else if (type == FileType.JSON) {
        return new JsonSearchEngine();
//        }

    }
}
