class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxi = -1;
        for(int i : candies){
            maxi = Math.max(i , maxi);
        }
        for(int i : candies){
            if((i + extraCandies) >= maxi){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}