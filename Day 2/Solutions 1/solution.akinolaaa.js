// solve here

function intersection(arr1, arr2) {
  const intersect = [];
  const hash = {};

  for (let i = 0; i < arr1.length; i++) {
    hash[arr1[i]] = true;
  }
  for (let j = 0; j < arr2.length; j++) {
    if(hash[arr2[j]]){
      intersect.push(arr2[j])
    }
  }
  //console.log(intersect)
  return intersect
}

//if the given array is already sorted? How would you optimize your algorithm?
/* Optimize with merge algorithm with the big O being the length of the shorter array */

// What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
/* take num 2 in chunks, sort and compare */