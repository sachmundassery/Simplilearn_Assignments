//--------------Example 2:--------------------

const message1 = "JavaScript is fun";

// check if message includes the string "Java"
let result1 = message1.includes("Java");
console.log(result1);


//--------------Example 2:--------------------
let sentence1 = "Java is to JavaScript what Car is to Carpet.";

let check = sentence1.includes("Java");
console.log(check); // true

// case sensitive
let check1 = sentence1.includes("java");
console.log(check1); // false

// second argument specifies position to start at
let check2 = sentence1.includes("Java", 20);
console.log(check2); // false

let check3 = sentence1.includes("whose");
console.log(check3); // false

let check4 = sentence1.includes("");
console.log(check4); 