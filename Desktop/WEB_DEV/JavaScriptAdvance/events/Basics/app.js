// Best way to do event handeling is addEventListner

const first  = document.getElementById("first");

const second = document.getElementById("second");

const third = document.getElementById("third");

first.addEventListener('click', (e) => {
    alert("This is addEventListner click method");
})

second.addEventListener('dblclick', (e) => {
    alert("This is addEventListner double method");
})

third.addEventListener('mouseover', (e) => {
    alert("This is addEventListner mouseover method");
})