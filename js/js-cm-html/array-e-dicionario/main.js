
//Array

var lista = ["maçã", "pera", "laranja" ]
console.log(lista [1]);

lista.push ("uva") // 'array.push' add elento ao array
console.log(lista);

lista.pop () //'array.pop' retira elemento do array
console.log(lista);


console.log(lista.length); //'.length mosta quantidade de itens no array

console.log(lista.reverse()); // reverse() mostra a lista de traz pra frente

console.log(lista.toString()) // tranfroma de formato array para string

console.log(lista.join(" - ")) // tmb tranforma em string mas separando os elementos pelo que vc escolher entre " " nao por vergula


// dicionario

var fruta = {nome: "maçã", cor: "vermelho"}

console.log(fruta);
console.log(fruta.nome);

var frutas = [{nome: "maçã", cor: "vermelho"},{nome: "uva", cor: "roxo"}]

console.log(frutas);
console.log(frutas[1].nome);