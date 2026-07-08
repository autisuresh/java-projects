package com.enums;

// is a special data type used to  define a fixed set of constants
public enum HttpStatusEnum {
    OK(200,"successful"),
    CREATED(201, "created"),
    BAD_REQUESTS(400, "invalid input"),
    NOT_FOUND(404, "not found"),
    INTERNAL_ERROR(500, "internal server error");

    private final int code;
    private final String description;

    HttpStatusEnum(int code, String description){
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }
    public String getDescription(){
        return description;
    }
}


