--------Example 1: Arrow Function with No Argument---------------
If a function doesn't take any argument, then you should use empty parentheses. For example,

let greet = () => console.log('Hello');
greet(); // Hello


-------Example 2: Arrow Function with One Argument---------------
If a function has only one argument, you can omit the parentheses. For example,

let greet = x => console.log(x);
greet('Hello'); // Hello



------Example 3: Arrow Function as an Expression-----------------
You can also dynamically create a function and use it as an expression. For example,

let age = 5;

let welcome = (age < 18) ?
  () => console.log('Baby') :
  () => console.log('Adult');

welcome(); // Baby



------Example 4: Multiline Arrow Functions---------------------
If a function body has multiple statements, you need to put them inside curly brackets {}. For example,

let sum = (a, b) => {
    let result = a + b;
    return result;
}

let result1 = sum(5,7);
console.log(result1); // 12


-------Example 5: this with Arrow Function---------------------
Inside a regular function, this keyword refers to the function where it is called.

However, this is not associated with arrow functions. Arrow function does not have its own this. So whenever you call this, it refers to its parent scope. For example,

Inside a regular function

function Person() {
    this.name = 'Jack',
    this.age = 25,
    this.sayName = function () {

        console.log(this.age);
        let innerFunc = () => {
            console.log(this.age);
        }

        innerFunc();
    }
}

const x = new Person();
x.sayName();

let x = new Person();
x.sayName();

