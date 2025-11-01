import java.util.*;
public class TcsProblem5 {
// public class Main {
    static Map<String, String> digitMap = new HashMap<>();
    static Map<String, String> opMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] digits = new String[3];
        for (int i = 0; i < 3; i++) digits[i] = sc.nextLine();

        String[] operators = new String[3];
        for (int i = 0; i < 3; i++) operators[i] = sc.nextLine();

        String[] expr = new String[3];
        for (int i = 0; i < 3; i++) expr[i] = sc.nextLine();

        // Build maps for digits 0-9
        buildDigitMap(digits);
        buildOperatorMap(operators);

        // Parse expression into tokens
        List<String> tokens = parseExpression(expr);

        // Evaluate and print result
        int result = evaluate(tokens);
        System.out.println(result);
    }

    // Converts the 3x3 LED patterns of digits 0-9 into binary patterns
    static void buildDigitMap(String[] lines) {
        for (int d = 0; d < 10; d++) {
            String pattern = extractPattern(lines, d);
            digitMap.put(pattern, String.valueOf(d));
        }
    }

    // Converts operators/brackets 3x3 patterns into symbols
    static void buildOperatorMap(String[] lines) {
        String[] symbols = {"||", "&&", "!", "(", ")"};
        for (int i = 0; i < 5; i++) {
            String pattern = extractPattern(lines, i);
            opMap.put(pattern, symbols[i]);
        }
    }

    // Extracts the 3x3 block pattern for given position
    static String extractPattern(String[] lines, int index) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int start = index * 3;
            sb.append(lines[i], start, start + 3);
        }
        return sb.toString();
    }

    // Parses the final expression lines into a list of tokens
    static List<String> parseExpression(String[] expr) {
        List<String> tokens = new ArrayList<>();
        int n = expr[0].length();
        for (int pos = 0; pos < n; pos += 3) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++)
                sb.append(expr[i], pos, pos + 3);
            String block = sb.toString();

            if (digitMap.containsKey(block)) tokens.add(digitMap.get(block));
            else if (opMap.containsKey(block)) tokens.add(opMap.get(block));
        }
        return tokens;
    }

    // Evaluates the tokenized expression with bitwise operations
    static int evaluate(List<String> tokens) {
        Stack<Integer> values = new Stack<>();
        Stack<String> ops = new Stack<>();

        for (String token : tokens) {
            if (token.matches("\\d+")) {
                values.push(Integer.parseInt(token));
            } else if (token.equals("(")) {
                ops.push(token);
            } else if (token.equals(")")) {
                while (!ops.peek().equals("("))
                    values.push(applyOp(ops.pop(), values));
                ops.pop();
            } else if (token.equals("!") || token.equals("||") || token.equals("&&")) {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(token))
                    values.push(applyOp(ops.pop(), values));
                ops.push(token);
            }
        }

        while (!ops.isEmpty())
            values.push(applyOp(ops.pop(), values));

        return values.pop();
    }

    // Defines operator precedence
    static int precedence(String op) {
        if (op.equals("!")) return 3;
        if (op.equals("||")) return 2;
        if (op.equals("&&")) return 1;
        return 0;
    }

    // Applies bitwise operation
    static int applyOp(String op, Stack<Integer> values) {
        if (op.equals("!")) {
            int a = values.pop();
            return ~a;
        }
        int b = values.pop();
        int a = values.pop();

        if (op.equals("||")) return a | b;
        if (op.equals("&&")) return a & b;
        return 0;
    }
}


