package binarySearch;

public class SmallestLetterGreaterThanTarget {
	
	public static char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            
            if(target < letters[middle]){
                end = middle - 1;
            }else{
                start=middle+1;
            }
        }
        //if greater element no present it will return element at first index
        return letters[start % letters.length];
        
    }
	
	public static void main(String[] args) {
		char [] letters = {'c','f','j'};
		char target='j';
		System.out.println(nextGreatestLetter(letters, target));
		
	}

}
