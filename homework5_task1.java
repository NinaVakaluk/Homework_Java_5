/*Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. 
Нужны методы добавления новой записи в книгу и 
метод поиска записей в телефонной книге.*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class homework5_task1 {
    public static void main(String[] args)
    {
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
 addNumber("Иванов", 123456789, bookPhone);
 addNumber("Петров", 235847865, bookPhone);
 addNumber("Королев", 198734562, bookPhone);
 addNumber("Иванов", 987654321, bookPhone);
 addNumber("Петров", 123565322, bookPhone);
 addNumber("Иванов", 245788883, bookPhone);
 printBook(bookPhone);
 getByLastName("Иванов", bookPhone);
    }

    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map)
    {
        if (map.containsKey(key)) 
        {
        map.get(key).add(value);
        } 
        else 
        {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(value);
        map.put(key, number);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map)
    {
        for (var item : map.entrySet()) {
        String phones = "";
        for(int el: item.getValue()){
        phones = phones + el + ", ";
        }
        System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void getByLastName(String lastName, Map<String, ArrayList<Integer>> map)
    {
            if (map.containsKey(lastName)) 
            {
                System.out.printf("%s: %s \n", lastName, map.get(lastName));
            }
           
    }     

}


