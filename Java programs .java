1.

public class ConstructorsExample {
    
    public ConstructorsExample() {
        System.out.println("No arguments constructor");
    }

  
    public ConstructorsExample(int defaultValue) {
        System.out.println("Default constructor with default value: " + defaultValue);
    }

  
    public ConstructorsExample(String param1, int param2) {
        System.out.println("Parameterized constructor with parameters: " + param1 + ", " + param2);
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        ConstructorsExample obj1 = new ConstructorsExample();
        ConstructorsExample obj2 = new ConstructorsExample(42);
        ConstructorsExample obj3 = new ConstructorsExample("Hello", 7);
    }
}


2.

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {22, 22, 77, 77, 88, 89, 89};

        int uniqueCount = removeDuplicates(nums);

        System.out.println("Output:");
        System.out.println("No. of unique elements = " + uniqueCount);
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int uniqueCount = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount++] = nums[i];
            }
        }

        return uniqueCount;
    }
}

3.

public class RearrangeArray {

    public static void main(String[] args) {
        int[] array = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        rearrangeArray(array);

        System.out.println("Output:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    private static void rearrangeArray(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            if (array[left] < 0 && array[right] < 0) {
                left++;
            } else if (array[left] > 0 && array[right] < 0) {
              
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            } else if (array[left] > 0 && array[right] > 0) {
                right--;
            } else {
                left++;
                right--;
            }
        }
    }
}
