package com.example.reflection;

public class SubController extends Controller{

  public SubController(){}
  private SubController(String value){}

  public String getHelloPublic() {
    return "--------------------------------------------- Hello From Method Public ---------------------------------------------";
  }

  private String getHelloPrivate() {
    return "--------------------------------------------- Hello From Method Private ---------------------------------------------";
  }

  public void getVoid(){
    System.out.println("This method return void.....");
  }

  public Integer plus(Integer a1, Integer a2){
    return a1+a2;
  }
}
