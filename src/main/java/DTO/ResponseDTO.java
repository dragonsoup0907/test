package DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDTO<T> {

    private boolean success;   // 성공 여부
    private String message;    // 응답 메시지
    private T data;            // 실제 데이터
    
    private ResponseDTO(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    // 성공 (데이터 있음)
    public static <T> ResponseDTO<T> success(T data) {
        return new ResponseDTO<>(true, "성공", data);
    }

    // 성공 (데이터 없음: 삭제 등)
    public static <T> ResponseDTO<T> success() {
        return new ResponseDTO<>(true, "성공", null);
    }

    // 실패
    public static <T> ResponseDTO<T> fail(String message) {
        return new ResponseDTO<>(false, message, null);
    }
}

