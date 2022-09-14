package com.madhavi;

public class TDDTester {

  private Solution solution;

  public void runTests() {
    this.solution = new Solution();
    numberDivisibleByThreeReturnsPrimeTest();
    numberEqualsThreeReturnsPrimeTest();
    negativeNumberDivisibleByThreeReturnsPrimeTest();
    negativeNumberDivisibleByFiveReturnsTherapeuticsTest();
    numberDivisibleByFiveReturnsTherapeuticsTest();
    numberEqualsFiveReturnsTherapeuticsTest();
    numberDivisibleBy15ReturnsPrimeTherapeuticsTest();
    numberEqualsTo15ReturnsPrimeTherapeuticsTest();
    numberEqualsToZeroReturnsEmptyStringTest();
    invalidNumberReturnsEmptyStringTest();
  }

  public void numberDivisibleByThreeReturnsPrimeTest() {
    if (solution.check(6).equals("Prime")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numberEqualsThreeReturnsPrimeTest() {
    if (solution.check(3).equals("Prime")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void negativeNumberDivisibleByThreeReturnsPrimeTest() {
    if (solution.check(-6).equals("Prime")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void negativeNumberDivisibleByFiveReturnsTherapeuticsTest() {
    if (solution.check(-25).equals("Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numberDivisibleByFiveReturnsTherapeuticsTest() {
    if (solution.check(25).equals("Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numberEqualsFiveReturnsTherapeuticsTest() {
    if (solution.check(5).equals("Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numberDivisibleBy15ReturnsPrimeTherapeuticsTest() {
    if (solution.check(90).equals("Prime Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numberEqualsTo15ReturnsPrimeTherapeuticsTest() {
    if (solution.check(15).equals("Prime Therapeutics")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void numberEqualsToZeroReturnsEmptyStringTest() {
    if (solution.check(0).equals("")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

  public void invalidNumberReturnsEmptyStringTest() {
    if (solution.check(4).equals("")) {
      System.out.println("Test Passed");
    } else {
      System.out.println("Test Failure");
    }
  }

}
