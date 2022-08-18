function sumNTerms(){
  const cache = {};
  let first = 1;
  const incr = 3;
  let next = first;

  return function(n) {
    let sum = 0;
    if(n < 1) return sum.toFixed(2)
    if(n in cache) return cache[n].toFixed(2);

    for(i=1; i<=n; i++){
      sum += 1/(next);
      console.log(next);
      cache[i] = sum;
      next += incr;
    }
    return sum.toFixed(2);
  }
}
const solution = sumNTerms();
solution(3);
solution(2);
solution(5);
solution(0);
