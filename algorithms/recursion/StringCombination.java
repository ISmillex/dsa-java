public class StringCombination {

    public void combinations(String str) {
        char[] elements = str.toCharArray();
        char[] combination = new char[elements.length];
        for (int r = 1; r <= elements.length; r++) {
            combinations(elements, combination, 0, r, 0);
        }
    }

    public void combinations(char[] elements, char[] combination, int startIndex, int r, int currentSize) {
        if (currentSize == r) {
            System.out.println(combination);
            return;
        }
        for (int i = startIndex; i < elements.length; i++) {
            combination[currentSize] = elements[i];
            combinations(elements, combination, i + 1, r, currentSize + 1);
        }
    }

    public static void main(String[] args) {
        StringCombination s = new StringCombination();
        s.combinations("abc");
    }
}
