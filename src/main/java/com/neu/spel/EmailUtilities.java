package com.neu.spel;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by ubuntu on 14-11-8.
 */
public class EmailUtilities
{
    @Value("#{'aaa'}")
    private String email;

    private String password;

    private String host;
}
