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
/* function bestProfit2(prices) {
  let maxProfit = 0;
  let i = 0; let j = prices.length-1;
  while(i < j) {
    if(prices[j] - prices[j] > maxProfit) {
      maxProfit = prices[j] - prices[i];
    }
    while(prices[i] > prices[j]) {
      i++;
    }
  }
} */