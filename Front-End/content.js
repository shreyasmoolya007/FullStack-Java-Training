let a=document.getElementsByTagName(`p`)
console.log(a);

a[0].style.color="red"

let b=document.getElementById(`div1`)
b.style.backgroundColor='black'
b.style.color=`white`

let c=document.getElementsByClassName(`div2`)
c[0].style.backgroundColor='red'
c[0].style.color=`white`

console.log(Array.isArray(c));

let d=Array.from(c)
console.log(Array.isArray(d));



d.forEach(element => {
    element.style.color=`yellow`
});