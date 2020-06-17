package com.sunshine.webproject.api.demo;

import com.sunshine.webproject.log.Logger;
import com.sunshine.webproject.log.LoggerFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @author: sunshine
 * @date: 2020/6/16 17:40
 */
@SpringBootTest
public class ValidatorControllerTest {
    //TODO - JavaDoc methods



    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    private static final Logger logger = LoggerFactory.getLogger(ValidatorControllerTest.class);

    public static final String PREFIX = "/validator";

    public static final String UUID_URL = "/uuid";
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/
    
    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    @Autowired
    private MockMvc mockMvc;
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               T E S T S              |
    ============================================*/

    @Test
    public void
    givenPhoneURIWithPostAndFormData_whenMockMVC_thenVerifyErrorResponse() {

    }

}
