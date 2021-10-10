class MovingAverage {

    List<Integer> holder;
    List<Double> result;
    int size;

    public MovingAverage(int size) {
         holder = new ArrayList<Integer>();
         result = new ArrayList<Double>();
         this.size = size;
    }
    
    public double next(int val) {
        double resultVar = 0;
        holder.add(val);
        int currentSize = holder.size();
        int sizetoCheck = Math.signum(currentSize-this.size) == -1 ? currentSize : size;
        
        int startSize = Math.signum(currentSize-this.size) == -1 ? 0 : currentSize-this.size;
        

        for(int i=startSize;i<currentSize;i++) {
            resultVar = resultVar + holder.get(i);
        }
        
        return resultVar/sizetoCheck;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */