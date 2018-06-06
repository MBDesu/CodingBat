package com.experimental.coding.bat.exercises;

public class ArrayExercises {

	public static void main(String[] args) {
		new ArrayExercises();
	}

	public ArrayExercises() {
		
	}

	// Start of Array-1

	public boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

	public boolean sameFirstLast(int[] nums) {
		return nums.length >= 1 && nums[0] == nums[nums.length - 1];
	}

	public int[] makePi() {
		return new int[] {3, 1, 4};
	}

	public boolean commonEnd(int[] a, int[] b) {
		return (a[0] == b[0]) || (b[b.length - 1] == a[a.length - 1]);
	}

	public int sum3(int[] nums) {
		return nums[0] + nums[1] + nums[2];
	}

	public int[] rotateLeft3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		return nums;
	}

	public int[] reverse3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		return nums;
	}

	public int[] maxEnd3(int[] nums) {
		int larger = nums[0] > nums[2] ? nums[0] : nums[2];
		nums[0] = larger;
		nums[1] = larger;
		nums[2] = larger;
		return nums;
	}

	public int sum2(int[] nums) {
		if(nums.length < 1) return 0;
		if(nums.length == 1) return nums[0];
		return nums[0] + nums[1];
	}

	public int[] middleWay(int[] a, int[] b) {
		return new int[] { a[1], b[1] };
	}

	public int[] makeEnds(int[] nums) {
		return new int[] { nums[0], nums[nums.length - 1] };
	}

	public boolean has23(int[] nums) {
		return nums[0] == 2 || nums[1] == 2 || nums[0] == 3 || nums[1] == 3;
	}

	public boolean no23(int[] nums) {
		return nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3;
	}

	public int[] makeLast(int[] nums) {
		int[] arr = new int[nums.length * 2];
		arr[arr.length - 1] = nums[nums.length - 1];
		return arr;
	}

	public boolean double23(int[] nums) {
		return nums.length < 2 ? false : (nums[0] == 2 && nums[1] == 2) || (nums[0] == 3 && nums[1] == 3);
	}

	public int[] fix23(int[] nums) {
		if(nums[0] == 2 && nums[1] == 3) {
			nums[1] = 0;
		} else if(nums[1] == 2 && nums[2] == 3) {
			nums[2] = 0;
		}
		return nums;
	}

	public int start1(int[] a, int[] b) { // this code is poopy doopy
		if(a.length == 0 && b.length == 0) return 0;
		if(a.length == 0) return b[0] == 1 ? 1 : 0;
		if(b.length == 0) return a[0] == 1 ? 1 : 0;
		if(a[0] == 1 && b[0] == 1) return 2;
		if(a[0] == 1 || b[0] == 1) return 1;
		return 0;
	}

	public int[] biggerTwo(int[] a, int[] b) {
		int aSum = a[0] + a[1];
		int bSum = b[0] + b[1];
		return aSum >= bSum ? a : b;
	}

	public int[] makeMiddle(int[] nums) {
		int[] arr = new int[2];
		arr[0] = nums[(nums.length / 2) - 1];
		arr[1] = nums[(nums.length / 2)];
		return arr;
	}

	public int[] plusTwo(int[] a, int[] b) {
		return new int[] { a[0], a[1], b[0], b[1] };
	}

	public int[] swapEnds(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		return nums;
	}

	public int[] midThree(int[] nums) {
		int middle = nums.length / 2;
		return new int[] { nums[middle - 1], nums[middle], nums[middle + 1] };
	}

	public int maxTriple(int[] nums) {
		int middle = nums.length / 2;
		return Math.max(nums[0], Math.max(nums[middle], nums[nums.length - 1]));
	}

	public int[] frontPiece(int[] nums) {
		if(nums.length < 2) return nums;
		return new int[] { nums[0], nums[1] };
	}

	public boolean unlucky1(int[] nums) {
		if(nums.length < 2) return false;
		return (nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3);
	}

	public int[] make2(int[] a, int[] b) {
		if(a.length >= 2) return new int[] { a[0], a[1] };
		if(a.length == 1) return new int[] { a[0], b[0] };
		return new int[] { b[0], b[1] };
	}

	public int[] front11(int[] a, int[] b) {
		boolean aIsEmpty = a.length == 0;
		boolean bIsEmpty = b.length == 0;
		if(aIsEmpty && bIsEmpty) return new int[] {};
		if(aIsEmpty) return new int[] { b[0] };
		if(bIsEmpty) return new int[] { a[0] };
		return new int[] { a[0], b[0] };
	}

	// end of Array-1
	// start of Array-2

	public int countEvens(int[] nums) {
		int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) count++;
		}
		return count;
	}

	public int bigDiff(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) max = nums[i];
			if(nums[i] < min) min = nums[i];
		}
		return max - min;
	}

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

	public boolean has22(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 2 && nums[i + 1] == 2) return true;
		}
		return false;
	}

	public boolean lucky13(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1 || nums[i] == 3) return false;
		}
		return true;
	}

	public boolean sum28(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i] == 2 ? nums[i] : 0;
		}
		return sum == 8;
	}

	public boolean more14(int[] nums) {
		int numOnes = 0;
		int numFours = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) numOnes++;
			if(nums[i] == 4) numFours++;
		}
		return numOnes > numFours;
	}

	public int[] fizzArray(int n) {
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = i;
		}
		return array;
	}

	public boolean only14(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 1 && nums[i] != 4) return false;
		}
		return true;
	}

	public String[] fizzArray2(int n) {
		String[] array = new String[n];
		for(int i = 0; i < n; i++) {
			array[i] = String.valueOf(i);
		}
		return array;
	}

	public boolean no14(int[] nums) {
		boolean seenOne = false;
		boolean seenFour = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) seenOne = true;
			if(nums[i] == 4) seenFour = true;
		}
		return seenOne ^ seenFour || !seenOne && !seenFour;
	}

	public boolean isEverywhere(int[] nums, int val) {
		for(int i = 0; i < nums.length - 1; i++) {
			if(!(nums[i] == val || nums[i + 1] == val)) {
				return false;
			}
		}
		return true;
	}

	public boolean either24(int[] nums) {
		boolean twoTwo = false;
		boolean fourFour = false;
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 2 && nums[i + 1] == 2) twoTwo = true;
			if(nums[i] == 4 && nums[i + 1] == 4) fourFour = true;
		}
		return twoTwo ^ fourFour;
	}

	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for(int i = 0; i < nums1.length; i++) {
			if(nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
				count++;
			}
		}
		return count;
	}

	public boolean has77(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if((nums[i] == 7 && nums[i + 1] == 7) || (nums[i] == 7 && nums[i + 2] == 7) || (nums[i + 1] == 7 && nums[i + 2] == 7)) return true;
		}
		return false;
	}

	public boolean has12(int[] nums) {
		boolean seenOne = false;
		boolean seenTwo = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) seenOne = true;
			if(nums[i] == 2 && seenOne) seenTwo = true;
		}
		return seenOne && seenTwo;
	}

	public boolean modThree(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if(nums[i] % 2 == nums[i + 1] % 2 && nums[i] % 2 == nums[i + 2] % 2) return true;
		}
		return false;
	}

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

	public boolean sameEnds(int[] nums, int len) {
		for(int i = 0; i < len; i++) {
			if(nums[i] == nums[(nums.length - len) + i]) continue;
			return false;
		}
		return true;
	}

	public boolean tripleUp(int[] nums) {
		for(int i = 0; i < nums.length - 2; i++) {
			if(nums[i] == nums[i + 1] - 1 && nums[i] == nums[i + 2] - 2) return true;
		}
		return false;
	}

	public int[] fizzArray3(int start, int end) {
		int length = end - start;
		int[] array = new int[length];
		for(int i = 0; i < length; i++) {
			array[i] = start + i;
		}
		return array;
	}

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

	public int[] notAlone(int[] nums, int val) {
		for(int i = 0; i < nums.length; i++) {
			if((nums[i] == val && i > 0 && i < nums.length - 1) && (nums[i] != nums[i - 1] && nums[i] != nums[i + 1])) nums[i] = nums[i - 1] > nums[i + 1] ? nums[i - 1] : nums[i + 1];
		}
		return nums;
	}

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

	public int[] withoutTen(int[] nums) {
		int[] result = new int[nums.length];
		for(int i = 0, j = 0; i < nums.length; i++) {
			if(nums[i] != 10) result[j++] = nums[i];
		}
		return result;
	}

	public int[] zeroMax(int[] nums) {
		int maxOdd = 0;
		for(int i = nums.length - 1; i >= 0; i--) {
			if(nums[i] % 2 == 1 && nums[i] > maxOdd) maxOdd = nums[i];
			if(nums[i] == 0) nums[i] = maxOdd;
		}
		return nums;
	}

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

	public String[] fizzBuzz(int start, int end) {
		String[] result = new String[end - start];
		for(int i = start, j = 0; i < end; i++, j++) {
			if((i % 3 == 0) ^ (i % 5 == 0)) result[j] = (i % 3 == 0) ? "Fizz" : "Buzz";
			else if(i % 3 == 0 && i % 5 == 0) result[j] = "FizzBuzz";
			else result[j] = String.valueOf(i);
		}
		return result;
	}

	// end of Array-2
	// start of Array-3

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

	public boolean canBalance(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			int sum = 0;
			for(int j = 0; j < i; j++) sum += nums[j];
			for(int j = i; j < nums.length; j++) sum -= nums[j];
			if(sum == 0) return true;
		}
		return false;
	}

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

}
