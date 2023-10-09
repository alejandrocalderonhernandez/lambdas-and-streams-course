package com.debuggeando_ideas.test;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TestSimpleValidation<T>  {

    private T target;
    private String onErrorMsg;
    private List<TestValidation<T>> validations;


    public static <T> TestSimpleValidation<T> from(T target, String onErrorMsg, List<TestValidation<T>> toValidates) {
        return new TestSimpleValidation<>(target, onErrorMsg, toValidates);
    }

    public void startValidations() {
        this.validations.forEach(v -> {
            if (!v.validate(this.target)) {
                throw new IllegalArgumentException(onErrorMsg);
            }
        });
    }

}
