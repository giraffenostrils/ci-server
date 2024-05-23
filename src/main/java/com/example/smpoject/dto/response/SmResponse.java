package com.example.smpoject.dto.response;

public record SmResponse(
        Long id,String name,String text

) {
    public Object getName() {
        return this.name;
    }

    public Object getId() {
        return this.id;
    }
}
