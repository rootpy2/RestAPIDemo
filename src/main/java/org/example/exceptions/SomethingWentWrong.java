package org.example.exceptions;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
public class SomethingWentWrong {
    private static final String status = "failure";
    private final String reason;

    public SomethingWentWrong(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }
}
