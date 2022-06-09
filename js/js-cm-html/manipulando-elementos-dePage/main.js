function botao() {
    //alert("obrigado por clicar ")
    document.getElementById("agradecimento").innerHTML = "obrigado por clicar" // innerHTML add elementos do atml no js
}

function redirecionar() {
    window.open("https://github.com/Davs06/projetos-DIO/blob/master/js/sintaxe-basica/calculadora.js")
    //window.location.href ="https://github.com/Davs06/"
}

function trocar(elemento) {
   // document.getElementById("mouseMove").innerHTML = "eita mudou a bagaça" // innerHTML add elementos do atml no js
    elemento.innerHTML = "eita mudou a bagaça"
    //alert("trocar texto")
}

function voltar(elemento) {
   // document.getElementById("mouseMove").innerHTML = "eita" // innerHTML add elementos do atml no js
    elemento.innerHTML = "eita"
}

function funçaoChange(elemento) {
    console.log(elemento.value)
    

}