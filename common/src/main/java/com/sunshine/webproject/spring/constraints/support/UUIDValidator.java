package com.sunshine.webproject.spring.constraints.support;

import com.sunshine.webproject.spring.constraints.UUID;
import com.sunshine.webproject.log.Logger;
import com.sunshine.webproject.log.LoggerFactory;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

/**
 * UUID验证器
 *
 * @author: sunshine
 * @date: 2020/6/16 09:34
 */
public class UUIDValidator implements ConstraintValidator<UUID,String> {
    //TODO - JavaDoc methods

    

    /*--------------------------------------------
    |             C O N S T A N T S             |
    ============================================*/
    private static final Logger logger = LoggerFactory.getLogger(UUIDValidator.class);
    /*--------------------------------------------
    |            C O N S T R U C T S             |
    ============================================*/
    
    /*--------------------------------------------
    |         S T A T I C M E T H O D S         |
    ============================================*/
    
    /*--------------------------------------------
    |                F I E L D S                 |
    ============================================*/
    protected UUID constraintAnnotation;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        try {
            java.util.UUID uuid = java.util.UUID.fromString(value);
            boolean isValid = checkVersion(uuid);
            return isValid;
        }catch (IllegalArgumentException e){
            return false;
        }
    }

    private boolean checkVersion(java.util.UUID uuid){
        UUID constraintAnnotation = getConstraintAnnotation();
        return constraintAnnotation.version() == -1?true:Objects.equals(uuid.version(),constraintAnnotation.version());
    }

    @Override
    public void initialize(UUID constraintAnnotation) {
        this.constraintAnnotation = constraintAnnotation;
    }
    /*--------------------------------------------
    |  A C C E S S O R S / M O D I F I E R S    |
    ============================================*/

    public UUID getConstraintAnnotation() {
        return constraintAnnotation;
    }
    /*--------------------------------------------
    |               M E T H O D S               |
    ============================================*/
}
