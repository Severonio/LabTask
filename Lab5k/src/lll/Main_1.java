package lll;

public class Main_1 {
    public static void main(String[] args) {
        String mString = ""; // строка с разными регистрами
        System.out.println(mString);
        char[] mainArray = new char[mString.length()];
        String mainString = "";

        for(int i = 0; i < mString.length(); i++){
            mainArray[i] = mString.charAt(i);
        }
        for (char word : mainArray) {
            if(Character.isLowerCase(word)){
                word = Character.toUpperCase(word);
            }
            else
                word = Character.toLowerCase(word);
            mainString += word;
        }

        System.out.println(mainString);

    }
}
