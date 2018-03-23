package com.example.datatype.numbers;

public class Application {

  public static void main(String[] args) {
//        width of int = 32 (4 bytes)
    int myInt = 5 / 3;
//        width of float = 32 (4 bytes)
    float myFloat = 5f / 3f;
//        width of double = 64 (8 bytes)
    double myDouble = 5d / 3d;

    System.out.println("MyInt : " + myInt);
    System.out.println("MyFloat : " + myFloat);
    System.out.println("MyDouble : " + myDouble);

    double poundToConver = 205d;
    System.out.println("Convert pound: " + poundToConver + " to kilograma: " + convertPoundsToKilograma(poundToConver));

    double kilograma = 93d;
    System.out.println("Convert kilograma: " + kilograma + " to pound: " + convertKilogramaToPound(kilograma));

    byteExample();
    shortExample();
    intExample();
    longExample();


  }

  /**
   * Convert a given number of pounds to kilogramas
   * 1. Create a variable to store the number of pounds
   * 2. Calculate the number of Kilogramas for the number above and store in a variable
   * 3. Print out the result
   * NOTES: 1 pound is equal to 0.45359237 kilogramas.
   */
  private static double convertPoundsToKilograma(double pound) {
    double poundValueKilograma = 0.45359237;
    return pound * poundValueKilograma;
  }

  /**
   * Convert a given number of kilograms to pounds
   * 1. Create a variable to store the number of pounds
   * 2. Calculate the number of Kilogramas for the number above and store in a variable
   * 3. Print out the result
   * NOTES: 1 pound is equal to 0.45359237 kilogramas.
   */
  private static double convertKilogramaToPound(double pound) {
    double poundValueKilograma = 0.45359237;
    return pound / poundValueKilograma;
  }

  /**
   * Short has with of 16
   */
  private static void shortExample() {
    short minValueShort = -32768;
    short maxValueShort = 32767;
    short myNewValue = (short) (minValueShort / 2);
  }

  /**
   * Byte has with of 8
   */
  private static void byteExample() {
    byte minValueByte = -128;
    byte maxValueByte = 127;
    byte myNewValue = (byte) (minValueByte / 2);
  }

  /**
   * Int has with of 32
   */
  private static void intExample() {
    /**
     * expression
     */
    int expression = (10 * 2);

    /**
     * Literal number
     */
    int minValueIntWithUnderscore = -2_147_483_648;
    int minValueInt = -2147483648; //literal
    int maxValueInt = 2147483647;
    int myNewValue = (minValueInt / 2);
  }

  /**
   * Int has with of 64
   */
  private static void longExample() {
    long maxValueLong = 9_223_372_036_854_775_807L;
    long minValueLong = -9_223_372_036_854_775_808L;
    Long myNewValue = (minValueLong / 2);
  }

}
