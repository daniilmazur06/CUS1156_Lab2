
/* Project: Lab 2
* Class: UniqueWords.java
* Author: Daniil Mazur
* Date: February 21
* This program counts how many unique words there are in the string list
*/

import java.util.*;

public class UniqueWords
{

	
	public static int countUnique(ArrayList<String> list) {
        Set<String> uniqueSet = new HashSet<>(list);
        return uniqueSet.size();
    }

	
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("orange");
        words.add("blackboard");
        words.add("apple");
        words.add("orange");
        words.add("sun");
        words.add("moon");

        int unique = countUnique(words);
        System.out.println(words + " has " + unique + " unique words");
    }
}
