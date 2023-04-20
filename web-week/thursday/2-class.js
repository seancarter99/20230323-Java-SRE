const obj = {};

// Obj2 inherits from obj
// const obj2 = Object.create(obj);

// Classes
/**
 * Classes are simply syntactic sugar for JS constructor functions
 * 
 */

// No access modifiers in JS (there is in TypeScript)
class Bird {

    color;
    wingSpan;

    constructor(color, wingSpan) {
        this.color = color;
        this.wingSpan = wingSpan;
    }

    chirp() {
        console.log('Chirp chirp' + this.color);
    }
}


const bird = new Bird('Blue', 2.5);
bird.chirp();

// Inheritance

class BlueJay extends Bird {

    // Pound sign in front of the variable name indicates the field is private
    #numFeet;

    constructor(color, wingSpan) {
        super(color, wingSpan); // Forwards to the parent constructor
    }

    chirp() {
        console.log("I'm a BlueJay");
        // super.chirp();
    }

    // To call, use the object you create .numFeet
    get numFeet() {
        return this.#numFeet;
    }

    set mySetter(numFeet) {
        this.#numFeet = numFeet;
    }

    static fly() {
        console.log('Flying')
    }
}

// BlueJay.fly = function() {
//     console.log('Flying');
// }

BlueJay.breed = 'BLUEJAY';

// BlueJay.prototype.fly = function() {

// }

const blueJay = new BlueJay('Green', 1);

blueJay.chirp();

console.log(blueJay); // Private fields won't show up in the print

blueJay.mySetter = 5; // Calls the setter
console.log(blueJay.numFeet); // This calls the getter

// blueJay.fly(); // This doesn't work in JS

BlueJay.fly(); // This is how to call it

console.log(BlueJay.breed);