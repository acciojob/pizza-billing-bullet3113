package com.driver;

public class Pizza {

  private int price;
  private Boolean isVeg;
  private String bill = "";
  private boolean extraTopp;
  private boolean extraCheese;
  boolean isTakeaway;
  boolean isDeluxe;
  private int bPrice;

  public Pizza(Boolean isVeg) {
    this.isVeg = isVeg;
    // your code goes here

    // setting base price
    this.price = this.isVeg ? 300 : 400;
    this.bPrice = this.isVeg ? 300 : 400;
  }

  public Pizza(Boolean isVeg, Boolean isDeluxe) {
    this.isVeg = isVeg;
    this.isDeluxe = true;
    // your code goes here

    // setting base price
    this.price = this.isVeg ? 300 : 400;
    this.price += 80;
    this.price += this.isVeg ? 70 : 120;
    this.bPrice = this.price;
  }

  public int getPrice() {
    return this.price;
  }

  public void addExtraCheese() {
    // your code goes here
    if (!this.isDeluxe && !this.extraCheese) {
      this.extraCheese = true;
      this.price += 80;
    }
  }

  public void addExtraToppings() {
    // your code goes here
    if (!this.isDeluxe && !this.extraTopp) {
      this.extraTopp = true;
      this.price += this.isVeg ? 70 : 120;
    }
  }

  public void addTakeaway() {
    // your code goes here
    if (!this.isTakeaway) {
      this.isTakeaway = true;
      this.price += 20;
    }
  }

  public String getBill() {
    // your code goes here
    this.bill = "Base Price Of The Pizza: " + String.valueOf(this.bPrice);
    if (this.extraCheese) this.bill +=
      "\nExtra Cheese Added: " + String.valueOf(80);
    if (this.extraTopp) this.bill +=
      "\nExtra Toppings Added: " + String.valueOf(this.isVeg ? 70 : 120);
    if (this.isTakeaway) {
      this.bill += "\nPaperbag Added: 20";
    }

    this.bill += "\nTotal Price: " + String.valueOf(this.price);
    return this.bill;
  }
}
