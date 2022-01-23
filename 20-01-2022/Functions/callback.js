//------------------------------Example 1:------------------------------
// function
function greet(name, callback) {
    console.log('Hi' + ' ' + name);
    callback();
}

// callback function
function callMe() {
    console.log('I am callback function');
}

// passing function as an argument
greet('Peter', callMe);

//-------------------------Example 2: Program with setTimeout()-----------------
// program that shows the delay in execution Here, the greet() function is called after 2000 milliseconds (2 seconds). During this wait, the sayName('John'); is executed. That is why Hello John is printed before Hello world.
//The below code is executed asynchronously (the second function; sayName() does not wait for the first function; greet() to complete).

function greet1() {
    console.log('Hello world');
}

function sayName(name) {
    console.log('Hello' + ' ' + name);
}

// calling the function
setTimeout(greet1, 2000);
sayName('John');


//-------------(Solution to above)-----Example 3: Using a Callback Function----------------------
//In the above example, the second function does not wait for the first function to be complete. However, if you want to wait for the result of the previous function call before the next statement is executed, you can use a callback function. For example,

// Callback Function Example
function greet3(name, myFunction) {
    console.log('Hello world');

    // callback function
    // executed only after the greet() is executed
    // myFunction(name);
}

// callback function
function sayName(name) {
    console.log('Hello' + ' ' + name);
}

// calling the function after 2 seconds
setTimeout(greet3, 2000, 'John', sayName); 