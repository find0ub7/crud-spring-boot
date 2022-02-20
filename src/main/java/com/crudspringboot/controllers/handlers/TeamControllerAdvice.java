package com.crudspringboot.controllers.handlers;

import com.crudspringboot.exceptions.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class TeamControllerAdvice {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<String> handleBusinessException(BusinessException businessException) {
        log.error("BusinesseException: ", businessException);
        return ResponseEntity.badRequest().body(businessException.getMessage());
    }
}
