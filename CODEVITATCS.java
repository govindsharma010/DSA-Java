
import java.util.*;

public class CODEVITATCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read initial balance
        int balance = sc.nextInt();
        
        // Read number of operations
        int numOP = sc.nextInt();
        
        // Consume the leftover newline character after reading the integer
        sc.nextLine(); 

        // List to keep track of transactions (credit/debit) before they are committed.
        // We store them as an array: [type, amount]. type 1 for credit, -1 for debit.
        List<int[]> pendingTransactions = new ArrayList<>();
        
        // List to store the balance at the time of each commit.
        List<Integer> committedBalances = new ArrayList<>();

        for (int i = 0; i < numOP; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String operation = parts[0];

            switch (operation) {
                case "credit":
                    if (parts.length > 1) {
                        int amount = Integer.parseInt(parts[1]);
                        balance += amount;
                        // Add this transaction to the pending list
                        pendingTransactions.add(new int[]{1, amount}); // 1 for credit
                    }
                    break;
                case "debit":
                    if (parts.length > 1) {
                        int amount = Integer.parseInt(parts[1]);
                        balance -= amount;
                        // Add this transaction to the pending list
                        pendingTransactions.add(new int[]{-1, amount}); // -1 for debit
                    }
                    break;
                case "read":
                    System.out.println(balance);
                    break;
                case "abort":
                    if (parts.length > 1) {
                        int transactionIndex = Integer.parseInt(parts[1]) - 1; // Convert 1-based to 0-based index
                        
                        // Check if the transaction to be aborted is in the pending list
                        if (transactionIndex >= 0 && transactionIndex < pendingTransactions.size()) {
                            int[] transactionToAbort = pendingTransactions.get(transactionIndex);
                            int type = transactionToAbort[0];
                            int amount = transactionToAbort[1];

                            // Reverse the transaction: subtract if it was a credit, add if it was a debit
                            balance -= (type * amount);
                            
                            // Remove the transaction from the pending list
                            pendingTransactions.remove(transactionIndex);
                        }
                        // If it's not in the pending list, it means it was already committed, so we do nothing.
                    }
                    break;
                case "commit":
                    // Save the current balance to our commit history
                    committedBalances.add(balance);
                    // All pending transactions are now permanent, so clear the list
                    pendingTransactions.clear();
                    break;
                case "rollback":
                     if (parts.length > 1) {
                        int commitIndex = Integer.parseInt(parts[1]) - 1; // Convert 1-based to 0-based index
                        
                        // Check if the commit we want to roll back to exists
                        if (commitIndex >= 0 && commitIndex < committedBalances.size()) {
                            // Revert the balance to the state it was in after that specific commit
                            balance = committedBalances.get(commitIndex);
                            // Any transactions after the last commit are now invalid, so clear them.
                            pendingTransactions.clear();
                        }
                    }
                    break;
                default:
                    // Handle any unexpected operations if necessary
                    break;
            }
        }
        
        sc.close();
    }
}

