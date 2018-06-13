package com.experimental.coding.bat.exercises;

public class ArrayExercises {

	public static void main(String[] args) {
		new ArrayExercises();
	}

	public ArrayExercises() {
		
	}

	/*
	 * Given an array of ints, return true if 6 appears as either the first or
	 * last element in the array. The array will be length 1 or more.
	 */
	public boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

	/*
	 * Given an array of ints, return true if the array is length 1 or more, and
	 * the first element and the last element are equal.
	 */
	public boolean sameFirstLast(int[] nums) {
		return nums.length >= 1 && nums[0] == nums[nums.length - 1];
	}

	/*
	 * Return an int array length 3 containing the first 3 digits of pi, {3, 1,
	 * 4}.
	 */
	public int[] makePi() {
		return new int[] {3, 1, 4};
	}

	/*
	 * Given 2 arrays of ints, a and b, return true if they have the same first
	 * element or they have the same last element. Both arrays will be length 1
	 * or more.
	 */
	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0]) || (b[b.length - 1] == a[a.length - 1]);
	}

	/*
	 * Given an array of ints length 3, return the sum of all the elements.
	 */
	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	/*
	 * Given an array of ints length 3, return an array with the elements
	 * "rotated left" so {1, 2, 3} yields {2, 3, 1}.
	 */
	public int[] rotateLeft3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		return nums;
	}

	/*
	 * Given an array of ints length 3, return a new array with the elements in
	 * reverse order, so {1, 2, 3} becomes {3, 2, 1}.
	 */
	public int[] reverse3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		return nums;
	}

	/*
	 * Given an array of ints length 3, figure out which is larger, the first or
	 * last element in the array, and set all the other elements to be that
	 * value. Return the changed array.
	 */
	public int[] maxEnd3(int[] nums) {
		int larger = nums[0] > nums[2] ? nums[0] : nums[2];
		nums[0] = larger;
		nums[1] = larger;
		nums[2] = larger;
		return nums;
	}

	/*
	 * Given an array of ints, return the sum of the first 2 elements in the
	 * array. If the array length is less than 2, just sum up the elements that
	 * exist, returning 0 if the array is length 0.
	 */
	public int sum2(int[] nums) {
		if(nums.length < 1) return 0;
		if(nums.length == 1) return nums[0];
		return nums[0] + nums[1];
	}

	/*
	 * Given 2 int arrays, a and b, each length 3, return a new array length 2
	 * containing their middle elements.
	 */
	public int[] middleWay(int[] a, int[] b) {
		return new int[] { a[1], b[1] };
	}

	/*
	 * Given an array of ints, return a new array length 2 containing the first
	 * and last elements from the original array. The original array will be
	 * length 1 or more.
	 */
	public int[] makeEnds(int[] nums) {
		return new int[] { nums[0], nums[nums.length - 1] };
	}

	/*
	 * Given an int array length 2, return true if it contains a 2 or a 3.
	 */
	public boolean has23(int[] nums) {
		return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
	}

	/*
	 * Given an int array length 2, return true if it does not contain a 2 or 3.
	 */
	public boolean no23(int[] nums) {
		return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
	}

	/*
	 * Given an int array, return a new array with double the length where its
	 * last element is the same as the original array, and all the other
	 * elements are 0. The original array will be length 1 or more. Note: by
	 * default, a new int array contains all 0's.
	 */
	public int[] makeLast(int[] nums) {
		int[] arr = new int[nums.length * 2];
		arr[arr.length - 1] = nums[nums.length - 1];
		return arr;
	}

	/*
	 * Given an int array, return true if the array contains 2 twice, or 3
	 * twice. The array will be length 0, 1, or 2.
	 */
	public boolean double23(int[] nums) {
		return nums.length < 2 ? false : (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
	}

	/*
	 * Given an int array length 3, if there is a 2 in the array immediately
	 * followed by a 3, set the 3 element to 0. Return the changed array.
	 */
	public int[] fix23(int[] nums) {
		if(nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
		} else if(nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}
		return nums;
	}

	/*
	 * Start with 2 int arrays, a and b, of any length. Return how many of the
	 * arrays have 1 as their first element.
	 */
	public int start1(int[] a, int[] b) { // this code is poopy doopy
		if(a.length == 0 && b.length == 0) return 0;
		if(a.length == 0) return b[0] == 1 ? 1 : 0;
		if(b.length == 0) return a[0] == 1 ? 1 : 0;
		if(a[0] == 1 && b[0] == 1) return 2;
		if(a[0] == 1 || b[0] == 1) return 1;
		return 0;
	}

	/*
	 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the
	 * values in each array. Return the array which has the largest sum. In
	 * event of a tie, return a.
	 */
	public int[] biggerTwo(int[] a, int[] b) {
		int aSum = a[0] + a[1];
		int bSum = b[0] + b[1];
		return aSum >= bSum ? a : b;
	}

	/*
	 * Given an array of ints of even length, return a new array length 2
	 * containing the middle two elements from the original array. The original
	 * array will be length 2 or more.
	 */
	public int[] makeMiddle(int[] nums) {
		int[] arr = new int[2];
		arr[0] = nums[(nums.length / 2) - 1];
		arr[1] = nums[(nums.length / 2)];
		return arr;
	}

	/*
	 * Given 2 int arrays, each length 2, return a new array length 4 containing
	 * all their elements.
	 */
	public int[] plusTwo(int[] a, int[] b) {
		return new int[] { a[0], a[1], b[0], b[1] };
	}

	/*
	 * Given an array of ints, swap the first and last elements in the array.
	 * Return the modified array. The array length will be at least 1.
	 */
	public int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}

	/*
	 * Given an array of ints of odd length, return a new array length 3
	 * containing the elements from the middle of the array. The array length
	 * will be at least 3.
	 */
	public int[] midThree(int[] nums) {
		int middle = nums.length / 2;
		return new int[] { nums[middle - 1], nums[middle], nums[middle + 1] };
	}

	/*
	 * Given an array of ints of odd length, look at the first, last, and middle
	 * values in the array and return the largest. The array length will be a
	 * least 1.
	 */
	public int maxTriple(int[] nums) {
		int middle = nums.length / 2;
		return Math.max(nums[0], Math.max(nums[middle], nums[nums.length - 1]));
	}

	/*
	 * Given an int array of any length, return a new array of its first 2
	 * elements. If the array is smaller than length 2, use whatever elements
	 * are present.
	 */
	public int[] frontPiece(int[] nums) {
		if(nums.length < 2) return nums;
		return new int[] { nums[0], nums[1] };
	}

	/*
	 * We'll say that a 1 immediately followed by a 3 in an array is an
	 * "unlucky" 1. Return true if the given array contains an unlucky 1 in the
	 * first 2 or last 2 positions in the array.
	 */
	public boolean unlucky1(int[] nums) {
		if(nums.length < 2) return false;
		return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
	}

	/*
	 * Given 2 int arrays, a and b, return a new array length 2 containing, as
	 * much as will fit, the elements from a followed by the elements from b.
	 * The arrays may be any length, including 0, but there will be 2 or more
	 * elements available between the 2 arrays.
	 */
	public int[] make2(int[] a, int[] b) {
		if(a.length >= 2) return new int[] { a[0], a[1] };
		if(a.length == 1) return new int[] { a[0], b[0] };
		return new int[] { b[0], b[1] };
	}

	/*
	 * Given 2 int arrays, a and b, of any length, return a new array with the
	 * first element of each array. If either array is length 0, ignore that
	 * array.
	 */
	public int[] front11(int[] a, int[] b) {
		boolean aIsEmpty = a.length == 0;
		boolean bIsEmpty = b.length == 0;
		if(aIsEmpty && bIsEmpty) return new int[] {};
		if(aIsEmpty) return new int[] { b[0] };
		if(bIsEmpty) return new int[] { a[0] };
		return new int[] { a[0], b[0] };
	} // END OF Array-1

	/*
	 * Return the number of even ints in the given array. Note: the % "mod"
	 * operator computes the remainder, e.g. 5 % 2 is 1.
	 */
	public int countEvens(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) count++;
		}
		return count;
	}

	/*
	 * Given an array length 1 or more of ints, return the difference between
	 * the largest and smallest values in the array. Note: the built-in
	 * Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or
	 * larger of two values.
	 */
	public int bigDiff(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) max = nums[i];
			if(nums[i] < min) min = nums[i];
		}
		return max - min;
	}

	/*
	 * Return the "centered" average of an array of ints, which we'll say is the
	 * mean average of the values, except ignoring the largest and smallest
	 * values in the array. If there are multiple copies of the smallest value,
	 * ignore just one copy, and likewise for the largest value. Use int
	 * division to produce the final average. You may assume that the array is
	 * length 3 or more.
	 */
	public int centeredAverage(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) max = nums[i];
			if(nums[i] < min) min = nums[i];
			sum += nums[i];
		}
		sum -= (max + min);
		return sum / (nums.length - 2);
	}

	/*
	 * Return the sum of the numbers in the array, returning 0 for an empty
	 * array. Except the number 13 is very unlucky, so it does not count and
	 * numbers that come immediately after a 13 also do not count.
	 */
	public int sum13(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 13) {
				nums[i] = 0;
				if(i < nums.length - 1) nums[i + 1] = 0;
			}
			sum += nums[i];
		}
		return sum;
	}

	/*
	 * Return the sum of the numbers in the array, except ignore sections of
	 * numbers starting with a 6 and extending to the next 7 (every 6 will be
	 * followed by at least one 7). Return 0 for no numbers.
	 */
	public int sum67(int[] nums) {
		int sum = 0;
		boolean inRange = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 6) inRange = true;
			if(!inRange) sum += nums[i];
			if(inRange && nums[i] == 7) inRange = false;
		}
		return sum;
	}

	/*
	 * Given an array of ints, return true if the array contains a 2 next to a 2
	 * somewhere.
	 */
	public boolean has22(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 2 && nums[i + 1] == 2) return true;
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if the array contains no 1's and no
	 * 3's.
	 */
	public boolean lucky13(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1 || nums[i] == 3) return false;
		}
		return true;
	}

	/*
	 * Given an array of ints, return true if the sum of all the 2's in the
	 * array is exactly 8.
	 */
	public boolean sum28(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i] == 2 ? nums[i] : 0;
		}
		return sum == 8;
	}

	/*
	 * Given an array of ints, return true if the number of 1's is greater than
	 * the number of 4's
	 */
	public boolean more14(int[] nums) {
		int numOnes = 0;
		int numFours = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) numOnes++;
			if(nums[i] == 4) numFours++;
		}
		return numOnes > numFours;
	}

	/*
	 * Given a number n, create and return a new int array of length n,
	 * containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which
	 * case just return a length 0 array. You do not need a separate
	 * if-statement for the length-0 case; the for-loop should naturally execute
	 * 0 times in that case, so it just works. The syntax to make a new int
	 * array is: new int[desired_length]
	 */
	public int[] fizzArray(int n) {
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = i;
		}
		return array;
	}

	/*
	 * Given an array of ints, return true if every element is a 1 or a 4.
	 */
	public boolean only14(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 1 && nums[i] != 4) return false;
		}
		return true;
	}

	/*
	 * Given a number n, create and return a new string array of length n,
	 * containing the strings "0", "1" "2" .. through n-1. N may be 0, in which
	 * case just return a length 0 array. Note: String.valueOf(xxx) will make
	 * the String form of most types. The syntax to make a new string array is:
	 * new String[desired_length]
	 */
	public String[] fizzArray2(int n) {
		String[] array = new String[n];
		for(int i = 0; i < n; i++) {
			array[i] = String.valueOf(i);
		}
		return array;
	}

	/*
	 * Given an array of ints, return true if it contains no 1's or it contains
	 * no 4's.
	 */
	public boolean no14(int[] nums) {
		boolean seenOne = false;
		boolean seenFour = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) seenOne = true;
			if(nums[i] == 4) seenFour = true;
		}
		return seenOne ^ seenFour || !seenOne && !seenFour;
	}

	/*
	 * We'll say that a value is "everywhere" in an array if for every pair of
	 * adjacent elements in the array, at least one of the pair is that value.
	 * Return true if the given value is everywhere in the array.
	 */
	public boolean isEverywhere(int[] nums, int val) {
		for(int i = 0; i < nums.length - 1; i++) {
			if(!(nums[i] == val || nums[i + 1] == val)) {
				return false;
			}
		}
		return true;
	}

	/*
	 * Given an array of ints, return true if the array contains a 2 next to a 2
	 * or a 4 next to a 4, but not both.
	 */
	public boolean either24(int[] nums) {
		boolean twoTwo = false;
		boolean fourFour = false;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 2 && nums[i + 1] == 2) twoTwo = true;
			if(nums[i] == 4 && nums[i + 1] == 4) fourFour = true;
		}
		return twoTwo ^ fourFour;
	}

	/*
	 * Given arrays nums1 and nums2 of the same length, for every element in
	 * nums1, consider the corresponding element in nums2 (at the same index).
	 * Return the count of the number of times that the two elements differ by 2
	 * or less, but are not equal.
	 */
	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for(int i = 0; i < nums1.length; i++) {
			if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
				count++;
			}
		}
		return count;
	}

	/*
	 * Given an array of ints, return true if the array contains two 7's next to
	 * each other, or there are two 7's separated by one element, such as with
	 * {7, 1, 7}.
	 */
	public boolean has77(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if((nums[i] == 7 && nums[i + 1] == 7) || (nums[i] == 7 && nums[i + 2] == 7) || (nums[i + 1] == 7 && nums[i + 2] == 7)) return true;
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if there is a 1 in the array with a 2
	 * somewhere later in the array.
	 */
	public boolean has12(int[] nums) {
		boolean seenOne = false;
		boolean seenTwo = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) seenOne = true;
			if(nums[i] == 2 && seenOne) seenTwo = true;
		}
		return seenOne && seenTwo;
	}

	/*
	 * Given an array of ints, return true if the array contains either 3 even
	 * or 3 odd values all next to each other.
	 */
	public boolean modThree(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if(nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2) return true;
		}
		return false;
	}

	/*
	 * Given an array of ints, return true if the value 3 appears in the array
	 * exactly 3 times, and no 3's are next to each other.
	 */
	public boolean haveThree(int[] nums) {
		int count = 0;
		boolean prevThree = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 3 && !prevThree) {
				count++;
				prevThree = true;
			} else if(nums[i] != 3) prevThree = false;
		}
		return count == 3;
	}

	/*
	 * Given an array of ints, return true if every 2 that appears in the array
	 * is next to another 2.
	 */
	public boolean twoTwo(int[] nums) {
		for(int i = 0; i < nums.length;) {
			int count = 0;
			while(i < nums.length && nums[i++] == 2) {
				count++;
			}
			if(count == 1) return false;
		}
		return true;
	}

	/*
	 * Return true if the group of N numbers at the start and end of the array
	 * are the same. For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are
	 * the same for n=0 and n=2, and false for n=1 and n=3. You may assume that
	 * n is in the range 0..nums.length inclusive.
	 */
	public boolean sameEnds(int[] nums, int len) {
		for(int i = 0; i < len; i++) {
			if(nums[i] == nums[(nums.length - len) + i]) continue;
			return false;
		}
		return true;
	}

	/*
	 * Return true if the array contains, somewhere, three increasing adjacent
	 * numbers like .... 4, 5, 6, ... or 23, 24, 25.
	 */
	public boolean tripleUp(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if(nums[i] == nums[i + 1] - 1 && nums[i] == nums[i + 2] - 2) return true;
		}
		return false;
	}

	/*
	 * Given start and end numbers, return a new array containing the sequence
	 * of integers from start up to but not including end, so start=5 and end=10
	 * yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the
	 * start number. Note that a length-0 array is valid.
	 */
	public int[] fizzArray3(int start, int end) {
		int length = end - start;
		int[] array = new int[length];
		for(int i = 0; i < length; i++) {
			array[i] = start + i;
		}
		return array;
	}

	/*
	 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns
	 * {2, 5, 3, 6}. You may modify and return the given array, or return a new
	 * array.
	 */
	public int[] shiftLeft(int[] nums) {
		for(int i = 0, start = 0; i < nums.length; i++) {
			if(i == 0) start = nums[i];
			if(i == (nums.length - 1)) {
				nums[i] = start;
				break;
			}
			nums[i] = nums[i + 1];
		}
		return nums;
	}

	/*
	 * For each multiple of 10 in the given array, change all the values
	 * following it to be that multiple of 10, until encountering another
	 * multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
	 */
	public int[] tenRun(int[] nums) {
		boolean tenEncountered = false;
		int ten = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 10 == 0) {
				tenEncountered = true;
				ten = nums[i];
			}
			if(tenEncountered) {
				nums[i] = ten;
			}
		}
		return nums;
	}

	/*
	 * Given a non-empty array of ints, return a new array containing the
	 * elements from the original array that come before the first 4 in the
	 * original array. The original array will contain at least one 4. Note that
	 * it is valid in java to create an array of length 0.
	 */
	public int[] pre4(int[] nums) {
		int before4 = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 4) break;
			before4++;
		}
		int[] array = new int[before4];
		for(int i = 0; i < before4; i++) {
			array[i] = nums[i];
		}
		return array;
	}

	/*
	 * Given a non-empty array of ints, return a new array containing the
	 * elements from the original array that come after the last 4 in the
	 * original array. The original array will contain at least one 4. Note that
	 * it is valid in java to create an array of length 0.
	 */
	public int[] post4(int[] nums) {
		int after4 = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 4) after4 = i + 1;
		}
		int[] array = new int[nums.length - after4];
		for(int i = after4, j = 0; i < nums.length; i++, j++) {
			array[j] = nums[i];
		}
		return array;
	}

	/*
	 * We'll say that an element in an array is "alone" if there are values
	 * before and after it, and those values are different from it. Return a
	 * version of the given array where every instance of the given value which
	 * is alone is replaced by whichever value to its left or right is larger.
	 */
	public int[] notAlone(int[] nums, int val) {
		for(int i = 0; i < nums.length; i++) {
			if((nums[i] == val && i > 0 && i < nums.length - 1) && (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])) nums[i] = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
		}
		return nums;
	}

	/*
	 * Return an array that contains the exact same numbers as the given array,
	 * but rearranged so that all the zeros are grouped at the start of the
	 * array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1}
	 * becomes {0 ,0, 1, 1}. You may modify and return the given array or make a
	 * new array.
	 */
	public int[] zeroFront(int[] nums) {
		int[] result = new int[nums.length];
		int zeroPos = 0;
		int nonZeroPos = result.length - 1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 0) result[zeroPos++] = 0;
			else result[nonZeroPos--] = 0;
		}
		return result;
	}

	/*
	 * Return a version of the given array where all the 10's have been removed.
	 * The remaining elements should shift left towards the start of the array
	 * as needed, and the empty spaces a the end of the array should be 0. So
	 * {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given
	 * array or make a new array.
	 */
	public int[] withoutTen(int[] nums) {
		int[] result = new int[nums.length];
		for(int i = 0, j = 0; i < nums.length; i++) {
			if(nums[i] != 10) result[j++] = nums[i];
		}
		return result;
	}

	/*
	 * Return a version of the given array where each zero value in the array is
	 * replaced by the largest odd value to the right of the zero in the array.
	 * If there is no odd value to the right of the zero, leave the zero as a
	 * zero.
	 */
	public int[] zeroMax(int[] nums) {
		int maxOdd = 0;
		for(int i = nums.length - 1; i >= 0; i--) {
			if(nums[i] % 2 == 1 && nums[i] > maxOdd) maxOdd = nums[i];
			if(nums[i] == 0) nums[i] = maxOdd;
		}
		return nums;
	}

	/*
	 * Return an array that contains the exact same numbers as the given array,
	 * but rearranged so that all the even numbers come before all the odd
	 * numbers. Other than that, the numbers can be in any order. You may modify
	 * and return the given array, or make a new array.
	 */
	public int[] evenOdd(int[] nums) {
		int[] result = new int[nums.length];
		int evenPos = 0;
		int oddPos = result.length - 1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) result[evenPos++] = nums[i];
			else result[oddPos--] = nums[i];
		}
		return result;
	}

	/*
	 * This is slightly more difficult version of the famous FizzBuzz problem
	 * which is sometimes given as a first problem for job interviews. Consider
	 * the series of numbers beginning at start and running up to but not
	 * including end, so for example start=1 and end=5 gives the series 1, 2, 3,
	 * 4. Return a new String[] array containing the string form of these
	 * numbers, except for multiples of 3, use "Fizz" instead of the number, for
	 * multiples of 5 use "Buzz", and for multiples of both 3 and 5 use
	 * "FizzBuzz". In Java, String.valueOf(xxx) will make the String form of an
	 * int or other type. This version is a little more complicated than the
	 * usual version since you have to allocate and index into an array instead
	 * of just printing, and we vary the start/end instead of just always doing
	 * 1..100.
	 */
	public String[] fizzBuzz(int start, int end) {
		String[] result = new String[end - start];
		for(int i = start, j = 0; i < end; i++, j++) {
			if((i % 3 == 0) ^ (i % 5 == 0)) result[j] = (i % 3 == 0) ? "Fizz" : "Buzz";
			else if(i % 3 == 0 && i % 5 == 0) result[j] = "FizzBuzz";
			else result[j] = String.valueOf(i);
		}
		return result;
	} // END OF Array-2

	/*
	 * Consider the leftmost and righmost appearances of some value in an array.
	 * We'll say that the "span" is the number of elements between the two
	 * inclusive. A single value has a span of 1. Returns the largest span found
	 * in the given array. (Efficiency is not a priority.)
	 */
	public int maxSpan(int[] nums) {
		if(nums.length > 0) {
			int maxSpan = 1;
			for(int i = 0; i < nums.length; i++) {
				for(int j = nums.length - 1; j > i; j--) {
					if(nums[j] == nums[i]) {
						int count = (j - i) + 1;
						if(count > maxSpan) maxSpan = count;
						break;
					}
				}
			}
			return maxSpan;
		} else return 0;
	}

	/*
	 * Return an array that contains exactly the same numbers as the given
	 * array, but rearranged so that every 3 is immediately followed by a 4. Do
	 * not move the 3's, but every other number may move. The array contains the
	 * same number of 3's and 4's, every 3 has a number after it that is not a
	 * 3, and a 3 appears in the array before any 4.
	 */
	public int[] fix34(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 3) {
				int temp = nums[i + 1];
				nums[i + 1] = 4;
				for(int j = i + 2; j < nums.length; j++) {
					if(nums[j] == 4) nums[j] = temp;
				}
			}
		}
		return nums;
	}

	/*
	 * (This is a slightly harder version of the fix34 problem.) Return an array
	 * that contains exactly the same numbers as the given array, but rearranged
	 * so that every 4 is immediately followed by a 5. Do not move the 4's, but
	 * every other number may move. The array contains the same number of 4's
	 * and 5's, and every 4 has a number after it that is not a 4. In this
	 * version, 5's may appear anywhere in the original array.
	 */
	public int[] fix45(int[] nums) {
		for(int i = 0; i < nums.length; i++)
			if(nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4) {
				int pos5 = i;
				for(int j = 0; j < nums.length; j++)
					if(nums[j] == 4 && nums[j + 1] != 5) {
						int temp = nums[j + 1];
						nums[j + 1] = 5;
						nums[pos5] = temp;
						break;
					}
			}
		return nums;
	}

	/*
	 * Given a non-empty array, return true if there is a place to split the
	 * array so that the sum of the numbers on one side is equal to the sum of
	 * the numbers on the other side.
	 */
	public boolean canBalance(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			int sum = 0;
			for(int j = 0; j < i; j++) sum += nums[j];
			for(int j = i; j < nums.length; j++) sum -= nums[j];
			if(sum == 0) return true;
		}
		return false;
	}

	/*
	 * Given two arrays of ints sorted in increasing order, outer and inner,
	 * return true if all of the numbers in inner appear in outer. The best
	 * solution makes only a single "linear" pass of both arrays, taking
	 * advantage of the fact that both arrays are already in sorted order.
	 */
	public boolean linearIn(int[] outer, int[] inner) {
		int indexInner = 0;
		int indexOuter = 0;
		while(indexInner < inner.length && indexOuter < outer.length) {
			if(outer[indexOuter] == inner[indexInner]) {
				indexOuter++;
				indexInner++;
			} else indexOuter++;
		}
		return (indexInner == inner.length);
	}

	/*
	 * Given n>=0, create an array length n*n with the following pattern, shown
	 * here for n=3 : {0, 0, 1,   0, 2, 1,   3, 2, 1} (spaces added to show the 
	 * 3 groups).
	 */
	public int[] squareUp(int n) {
		int[] result = new int[n * n];
		int pos = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				result[pos++] = 0;
			}
			for(int k = i; k > 0; k--) {
				result[pos++] = k;
			}
		}
		return result;
	}

	/*
	 * Given n>=0, create an array with the pattern {1,  1, 2,  1, 2, 3,  ... 
	 * 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length 
	 * of the array will be 1 + 2 + 3 ... + n, which is known to sum to 
	 * exactly n*(n + 1)/2.
	 */
	public int[] seriesUp(int n) {
		int[] result = new int[n * (n + 1) / 2];
		int pos = 0;
		int i = 1;
		while(i <= n + 1) {
			for(int j = 1; j < i; j++) result[pos++] = j;
			i++;
		}
		return result;
	}

	/*
	 * We'll say that a "mirror" section in an array is a group of contiguous
	 * elements such that somewhere in the array, the same group appears in
	 * reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9,
	 * 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size of the largest
	 * mirror section found in the given array.
	 */
	public int maxMirror(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			for(int j = nums.length-1; j >= i; j--) {
				int count = 0;
				boolean match = (nums[i] == nums[j]);
				while(match) {
					count++;
					int front = i + count;
					int back = j - count;
					match = (front < nums.length) && (back >= 0) && (nums[front] == nums[back]);
				}
				if(count > result) result = count;
			}
		}
		return result;
	}

	/*
	 * Say that a "clump" in an array is a series of 2 or more adjacent elements
	 * of the same value. Return the number of clumps in the given array.
	 */
	public int countClumps(int[] nums) {
		int count = 0;
		boolean match = false;
		for(int i = 0; i < nums.length-1; i++) {
			if(nums[i] == nums[i+1] && !match) {
				match = true;
				count++;
			} else if(nums[i] != nums[i+1]) {
				match = false;
			}
		}
		return count;
	} // END OF Array-3

}
