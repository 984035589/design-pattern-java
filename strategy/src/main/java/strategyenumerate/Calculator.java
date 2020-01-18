package strategyenumerate;

/**
 * The enum Calculator.
 */
public enum Calculator {

    /**
     * The Add.
     */
    ADD("+") {
        public int exec(int a, int b) {
            return a + b;
        }
    },
    /**
     * The Sub.
     */
    SUB("-") {
        public int exec(int a, int b) {
            return a - b;
        }
    };

    /**
     * The Value.
     */
    String value = "";

    Calculator(String value) {
        this.value = value;
    }

    /**
     * Get value string.
     *
     * @return the string
     */
    public String getValue() {
        return this.value;
    }

    /**
     * Exec int.
     *
     * @param a the a
     * @param b the b
     * @return the int
     */
    public abstract int exec(int a, int b);


}
