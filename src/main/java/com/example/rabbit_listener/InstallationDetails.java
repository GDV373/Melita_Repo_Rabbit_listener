package com.example.rabbit_listener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InstallationDetails implements Serializable {
    private static final long serialVersionUID = -2293083728597696069L;
    private String installationTimeslot;
    private String installationAddress;
}
