/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asharma
 */

enum Day{
    Monday, Tuesday, Wednesday, Thursday, 
    Friday, Saturday, Sunday;
}


public class enumClass1 {
    Day day;
    
    public enumClass1(Day day){
        this.day = day;
    }
    
    public void isDay(){
        switch (day){
            case Monday:
                System.out.println("Day is Monday");
                break;
            case Tuesday:
                System.out.println("Day is Tuesday");
                break;
            case Wednesday:
                System.out.println("Day is Wednesday");
                break;
            case Thursday:
                System.out.println("Day is Thursday");
                break;
            case Friday:
                System.out.println("Day is Friday");
                break;
            default:
                System.out.println("It's a weekend");
                break;
        }
        
    }   
        public static void main(String args[]){
            String str = "Monday";
            enumClass1 e = new enumClass1(Day.valueOf(str));
            e.isDay();
        }
           
    }


