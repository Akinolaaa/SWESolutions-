class MaxProfitBBWISE{
    public int maxProfit(int[] prices) {
        
        int min = prices[0], output=0;
        for(int i=1;i<prices.length;i++){
            
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                int sub = prices[i]-min;
                if((prices[i]-min)>output){
                    output = prices[i]-min;
                }
            }
        }
        return output;
    }
    public static void main(String [] args){
	int [] prices = {7,1,5,3,6,4};
	MaxProfitBBWISE sol = new MaxProfitBBWISE();
	sol.maxProfit(prices);
    }
}