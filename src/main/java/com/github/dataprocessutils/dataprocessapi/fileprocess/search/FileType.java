package com.github.dataprocessutils.dataprocessapi.fileprocess.search;

public enum FileType {
    CSV("text/csv"),
    JSON("application/json"),
    XML("application/xml"),
    XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    private final String type;

    FileType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static FileType getByName(String type) {
        for (FileType t : values()) {
            if (t.getType().equals(type)) {
                return t;
            }
        }
        return null;
    }
}
