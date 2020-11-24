package com.sunshine.webproject.spring.constraints.support;

import com.sunshine.webproject.spring.constraints.Regex;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

/**
 * @author: sunshine
 * @date: 2020/6/17 11:45
 */
public class RegexValidator implements ConstraintValidator<Regex,String> {
    //TODO - JavaDoc methods

    

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/
    
    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    protected String regex;

    protected Pattern pattern;

    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/
    
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return pattern.matcher(value).find();
    }

    @Override
    public void initialize(Regex constraintAnnotation) {
        this.regex = constraintAnnotation.regex();
        pattern = Pattern.compile(regex);
    }
}
