package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String key = null;
       while ((key= reader.readLine())!=null){
           Movie movie=MovieFactory.getMovie(key);
           if (movie == null){
               break;
           }
           System.out.println(movie.getClass().getSimpleName());
       }





    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;


            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            if ("thriller".equals(key)){
                movie= new Thriller();
            }
            //напишите тут ваш код, пункты 5,6

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    public static class Cartoon extends Movie{}
    public static class Thriller extends Movie{}//Напишите тут ваши классы, пункт 3
}
