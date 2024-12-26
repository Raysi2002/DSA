const btn = document.getElementById("btn");
const box = document.getElementById("box");

box.addEventListener("click", () =>{
    box.style.backgroundColor = "yellow";
})

box.addEventListener("dblclick", (e) => {
    box.classList.add("addTransition");
    box.style.backgroundColor = "orange";
    setTimeout(() => {
        box.addEventListener("mouseover", (e) =>{
            box.style.translate = "30rem";
        })
    }, 1)
})

box.addEventListener()