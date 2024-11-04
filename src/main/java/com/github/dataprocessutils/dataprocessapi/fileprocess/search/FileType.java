package com.github.dataprocessutils.dataprocessapi.fileprocess.search;

/**
 * FileType enum represents different file types with their associated MIME types.
 *
 * @author João Henrique
 */
public enum FileType {

    /**
     * Define the MIME type for CSV files.
     * This enum constant represents the MIME type for files in CSV format.
     */
    CSV("text/csv"),

    /**
     * Represents the MIME type for JSON files.
     */
    JSON("application/json"),

    /**
     * This enum constant represents the MIME type for XML files.
     */
    XML("application/xml"),

    /**
     * Represents the MIME type for XLSX (Excel) files.
     */
    XLSX("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    /**
     * Represents the type of file.
     * This variable is declared as final to ensure immutability and consistency.
     */
    private final String type;

    /**
     * Constructs a new FileType enum constant with the specified type.
     *
     * @param type the MIME type associated with the file type
     */
    FileType(String type) {
        this.type = type;
    }

    /**
     * Returns the MIME type associated with the file type.
     *
     * @return the MIME type of the file type
     */
    public String getType() {
        return type;
    }

    /**
     * Retrieves the FileType enum constant based on the given file type.
     *
     * @param type the file type to search for
     * @return the FileType enum constant corresponding to the specified file type, or null if not found
     */
    public static FileType getByName(String type) {
        for (FileType t : values()) {
            if (t.getType().equals(type)) {
                return t;
            }
        }
        return null;
    }
}
