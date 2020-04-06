//Jasnoor

import java.util.Scanner;

function getRandomInt(max) {
    return Math.floor(Math.random() *Math.floor(max));
    }

public class Lantern {
  public static void main(String[] args) {
    
    floorNumber = Console.log(getRandomInt(4));
    //the output will be : 0,1,2,3 which are the number of floors we have assumed in our elevator.
    
    System.out.println("The Current floor number" + floorNumber);
    //here the lantern will print the current floor and is the next step will be to ask the user about the inout after which the lantern will print msgs accordingly
    
    System.out.println("Please enter the valid floor number");
    int c_floor = keyboard.readInt();
    
  public void goTo(int c_Floor){
    if ( c_Floor == floorNumber) {
      System.out.println(" You are on the floor of your choice!");}
    else if ( c_Floor > floorNumber){
      elevatorsignalUp();}
    else if ( c_Floor < floorNumber){
      elevatorsignalDown();}
      
    }
  private void elevatorsignalUp(){
    System.out.println(" ↑ ");//the elevator will show an upward arrow while going up
    
    while (floorNumber < c_Floor){
      c_Floor++;
      System.out.println("You have reached" +c_Floor);}  //for the floor that are continously increasing   
    System.out.println(c_Floor); //for the floor that has been finally reached as per users choice
   
 }
  private void elevatorsignalDown(){
    System.out.println(" ↓ ");
    
    while ( floorNumber > c_Floor){
      c_Floor --;
      System.out.println(c_Floor);}
   
   
    
}
