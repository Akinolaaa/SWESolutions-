function solution(words) {
  const morse = [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]; //['a','b','c',...]
  const unique = [];
  // Loop through every word
  for(i=0; i < words.length; i++){
    //loop through every letter
    let word = words[i].toLowerCase();
    let wordInMorse = "";
    for(j=0; j < word.length; j++){
      //concatenating the morse code of every letter
      // a = 65
      wordInMorse += morse[word.charCodeAt(j)-65];
    }
    if(!unique.includes(wordInMorse)) {
      unique.push(wordInMorse);
    }
    console.log(unique);
  }
  return unique.length;
}

const a = solution(["gin","zen","gig","msg"]);
console.log(a);