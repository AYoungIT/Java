// Ashley Young
// 11/3/22
// This program creates a dog class that extends from the pet class

package com.Java;

public class Dog extends Pet{
    // 3 class attributes for dog class
    private int dogSpaceNumber;
    private int dogWeight;
    private boolean grooming;
    
    public Dog() {
          dogSpaceNumber = -1;
          dogWeight = -1;
          grooming = "No";
}
    // getting dog spaces
    public int getDogSpaceNumber() {
          return dogSpaceNumber;
    }
    // setting dog spaces
    public void setDogSpaceNumber(int dogSpaceNumber) {
          this.dogSpaceNumber = dogSpaceNumber;
    }
    // getting dog weight
    public int getDogWeight() {
          return dogWeight;
    }
    // setting dog weight
    public void setDogWeight(int dogWeight) {
          this.dogWeight = dogWeight;
    }
    // getting grooming
    public String getGrooming() {
          return grooming;
    }
    // setting grooming
    public void setGrooming(String grooming) {
          this.grooming = grooming;
    }
    // stand in getGrooming
    public void getGrooming(){
}
    // stand in setGrooming
    public void setGrooming(){
}
    // stand in getDogWeight
     public void getDogWeight(){
}
    // stand in setDogWeight
     public void setDogWeight(){
} }