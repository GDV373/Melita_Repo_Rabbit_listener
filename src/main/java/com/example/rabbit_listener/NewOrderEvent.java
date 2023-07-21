package com.example.rabbit_listener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NewOrderEvent implements Serializable {
    private static final long serialVersionUID = -2293083728597696063L;
    private String customerId;
    private Package aPackage;
}
