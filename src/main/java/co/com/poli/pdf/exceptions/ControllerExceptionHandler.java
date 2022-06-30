package co.com.poli.pdf.exceptions;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    //Body Mal formado
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<ApiError> malformedJsonException(HttpMessageNotReadableException exc) {

        ApiError apiError = ApiError.builder()
                            .message("Json is malformed")
                            .status(HttpStatus.BAD_REQUEST.value()).build();

        return ResponseEntity.status(apiError.getStatus()).body(apiError);

    }

    //Capturas las validaciones de los "input"
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> malformedBodyException(MethodArgumentNotValidException e) {

        ApiError apiError =
                new ApiError(
                        "Input is invalid", e.getFieldError().getDefaultMessage(), HttpStatus.BAD_REQUEST.value());
        return ResponseEntity.status(apiError.getStatus()).body(apiError);

    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<ApiError> methodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        ApiError apiError =
                new ApiError(
                        "Method Not Supported", e.getMessage(), HttpStatus.METHOD_NOT_ALLOWED.value());
        return ResponseEntity.status(apiError.getStatus()).body(apiError);
    }
}
