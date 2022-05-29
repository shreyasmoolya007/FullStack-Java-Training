let p1=document.createElement("p")
p1.innerText="Hi Hello";
document.body.append(p1)

let h=document.createElement("h1")
h.innerText="Inside Heading";
document.body.append(h)

let ul=document.createElement("ul")
let lis=document.createElement("li")
lis.innerText="Hi"
let lis2=document.createElement("li")
lis2.innerText="Hello"

ul.appendChild(lis)
ul.appendChild(lis2)
document.body.append(ul)

function f(){
    document.body.style.backgroundColor=`yellow`
}

let b=document.getElementById(`but1`)

function a(){
    b.style.backgroundColor=`red`
}



function abc(){
    let ppp=document.getElementById(`sel1`).value
    document.body.style.backgroundColor=ppp
}