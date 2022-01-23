// function greet(name, callback) {
// 	console.log("hi " + name);
// 	callback();
// }

// function callMe() {
// 	console.log("i am a call back function");
// }
// greet("peter", callMe);

// -------------------------------------
// function greet1() {
// 	console.log("hello world");
// }
// function sayName(name) {
// 	console.log("hi " + name);
// }

// setTimeout(greet1, 2000);
// sayName("john");

(function () {
	var username = "sachin";
	function display(name) {
		console.log(`username ${username}`);
	}
	display(username);
})();
