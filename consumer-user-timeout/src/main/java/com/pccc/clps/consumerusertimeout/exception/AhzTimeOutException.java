package com.pccc.clps.consumerusertimeout.exception;

import java.util.concurrent.TimeoutException;


//@Data
public class AhzTimeOutException extends RuntimeException {

  private Integer code;
  private String msg;
}
