package templates.common.exception;

import lombok.Data;

@Data
public class BaseCheckException extends RuntimeException{
    private String code;

    private String errMsg;


    public BaseCheckException(String responseCode,String responseMsg) {
        this.code = responseCode;
        this.errMsg = responseMsg;
    }

    public BaseCheckException(String errMsg) {
        this.errMsg = errMsg;
    }


}
