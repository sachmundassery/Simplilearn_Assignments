----------------------------Example 1 :------------------------------    
    const map = new Map(); // an empty map
        console.log(map); 
	
	map.set('info', {name: 'Jack', age: 26}); // insert key-value pair
	console.log(map); 
	
	console.log(map.get('info'));   // access the elements of a Map
	
	console.log(map.has('info'));  // check if an element is in Set
	
	map.delete('address'); // removing a particular element
	console.log(map); // 

	map.delete('info'); // true
	console.log(map);
	


//----------------------------Example 2:----------------------------//
	// Using Map.prototype.set(k, v) creating an empty map
	var map1 = new Map();
	
	// adding some elements to the map
	map1.set("first name", "sumit");
	map1.set("last name", "ghosh");
	map1.set("website", "geeksforgeeks")
		.set("friend 1","gourav")
		.set("friend 2","sourav");
	
	console.log(map1);
		
	// Using Map.prototype.has(k) retuns true
	console.log("map1 has website ? "+ map1.has("website"));
	
	// return false
	console.log("map1 has firend 3 ? " + map1.has("friend 3"));
		
	// Using Map.prototype.get(k) returns geeksforgeeks
        console.log("--------get----------");
	console.log("get value for key website "+ map1.get("website"));
	
	// returns undefined
	console.log("get value for key friend 3 "+ map1.get("friend 3"));
	
	// Using Map.prototype.delete(k) removes key "website" and its value from the map it prints the value of the key
	console.log("delete element with key website " + map1.delete("website"));
		
	// as the value is deleted from the map hence it returns false
        console.log("--------has----------");
	console.log("map1 has website ? "+ map1.has("website"));
	
	// returns false as this key is not in the list
        console.log("--------delete----------");
	console.log("delete element with key website " + map1.delete("friend 3"));
        
        // getting all the keys of the map 
        var get_keys = map1.keys();
        console.log("--------keys----------");
        for(var ele of get_keys)  // for loop
        console.log(ele);
        
        // getting all the values of the map
	var get_values = map1.values();
	console.log("----------values------------");
	for(var ele of get_values)
	console.log(ele);

        // using the forEach 
        console.log("----------forEach------------");
        function printOne(values)     // for each
	{
  	 console.log(values);
	}  
	// It prints value of all the element of the set
	console.log("-----one parameter-----");
	map1.forEach(printOne);
	
	// Using Map.prototype.clear() removing all values from map1
	map1.clear();
	
	// map1 is empty
	console.log(map1);


-------------------------------Example 3:-------------------------------------
const map1 = new Map();
map1.set('bar', 'foo');

console.log(map1.has('bar'));
// expected output: true

console.log(map1.has('baz'));
// expected output: false		

console.log(map1.get('bar'));
// expected output: "foo"

console.log(map1.get('baz'));

console.log(map1.delete('bar'));
// expected result: true
// (true indicates successful removal)

console.log(map1.has('bar'));
// expected result: false

let myMap = new Map()

// Add new elements to the map
myMap.set('bar', 'foo')
myMap.set(1, 'foobar')

// Add new elements to the map with chaining.
myMap.set('bar', 'foo')
     .set(1, 'foobar')
     .set(2, 'baz');

const map1 = new Map();

map1.set('0', 'foo');
map1.set(1, 'bar');

const iterator1 = map1.entries();

console.log(iterator1.next().value);
// expected output: ["0", "foo"]

console.log(iterator1.next().value);
// expected output: [1, "bar"]

// forEach
function logMapElements(value, key, map) {
  console.log(`m[${key}] = ${value}`);
}

new Map([['foo', 3], ['bar', {}], ['baz', undefined]])
  .forEach(logMapElements);


const map1 = new Map();

map1.set('0', 'foo');
map1.set(1, 'bar');

const iterator1 = map1.values();

const iterator1 = map1.keys();

console.log(iterator1.next().value);
// expected output: "0"

console.log(iterator1.next().value);
// expected output: 1

console.log(iterator1.next().value);
// expected output: "foo"

console.log(iterator1.next().value);
// expected output: "bar"

const iterator1 = map1[Symbol.iterator]();

for (const item of iterator1) {
  console.log(item);
}