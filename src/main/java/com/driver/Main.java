package com.driver;

public class Main {
  public static void main(String[] args) {
        RWOnly rw=new RWOnly();
        rw.writeOnly("Satish");
        System.out.print(rw.readOnly());
    }
}
