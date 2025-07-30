public class CountVowelsInString {
    public static void main(String[] args){
        String toy = "Teddybear";
        int vowelCount = countVowels(toy);
        System.out.println("The total vowels in the string is "+ vowelCount);
    }

    public static int countVowels(String str){
        int count =  0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }else{
                System.out.println(" " + ch + " is not a vowel");
            }
        }
        return count;
    }
    
}
