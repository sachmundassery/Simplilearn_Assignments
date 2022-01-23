//-------------------------Example 1: Function with Parameters--------------------
// program to print the text
// declaring a function/*
function greet(name) {
    console.log("Hello " + name + ":)");
}


// variable name can be different
let name1 = "Virendra";

// calling function
greet(name1);


//------------------------- Example 2: Sum of Two Numbers----------------------
// program to add two numbers
// declaring a function
function add(a, b) {
    return a + b;
}

// take input from the user
//let number1 = parseFloat(prompt("Enter first number: "));
//let number2 = parseFloat(prompt("Enter second number: "));

// calling function
//let result11 = add(number1,number2);

// display the result
//console.log("The sum is " + result11);



//-------------------Example 3: pass any number of argumen4ts to the add() function--------
function add() {
    let sum = 0;
    for (let i = 0; i < arguments.length; i++) {
        sum += arguments[i];
    }
    return sum;
}

console.log(add(1, 2)); // 3
console.log(add(1, 2, 3, 4, 5,6,8,7,4,5,6,2,4,6)); // 15