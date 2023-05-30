package com.tsg.bayada.joy;
import java.net.URI;
import java.time.Instant;

import com.tsg.bayada.joy.exception.KitchenStationNotFoundException;
import com.tsg.bayada.joy.exception.MethodArgumentNotValidException;
import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tsg.bayada.joy.exception.OrderNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//	@ExceptionHandler(OrderNotFoundException.class)
//    ErrorResponse handleBookmarkNotFoundException(OrderNotFoundException e) {
//        return ErrorResponse.builder(e, HttpStatus.NOT_FOUND, e.getMessage())
//                .title("Order Not found")
//                .type(URI.create("https://api.order.com/errors/not-found"))
//                .property("errorCategory", "Generic")
//                .property("timestamp", Instant.now())
//                .build();
//    }
  @ExceptionHandler(MethodArgumentNotValidException.class)
  ErrorResponse handleValidationExceptions(MethodArgumentNotValidException e) {
    return ErrorResponse.builder(e, HttpStatus.BAD_REQUEST, e.getMessage())
      .title("Invalid format")
      .type(URI.create("https://api.order.com/errors/not-found"))
      .property("errorCategory", "Generic")
      .property("timestamp", Instant.now())
      .build();
  }
//    @ExceptionHandler(KitchenStationNotFoundException.class)
//    ErrorResponse handleBookmarkNotFoundException(KitchenStationNotFoundException e) {
//        return ErrorResponse.builder(e, HttpStatus.NOT_FOUND, e.getMessage())
//                .title("Kitchenstation Not Available")
//                .type(URI.create("https://api.kitchen.com/errors/not-found"))
//                .property("errorCategory", "Generic")
//                .property("timestamp", Instant.now())
//                .build();
//    }

}
