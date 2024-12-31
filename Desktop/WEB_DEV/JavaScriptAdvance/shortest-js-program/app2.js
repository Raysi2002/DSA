// ----------- Global and Local things in JS-----------
// Whatever we write outside the function are considered as global objects
var age = 22; //----------> GLobal Object (Can be accssed but this keyword or window or soly)

function doSomething(){
    var x = 20; //-----------> Local Object (can't be directly called by window or this keyword)
}