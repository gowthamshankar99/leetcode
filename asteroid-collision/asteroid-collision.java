class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        if(asteroids.length == 0 || asteroids.length == 1) {
            return asteroids;
        }
        
        // create stack 
        Stack<Integer> stack = new Stack<Integer>();
        // add the first element
        stack.add(asteroids[0]);
        
        // if peek doesnt return anything - push to stack 
        // if incoming value is negative and peek returns positive --> collision 
        for(int i=1;i<asteroids.length;i++) {
            if(asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
                        stack.pop();
                }
                if(stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroids[i]);
                } else if(stack.peek() == Math.abs(asteroids[i]))  {
                     stack.pop();
                }
            }
            
        }
        
        // result array 
        int[] result = new int[stack.size()];
        
        for(int i=stack.size()-1;i>=0;i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}