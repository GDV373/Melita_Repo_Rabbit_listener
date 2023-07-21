package com.example.rabbit_listener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Package implements Serializable {

    private static final long serialVersionUID = -2293083728597696066L;

    enum Telephony {
        BASIC_TELEPHONY,
        UNLIMITED_TELEPHONY
    }

    enum Internet {
        HALF_GIGABIT_INTERNET,
        GIGABIT_INTERNET
    }

    enum Mobile {
        PREPAID,
        POSTPAID
    }

    enum Television {
        STARTER,
        LHD,
        XLHD
    }

    private Telephony telephonyPackage;
    private Internet internetPackage;
    private Mobile mobilePackage;
    private Television televisionPackage;
    private InstallationDetails installationDetails;

}
