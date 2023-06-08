package testdemo.test;

class Solution {
	public static String reverseVowels(String s) {
		String vowels = "aeiouAEIOU";
		StringBuilder vowelCount = new StringBuilder();
		String[] split = s.split("");
		for (int i = 0; i < split.length; i++) {
			if (vowels.contains(split[i])) {
				vowelCount.append(split[i]);
			}
		}
		StringBuilder vowelCount1 = vowelCount.reverse();
		String[] array = vowelCount1.toString().split("");
		StringBuilder sb = new StringBuilder();
		int k = 0;
		for (int i = 0; i < split.length; i++) {
			if (vowels.contains(split[i])) {
				sb.append(array[k]);
				k++;
			} else {
				sb.append(split[i]);
			}
		}

		return sb.toString();
	}

	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int prev = flowerbed[0];
		int count = 0;
		int i = 0;
        if(flowerbed.length==1 && prev==0){
            return true;
        }
		if(prev == 0 && flowerbed[1] == 0 ) {
			flowerbed[0] = 1; 
			count++;
			i++;
			if(count == n) {
				return true;
			}
			prev = 1;
		}

		for (int j=i; j < flowerbed.length; j++) {
            if (prev == flowerbed[j]) {
				count++;
				flowerbed[j] = 1;
			}
			prev = flowerbed[j];
		}
		return count == n;
	}

	public static void main(String[] args) {
		
		int[] flowerbed = {0,0,1,0,0};
		int n = 2;
		boolean result = canPlaceFlowers(flowerbed, n);
		System.out.println(result);
	}
}