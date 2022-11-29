import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }


    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum()/nums.length;
    }

    public static String isSortedAndHow(int[] array) {

            boolean isAscending= false;
            isAscending =  array[0]<array[1];

            String str="";
            if (isAscending==true) {

                for (int i = 0; i < array.length; i++) {
                    for (int j = i+1; j < array.length; j++) {
                        if(array[i]< array[j]) {
                            str= "yes, ascending";
                        } else {
                            str= "no";
                        }
                    }
                }
            } else if(isAscending==false) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = i+1; j < array.length; j++) {
                        if(array[i]> array[j]) {
                            str= "yes, descending";
                        } else {
                            str= "no";
                        }
                    }
                }
            }
            return str;
        }

    public static int stringToNumber(String str) {
        return Integer.valueOf(str);
    }

    public static String[] capitalize(String s){
        // Gorillaz - Do Ya Thing (2010)
        String word="";
        for(int i=0; i <s.length(); i++) {
            if(i%2==0) {
                word+= Character.toString(s.charAt(i)).toUpperCase();
            } else {
                word+= Character.toString(s.charAt(i)).toLowerCase();
            }
        }

        String word1 = "";
        for(int i=0; i<word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))) {
                word1+= Character.toString(word.charAt(i)).toLowerCase();
            } else {
                word1+= Character.toString(word.charAt(i)).toUpperCase();
            }
        }

        System.out.println(word);
        System.out.println(word1);

        return new String[]{word,word1};
    }


}
