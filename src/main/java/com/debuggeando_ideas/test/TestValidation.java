package com.debuggeando_ideas.test;

@FunctionalInterface
public interface TestValidation<T> {

    Boolean validate(T toValidate);

    default TestValidation<T> and(TestValidation<T> other) {
        return toValidate -> this.validate(toValidate) && other.validate(toValidate);
    }
}
