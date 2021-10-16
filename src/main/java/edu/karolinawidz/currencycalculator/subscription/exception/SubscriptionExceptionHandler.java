package edu.karolinawidz.currencycalculator.subscription.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class SubscriptionExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public SubscriptionExceptionResponse handleValidationError(MethodArgumentNotValidException ex) {
        return new SubscriptionExceptionResponse(ex.getFieldError().getDefaultMessage());
    }
}
