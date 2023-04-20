// syntactic sugar for new Object();
const obj = {
    name: {
        firstName: 'Sean',
        lastName: 'Carter'
    },
    favColor: 'Blue',
    age: 23,
    favPeople: ['Sylvia', 'Padma', 'Simran', 'Shahab', 'Lily', 'Kiruthika', 'Qianying']
};

// Objects are unstructured in JS

console.log(obj.firstName);

obj.favDayOfWeek = 'Thursday';

console.log(obj);

// You do have the ability to "lock" your objects
// and alter specific properties

Object.freeze(obj); // read only object

obj.a = 'a'; // Won't be added because object is frozen

console.log(obj.a);

// Alter specific properties

const animal = {
    breed: 'Panda',
    name: 'Petey',
    age: 0.2,
}

/**
 * writable - Prevents the writing/mutation of that specific property 
 * enumerable - Prevents it from showing up when you enumerate over the object (Property does still exist)
 * configurable - Locking the configuration of that property (Once set to false, can't be changed back to true)
 */
Object.defineProperty(animal, 'age', {enumerable: false, writable: false});

// ...

Object.defineProperty(animal, 'age', {writable: true, enumerable: true});
animal.age = 2000;

console.log(animal);

/**
 * Enumerable
 * 
 * for..in loop over enumerable
 * for..of loop over iterable
 */

// Looping over an object
// Object's are NOT iterable
let propertyName = 'Country';

const otherObj = {
    name: ['Sean', 'Carter'],
    favColor: 'Blue',
    property: 'PROPERTY',
    [propertyName]: [] // Whatever value propertyName holds, apply it as the key
}
// otherObj[propertyName] = null; // Equivalent to up above


for (let property in otherObj) {
    // console.log(otherObj.property); // Accessing a property on the object called property
    console.log(`Key: ${property}. Value: ${otherObj[property][1]}`);
    // console.log(otherObj[property]); // Takes the value of property and finds a property with that value
}