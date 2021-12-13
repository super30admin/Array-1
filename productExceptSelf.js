// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :

// Most optimized approach with constant space
var productExceptSelf = function (nums) {
  let leftAccum = 1;
  let rightAcum = 1;
  const resultsArr = [];

  for (let i = 0; i < nums.length; i++) {
    resultsArr.push(leftAccum);
    leftAccum = leftAccum * nums[i];
  }

  for (let j = resultsArr.length - 1; j >= 0; j--) {
    resultsArr[j] = resultsArr[j] * rightAcum;
    rightAcum = rightAcum * nums[j];
  }

  return resultsArr;
};

console.log(productExceptSelf([1, 2, 3, 4]));

// Brute force attempt
// var productExceptSelf = function (nums) {
//   const producedArr = [];
//   for (let i = 0; i < nums.length; i++) {
//     let product = 1;
//     for (let j = 0; j < nums.length; j++) {
//       if (j !== i) {
//         product = nums[j] * product;
//       }
//       if (j === nums.length - 1) {
//         producedArr.push(product);
//       }
//     }
//   }
//   return producedArr;
// };

// console.log(productExceptSelf([1, 2, 3, 4]));

// Optimized but still using auxillary space
// var productExceptSelf = function (nums) {
//   const leftElements = [];
//   const rightElements = [];
//   let runningProduct = 1;

//   for (let i = 0; i < nums.length; i++) {
//     leftElements.push(runningProduct);
//     runningProduct = runningProduct * nums[i];
//   }
//   runningProduct = 1;
//   for (let i = nums.length - 1; i >= 0; i--) {
//     rightElements.unshift(runningProduct);
//     runningProduct = runningProduct * nums[i];
//   }

//   for (let i = 0; i < leftElements.length; i++) {
//     leftElements[i] = leftElements[i] * rightElements[i];
//   }

//   return leftElements;
// };

// console.log(productExceptSelf([1, 2, 3, 4]));
