public class StringUtils {
    public static boolean included(String word, String search) {
        return (word.trim().toUpperCase().contains(search.trim().toUpperCase()));
    }
}
