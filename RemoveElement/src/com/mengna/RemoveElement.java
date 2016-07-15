package com.mengna;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement removeElement = new RemoveElement();
		int[] nums = new int[] { 1};
		removeElement.removeElement(nums, 3);
	}

	public int removeElement(int[] nums, int val) {
		int i = 0, j = 0;

		for (i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}

		}
		System.out.println(j);
		return j;
	}
}
