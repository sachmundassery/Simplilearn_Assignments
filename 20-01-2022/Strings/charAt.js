//--------------------------------Example 1:----------------------------------------
let sentence = "Happy Birthday to you!";

let index1 = sentence.charAt(2);
console.log("Character at index 2:" + index1); // 'p'

// index is converted to integer
let index2 = sentence.charAt(6.5); // 'B'
console.log("Character at index 6:" + index2);

// Empty string if index out of range
let index3 = sentence.charAt(100);
console.log("Character at index 100:" + index3); // ''

// default value is 0
let index4 = sentence.charAt();
console.log("Character at index 0:" + index4);