// Simple solution
function bestProfit(prices) {
  let maxProfit = 0;
  for (let i = 0; i < prices.length; i++) {
    let buy = prices[i]
    for (let j = i+1; j < prices.length; j++) {
      if(prices[j] - buy > maxProfit) {
        maxProfit = prices[j] - buy
      }
    }
  }
  return maxProfit; 
}

//better solution
function bestProfit2(prices) {
  let maxProfit = 0;
  let buy = prices[0];
  for (let i = 1; i < prices.length; i++) {
    if(prices[i] - buy > maxProfit){
      maxProfit = prices[i] - buy
    } else if (prices[i] < buy) {
      buy = prices[i];
    }
  }
  return maxProfit; 
}