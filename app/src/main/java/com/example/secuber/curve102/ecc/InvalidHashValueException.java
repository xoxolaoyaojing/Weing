package com.example.secuber.curve102.ecc;

public class InvalidHashValueException extends Exception {
  public InvalidHashValueException() {}
  public InvalidHashValueException(InvalidHashValueException e)
  {
    super(e);
  }
  public InvalidHashValueException(String strErr)
  {
    super(strErr);
  }
}
