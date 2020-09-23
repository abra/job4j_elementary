package ru.job4j.condition;

public class Club {
   public static void permission(boolean hasMoney, boolean isFriend) {
       if (hasMoney || isFriend) {
           System.out.println("Ofcourse you can enter the club.");
       } else {
           System.out.println("No, you can't. No money. Who the hell are you? No no");
       }
   }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
