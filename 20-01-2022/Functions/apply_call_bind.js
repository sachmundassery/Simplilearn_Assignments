//---------------------------Example 1: bind()--------------------------------
var car = { 
    registrationNumber: "GA12345",
    brand: "Toyota",

    displayDetails: function(ownerName){
        console.log(ownerName + ", this is your car: " + this.registrationNumber + " " + this.brand);
    }
}

var myCarDetails = car.displayDetails.bind(car, "Vivian");
console.log(myCarDetails); // printing name of the fnction
console.log(myCarDetails());   // value of th function being called


//-------------------------- Example 2: bind()--------------------------------
var pokemon = {
    firstname: 'Pika',
    lastname: 'Chu ',
    getPokeName: function() {
        var fullname = this.firstname + ' ' + this.lastname;  // binding the variables with this
        return fullname;
    }
};

var pokemonName = function() {
    console.log(this.getPokeName() + 'I choose you!');  // binding a function using this
};

var logPokemon = pokemonName.bind(pokemon); // creates new object and binds pokemon. 'this' of pokemon === pokemon now

logPokemon();


//------------------------- Example 3: apply()/call() ----------------------
var pokemon = {
    firstname: 'Pika',
    lastname: 'Chu ',
    getPokeName: function() {
        var fullname = this.firstname + ' ' + this.lastname;
        return fullname;
    }
};

var pokemonName = function(snack, hobby) {
    console.log(this.getPokeName() + ' loves ' + snack + ' and ' + hobby);
};

pokemonName.call(pokemon,'sushi', 'algorithms'); // Pika Chu  loves sushi and algorithms
pokemonName.apply(pokemon,['sushi', 'algorithms']);



//------------------------- Example 4: apply()/ call() ----------------------
const book = {
    title: 'Brave New World',
    author: 'Aldous Huxley',
  }
  
  function summary() {
    console.log(`${this.title} was written by ${this.author}.`)
  }
  
  summary.call(book);
  summary.apply(book);

  //printThis.call(book);
  printThis.apply(book);


//---------------------- Example 5: apply / call (using above example 4)----------------------------

function longerSummary(genre, year) {
  console.log(
    `${this.title} was written by ${this.author}. It is a ${genre} novel written in ${year}.`
  )
}

longerSummary.call(book, 'dystopian', 1932)
longerSummary.apply(book, ['dystopian', 1932])