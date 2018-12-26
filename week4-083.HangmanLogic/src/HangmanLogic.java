
public class HangmanLogic {

    private String word; //sana
    private String guessedLetters; // arvatut
    private int numberOfFaults; // virheita

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // if the letter has already been guessed, nothing happens
        if(!this.guessedLetters.contains(letter)) {
            // the letter is added among the already guessed letters
            this.guessedLetters += letter;
            // if the word does not contains the guessed letter
            if(!this.word.contains(letter)) {
                // number of faults increase
                this.numberOfFaults++;
            }
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        // word length
        int wordLength = this.word.length();
        int i = 0;

        // while loop over all the characters
        while(i < wordLength) {
            // if character is in the guessedletters array, show it
            if(guessedLetters.contains("" + this.word.charAt(i))) hiddenWord += this.word.charAt(i);
                // else show _
            else hiddenWord += "_";
            i++;
        }



        // return the hidden word
        return hiddenWord;
    }
}
