//----------------------------Example 1:--------------------------------
(function () {
var userName = "Snehal";
function display(name)
{
console.log(`username ${userName}`);
}
display(userName);
})();


//----------------------------Example 2:---------------------------------
  var isLucky = function() {
        var iife = Math.round(Math.random() * 100);
        if (iife > 50) {
        return "You are checking Immediate Invoking Function Expression!";
        } else {
        return "We are not in IIFE, better luck next time!";
        }
        };
        var me = isLucky();
        console.log(me);


//---------------------------Example 3:-----------------------------------

(function counter() {
    var count = 0;

    function increment() {
      count++;
    }

    increment();
    console.log(count) // 1
}());