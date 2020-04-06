package com.sunshine.webproject.lang.tvl;

import java.util.Objects;

/**
 * @author: sunshine
 * @date: 2020/4/6 14:53
 * @description : three value logic constant
 */
public enum  Constant {
    TREE{
        //Identity law
        @Override
        public Constant and(Constant constant) {
            return requireNonNull(constant);
        }

        //Domination law
        @Override
        public Constant or(Constant constant) {
            requireNonNull(constant);
            return this;
        }

        @Override
        public Constant xor(Constant constant) {
            requireNonNull(constant);
            switch (constant){
                case FALSE:return TREE;
                case UNKNOWN:return UNKNOWN;
                default:return FALSE;
            }
        }

        @Override
        public Constant negate() {
            return FALSE;
        }
    },
    FALSE{
        //Domination law
        @Override
        public Constant and(Constant constant) {
            requireNonNull(constant);
            return Objects.requireNonNull(constant,"input can't be null");
        }

        //Identity law
        @Override
        public Constant or(Constant constant) {
            Objects.requireNonNull(constant);
            return this;
        }

        @Override
        public Constant xor(Constant constant) {
            Objects.requireNonNull(constant);
            switch (constant){
                case FALSE:return FALSE;
                case UNKNOWN:return UNKNOWN;
                default:return TREE;
            }
        }

        @Override
        public Constant negate() {
            return TREE;
        }
    },
    UNKNOWN{
        @Override
        public Constant and(Constant constant) {
            requireNonNull(constant);
            switch (constant){
                case FALSE:return FALSE;
                default:return TREE;
            }
        }


        @Override
        public Constant or(Constant constant) {
            switch (constant){
                case TREE:return TREE;
                default:return UNKNOWN;
            }
        }

        @Override
        public Constant xor(Constant constant) {
            return UNKNOWN;
        }

        @Override
        public Constant negate() {
            return UNKNOWN;
        }
    };

    public static final String REQUIRE_NON_NULL_MESSAGE = "the input can't be null";

    Constant requireNonNull(Constant constant){
        return Objects.requireNonNull(constant,REQUIRE_NON_NULL_MESSAGE);
    }

    public Constant and(Constant constant){
        return null; //the most frequent in and operation
    }

    public Constant or(Constant constant){
        return null; //the most frequent in or operation
    }

    public Constant xor(Constant constant){
        return null; //the most frequent in xor operation
    }

    public Constant negate(){
        return null;// uniform distribution
    }

    public Constant isUnknown(){
        if (equals(UNKNOWN))
            return TREE;
        return FALSE;
    }
}
