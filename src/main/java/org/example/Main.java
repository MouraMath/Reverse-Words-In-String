package org.example;

public class Main {

    public static class ReverseWordsInString {
        //Inverte a ordem das palavras em uma string

        public String reverseWords(String s) {
            // Remove espaços extras no início, fim e entre palavras
            // divide a string em um array de palavras
            String[] words = s.trim().split("\\s+");

            // Inverte a ordem das palavras
            int left = 0;
            int right = words.length - 1;
            while (left < right) {
                String temp = words[left];
                words[left] = words[right];
                words[right] = temp;
                left++;
                right--;
            }

            //Junta as palavras com um único espaço entre elas
            return String.join(" ", words);
        }

        public static void main(String[] args) {
            ReverseWordsInString solution = new ReverseWordsInString();

            // Teste 1
            String test1 = "the sky is blue";
            String result1 = solution.reverseWords(test1);
            System.out.println("Test 1:");
            System.out.println("Input: \"" + test1 + "\"");
            System.out.println("Output: \"" + result1 + "\"");
            System.out.println("Expected: \"blue is sky the\"");
            System.out.println("Passed: " + result1.equals("blue is sky the"));
            System.out.println();

            // Teste 2
            String test2 = "  hello world  ";
            String result2 = solution.reverseWords(test2);
            System.out.println("Test 2:");
            System.out.println("Input: \"" + test2 + "\"");
            System.out.println("Output: \"" + result2 + "\"");
            System.out.println("Expected: \"world hello\"");
            System.out.println("Passed: " + result2.equals("world hello"));
            System.out.println();

            // Teste 3
            String test3 = "a good   example";
            String result3 = solution.reverseWords(test3);
            System.out.println("Test 3:");
            System.out.println("Input: \"" + test3 + "\"");
            System.out.println("Output: \"" + result3 + "\"");
            System.out.println("Expected: \"example good a\"");
            System.out.println("Passed: " + result3.equals("example good a"));
        }
    }
}
