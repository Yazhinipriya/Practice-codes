1)
class BankAccount {
    private int accountId;
    private String accountName;
    private double balance;


    public BankAccount(int accountId, String accountName, double initialBalance) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void transferTo(BankAccount recipient, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            recipient.balance += amount;
            printReceipt();
        } else {
            System.out.println("Invalid transaction. Insufficient funds.");
        }
    }


    public void printReceipt() {
        System.out.println("Account id: " + accountId + ",\nName: " + accountName + ",\nAccount Balance: Rs." + balance + "\n");
    }
}

class HelloWorld {
    public static void main(String[] args) {
        
        BankAccount accountA = new BankAccount(12344, "Account A", 5000);
        BankAccount accountB = new BankAccount(56789, "Account B", 2500);

        
        accountA.transferTo(accountB, 1500);

        accountB.transferTo(accountA, 3000);
    }
}


2)
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayPartitionAndMerge {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int partitionSize = 2;
        int[] partitionOrder = {3, 2, 1};

        List<List<Integer>> partitions = partitionArray(array, partitionSize);
        List<Integer> result = mergePartitions(partitions, partitionOrder);

        System.out.println("Output:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static List<List<Integer>> partitionArray(int[] array, int partitionSize) {
        List<List<Integer>> partitions = new ArrayList<>();
        for (int i = 0; i < array.length; i += partitionSize) {
            List<Integer> partition = new ArrayList<>();
            for (int j = i; j < i + partitionSize && j < array.length; j++) {
                partition.add(array[j]);
            }
            partitions.add(partition);
        }
        return partitions;
    }

    private static List<Integer> mergePartitions(List<List<Integer>> partitions, int[] partitionOrder) {
        List<Integer> result = new ArrayList<>();
        for (int order : partitionOrder) {
            for (List<Integer> partition : partitions) {
                if (partition.size() == order) {
                    result.addAll(partition);
                    break;
                }
            }
        }
        return result;
    }
}
