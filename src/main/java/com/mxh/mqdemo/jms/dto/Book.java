package com.mxh.mqdemo.jms.dto;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class Book implements Serializable {
    private Integer id;
    private String name;
}
