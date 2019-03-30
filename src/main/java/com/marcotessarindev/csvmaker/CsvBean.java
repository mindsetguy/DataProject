package com.marcotessarindev.csvmaker;

public class CsvBean {
    private String parameters;
    private String rows;
    
    /**
     * @param parameters the parameters to set
     */
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    /**
     * @return the parameters
     */
    public String getParameters() {
        return parameters;
    }

    /**
     * @param rows the rows to set
     */
    public void setRows(String rows) {
        this.rows = rows;
    }

    /**
     * @return the rows
     */
    public String getRows() {
        return rows;
    }
}