package com.driver;

public class Pizza {

  private int price;
  private Boolean isVeg;
  private String bill = "";
  private int extraTopp = 0;
  private int extraCheese = 0;
  boolean isTakeaway;
  boolean isDeluxe;

  public Pizza(Boolean isVeg) {
    this.isVeg = isVeg;
    // your code goes here

    // setting base price
    this.price = this.isVeg ? 300 : 400;
  }

  public Pizza(Boolean isVeg, Boolean isDeluxe) {
    this.isVeg = isVeg;
    this.isDeluxe = true;
    // your code goes here

    // setting base price
    this.price = this.isVeg ? 300 : 400;
    this.price += 80;
    this.price += this.isVeg ? 70 : 120;
  }

  public int getPrice() {
    return this.price;
  }

  public void addExtraCheese() {
    // your code goes here
    if (!this.isDeluxe) this.extraCheese = 80;
  }

  public void addExtraToppings() {
    // your code goes here
    if (!this.isDeluxe) this.extraTopp = this.isVeg ? 70 : 120;
  }

  public void addTakeaway() {
    // your code goes here
    this.isTakeaway = true;
  }

  public String getBill() {
    // your code goes here
    this.bill = "Base Price Of The Pizza: " + String.valueOf(this.price);
    if (this.extraCheese != 0) this.bill +=
      "\nExtra Cheese Added: " + String.valueOf(this.extraCheese);
    if (this.extraTopp != 0) this.bill +=
      "\nExtra Toppings Added: " + String.valueOf(this.extraTopp);
    if (this.isTakeaway) {
      this.bill += "\nPaperbag Added: 20";
      this.price += 20;
    }

    this.bill +=
      "\nTotal Price: " +
      String.valueOf(this.price + this.extraCheese + this.extraTopp);
    return this.bill;
  }
}
