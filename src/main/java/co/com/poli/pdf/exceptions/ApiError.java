package co.com.poli.pdf.exceptions;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ApiError {

    private String error;

    private String message;

    private Integer status;

//    /**
//     * Creates a new instance, with empty fields.
//     */
//    public ApiError() {
//    }
//
//    /**
//     * Creates a new instance, with provided fields.
//     *
//     * @param error   error short description.
//     * @param message full error message.
//     * @param status  HTTP Status.
//     */
//    public ApiError(String error, String message, Integer status) {
//        this.error = error;
//        this.message = message;
//        this.status = status;
//    }
//
//    /**
//     * Get Error.
//     * @return error short description.
//     */
//    public String getError() {
//        return this.error;
//    }
//
//    /**
//     * Set Error.
//     * @param error error short description.
//     */
//    public void setError(String error) {
//        this.error = error;
//    }
//
//    /**
//     * Get Message.
//     * @return full error message.
//     */
//    public String getMessage() {
//        return this.message;
//    }
//
//    /**
//     * Set Message.
//     * @param message full error message.
//     */
//    public void setMessage(String message) {
//        this.message = message;
//    }
//
//    /**
//     * Get Status.
//     * @return HTTP Status.
//     */
//    public Integer getStatus() {
//        return this.status;
//    }
//
//    /**
//     * Set Status.
//     * @param status HTTP Status.
//     */
//    public void setStatus(Integer status) {
//            this.status = status;
//        }

}
