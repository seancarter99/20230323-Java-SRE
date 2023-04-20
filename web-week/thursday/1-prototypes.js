const obj = {
    name: 'Sean'
}

obj.valueOf = function() {
    // console.log('Overriden valueOf')
    return 'Overriden valueoF';
}

console.log(obj.valueOf());

Array.prototype.keys();

const obj2 = {};
// __proto__ is just a pointer to the object's prototype it was created from
console.log(obj2.__proto__ === Object.prototype); // true