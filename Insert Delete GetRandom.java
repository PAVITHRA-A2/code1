//leetcode
//380. Insert Delete GetRandom O(1)
class RandomizedSet {
    private List<Integer> list;
        private Random rand;

    public RandomizedSet()
    {
         list = new ArrayList<>();
         rand = new Random();       
        
    }
    
    public boolean insert(int val) {
         if(list.contains(val))
         {
            return false;
         }
         list.add(val);
         return true;
    }
    
    public boolean remove(int val) {
       if(!list.contains(val))
       {
        return false;
       }
       list.remove(Integer.valueOf(val));
       return true;
    }
    
    public int getRandom() {
       int randomIndex= rand.nextInt(list.size());
       return list.get(randomIndex); 
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
