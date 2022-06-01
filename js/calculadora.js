function calculadora() {
    const oprac = Number(prompt('Escolha uma opção:\n 1- Soma (+)\n 2- Subtração (-)\n 3- Multiplicação (*)\n 4- Divisão (/)\n 5- Restante da Divisão  (%)\n 6- Potenciação (**)'))
    
if (!oprac ||  oprac >= 7) {
    alert('error - Insira uma opção valida ')
    calculadora()
} else {

    let n1 = Number(prompt ('Insira o primeiro valor '))
    let n2 = Number(prompt ('Insira o segundo valor '))
    let resultado;

    if (!n1 || !n2) {
        alert('erro - insira apenas numeros')
        calculadora()
    } else {

        function soma(){
            resultado = n1 + n2
            alert (`${n1} + ${n2} = ${resultado}`)
            novaOperacao()
        }

        function subtração(){
            resultado = n1 - n2
            alert (`${n1} - ${n2} = ${resultado}`)
            novaOperacao()
        }

        function multiplicação(){
            resultado = n1 * n2
            alert (`${n1} * ${n2} = ${resultado}`)
            novaOperacao()
        }

        function divisão(){
            resultado = n1 / n2
            alert (`${n1} / ${n2} = ${resultado}`)
            novaOperacao()
        }

        function restoDaDivisão(){
            resultado = n1 % n2
            alert (`o restante da divisão de ${n1} entre ${n2} = ${resultado}`)
            novaOperacao()
        }

        function potenciação(){
            resultado = n1 ** n2
            alert (`${n1} elevado a  ${n2} potencia é igual ${resultado}`)
            novaOperacao()
        }

        function novaOperacao() {
            let opcao = prompt('Deseja fazer outra operação?\n 1 - Sim\n 2 - Não');
            if (opcao == 1) {
                calculadora();
            } else if (opcao == 2) {
                alert('Até mais jovem padawan!');
            } else {
                alert('Digite uma opção válida!');
                novaOperacao();
            }
        }
    }
}
switch (oprac){
    case 1 : soma (); break
    case 2 : subtração (); break
    case 3 : multiplicação (); break
    case 4 : divisão(); break
    case 5 : restoDaDivisão(); break
    case 6 : potenciação(); break
}  

}

calculadora() 