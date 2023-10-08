package Task;

import java.util.*;
public class Task0 {
	
	        Scanner scanner = new Scanner(System.in);
	        int n1 = scanner.nextInt();
	        int[] arr1 = new int[n1] ;
	        for (int i1 = 0; i1 < n1; i++) {
	            arr1[i1] = scanner.nextInt();
	        }
	        int n2 = scanner.nextInt();
	        int[] arr2 = new int[n2];
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = scanner.nextInt();
	        }
	        int magicNumber = scanner.nextInt();
	        
	        // Step 1: Find unique numbers from each array
	        List<Integer> uniqueArr1 = findUniqueNumbers(arr1);
	        List<Integer> uniqueArr2 = findUniqueNumbers(arr2);
	        
	        // Step 2: Merge the arrays and remove repeated elements
	        List<Integer> mergedArray = mergeArrays(uniqueArr1, uniqueArr2);
	        if (mergedArray.size() == 0) {
	            System.out.println(-1);
	            return;
	        }
	        
	        // Step 3: Find subarrays with the sum equal to the magic number
	        List<List<Integer>> subarrays = findSubarraysWithSum(mergedArray, magicNumber);
	        if (subarrays.size() == 0) {
	            System.out.println(-2);
	            return;
	        }
	        
	        // Step 4: Calculate the LCM of the subarrays
	        int lcmResult = calculateLCM(subarrays);
	        System.out.println(lcmResult);
	    }
	    
	    private static List<Integer> findUniqueNumbers(int[] arr) {
	        List<Integer> uniqueNumbers = new ArrayList<>();
	        Set<Integer> numberSet = new HashSet<>();
	        for (int num : arr) {
	            if (!numberSet.contains(num)) {
	                uniqueNumbers.add(num);
	                numberSet.add(num);
	            }
	        }
	        return uniqueNumbers;
	    }
	    
	    private static List<Integer> mergeArrays(List<Integer> arr1, List<Integer> arr2) {
	        List<Integer> mergedArray = new ArrayList<>(arr1);
	        mergedArray.addAll(arr2);
	        return findUniqueNumbers(mergedArray.toArray(new Integer[0]));
	    }
	    
	    private static List<List<Integer>> findSubarraysWithSum(List<Integer> arr, int targetSum) {
	        List<List<Integer>> subarrays = new ArrayList<>();
	        int currentSum = 0;
	        int start = 0;
	        for (int end = 0; end < arr.size(); end++) {
	            currentSum += arr.get(end);
	            while (currentSum > targetSum) {
	                currentSum -= arr.get(start);
	                start++;
	            }
	            if (currentSum == targetSum) {
	                subarrays.add(arr.subList(start, end + 1));
	            }
	        }
	        return subarrays;
	    }
	    
	    private static int calculateLCM(List<List<Integer>> subarrays) {
	        int lcm = subarrays.get(0).get(0);
	        for (List<Integer> subarray : subarrays) {
	            int sum = 0;
	            for (int num : subarray) {
	                sum += num;
	            }
	            lcm = calculateLCM(lcm, sum);
	        }
	        return lcm;
	    }
	    
	    private static int calculateLCM(int a, int b) {
	        int gcd = calculateGCD(a, b);
	        return (a * b) / gcd;
	    }
	    
	    private static int calculateGCD(int a, int b) {
	        if (b == 0) {
	            return a;
	        }
	        return calculateGCD(b, a % b);
	    }
	}


}
