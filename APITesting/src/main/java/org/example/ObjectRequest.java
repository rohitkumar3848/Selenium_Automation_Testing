package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class ObjectRequest {
    private String id;
    private String name;
    private DataPojo data;
    private String createdAt;
}
