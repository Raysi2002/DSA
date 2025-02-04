class Person{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
    display(){
        console.log(`Name: ${this.name}\nAge:${this.age}`)
    }
}

let ray = new Person('Aashish', 25);
ray.display();