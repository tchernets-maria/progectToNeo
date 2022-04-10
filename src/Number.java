public class Number {

    private int value;

    public Number(String data, int base) {
        value = convertCharToInt(data.charAt(data.length() - 1));
        int step = base;
        for (int i = data.length() - 2; i >= 0; i--) {
            value += convertCharToInt(data.charAt(i)) * step;
            step *= base;
        }
    }

    public String get(int base) {
        StringBuilder stringBuilder = new StringBuilder();
        int tekValue = value;
        while(tekValue != 0) {
            stringBuilder.append(convertIntToChar(tekValue % base));
            tekValue /= base;
        }
        return stringBuilder.reverse().toString();
    }

    private char convertIntToChar(int digit) {
        if (digit < 10) {
            return String.valueOf(digit).charAt(0);
        } else {
            return (char) ('A' + (digit - 10));
        }
    }

    private int convertCharToInt(char digit) {
        if (digit >= '0' && digit <= '9') {
            return digit - '0';
        } else {
            return digit - 'A' + 10;
        }
    }

}
