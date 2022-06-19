package spring.boot.demo.response;

import lombok.Data;

/**
 * @author JYH
 * @version V1.0
 * @Title:
 * @Description:
 * @date 2022/3/29 16:41
 * @param <T>
 */
@Data
public class ResponseResult<T> {

    public ResponseResult(ResponseEnum responseEnum){
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }

    public ResponseResult(ResponseEnum responseEnum, T data){
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
        this.data = data;
    }

    private String code;
    private String message;
    private T data;

}
