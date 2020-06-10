public class Vowel {
    public static void main(String[] args){
        char ch='A';
        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("Is a Vowel");
            break;
            default: System.out.println("Not a vowel");
        }
    }    
}