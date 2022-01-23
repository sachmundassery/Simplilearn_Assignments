// Without template literal   
console.log('Without template literal \n multiline string');   
    
// With template literal   
console.log(`Using template literal  
multiline string`);  

//-----------Example-2:---------------//
var name = 'World';  
var cname = 'Simplilearn';  
console.log(`Hello, ${name}!  
Welcome to ${cname}`);

//---------Example 3:-----------------//
var x = 10;  
var y = 20;  
console.log(`The product of the variables ${x} and ${y} is:  
 ${x*y}`); 

//--------Tagged literal--------------//
function TaggedLiteral(str, val1, val2) {   
    console.log(str);   
    console.log(val1+"    "+val2);   
}   
    
let text = 'Hello World';   
TaggedLiteral`Colors ${text} ${10+30}`;  