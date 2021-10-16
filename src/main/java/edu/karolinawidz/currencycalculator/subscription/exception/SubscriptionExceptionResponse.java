package edu.karolinawidz.currencycalculator.subscription.exception;

class SubscriptionExceptionResponse {

    private String message;

    public SubscriptionExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
