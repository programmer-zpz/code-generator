package com.fline.generator;

/**
 * 用于停止程序抛出的异常
 * 
 * @since 2019年7月27日 下午7:42:21
 */
public class GenerateException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public GenerateException(String message) {
        super(message);
    }

    /**
     * 
     */
    public GenerateException(String message, Throwable e) {
        super(message, e);
    }
}
