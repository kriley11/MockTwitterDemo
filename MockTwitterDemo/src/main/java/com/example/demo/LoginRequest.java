package com.example.demo;

import java.util.Objects;

public class LoginRequest {

  private String userName;
  private String password;
  
  public String getUserName() {
    return userName;
  }
  
  public void setUserName(String userName) {
    this.userName = userName;
  }
  
  public String getPassword() {
    return password;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, userName);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof LoginRequest)) {
      return false;
    }
    LoginRequest other = (LoginRequest)obj;
    return Objects.equals(password, other.password) && Objects.equals(userName, other.userName);
  }

  @Override
  public String toString() {
    return "LoginRequest [userName=" + userName + ", password=" + password + "]";
  }
}