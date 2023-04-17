package com.kerbalogy.srpc.core.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

/**
 * @Author : Artis Yao
 */
@AllArgsConstructor
@Getter
@ToString
public enum RpcResponseCodeEnum {

    SUCCESS(200, "The remote call is successful."),
    FAIL(500, "The remote call is failed.");

    private final int code;
    private final String message;
}
