
//consicionais 

var idade = prompt('insira sua idade')

if (idade >= 18) {
    console.log("Você é maior de idade")
} else {
    console.log("Você é menor de idade")
}

//laços de repetição

var count = 0

while (count < 5) {

    console.log(count);

    count ++ 
    
}

for(count = 0; count <=3; count++ ){

    console.log(count);
}

//date

var d = new Date()

console.log(d);

console.log(d.getDay()); // .get pegar dados separados (horas, dias, meses etc...)
