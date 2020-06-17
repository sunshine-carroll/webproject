package com.sunshine.webproject.spring.constraints.support;

import com.sunshine.webproject.spring.constraints.TestInstance;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: sunshine
 * @date: 2020/6/17 09:43
 */
public class TestInstanceValidator implements ConstraintValidator<TestInstance,String> {
    //TODO - JavaDoc methods

    

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    private static final AtomicInteger integer = new AtomicInteger(0);
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/
    public TestInstanceValidator(){
        System.out.println(integer.incrementAndGet());
    }
    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    private  TestInstance instance;
    
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return true;
    }

    @Override
    public void initialize(TestInstance constraintAnnotation) {
        System.out.println("field: "+instance);
        System.out.println("param: "+constraintAnnotation);
        this.instance = constraintAnnotation;
    }
}
