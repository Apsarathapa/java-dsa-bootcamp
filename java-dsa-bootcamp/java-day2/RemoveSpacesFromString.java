public class RemoveSpacesFromString {
    public static void main(String[] args){
        String sentence = "String is palindrome";
        String finalString = removeSpaces(sentence);
        System.out.println("The final string after removing spaces is " + finalString);

    }
    public static String removeSpaces(String str){
        char[] charArr = str.toCharArray();
        char[] result = new char[str.length()];
        int index = 0; //for the result arr
        for(int i=0; i<charArr.length; i++){
            if(charArr[i] != ' '){ //if charArr has no space
                result[index] = charArr[i]; //add it to the result array
                index++;
            }
        }
        return new String(result, 0, index); //create string from result arr only upto index
    }  
}
