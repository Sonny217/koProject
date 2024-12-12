import java.lang.classfile.Signature

//
//fun main(args: Array<String>) {
//    print("Ingres la primera nota:")
//    val nota1 = readln().toInt()
//    print("Ingrese la segunda nota:")
//    val nota2 = readln().toInt()
//    print("Ingrese la tercera nota")
//    val nota3 = readln().toInt()
//    val promedio = (nota1+nota2+nota3)/3
//    if (promedio >= 70)
//    {
//        println("promocionado: $promedio")
//    }
//    else{
//        println("No Promocionado: $promedio")
//    }
//}
//

//fun main(args: Array<String> ){
//    print("Ingrese un valor:")
//    val valor =readln().toInt()
//    if (valor <10)
//    {
//        print("el valor tiene un digitos: $valor")
//    }
//    else{
//        print("El valor tiene dos digito: $valor")
//    }
//}

//
//fun main(args: Array<String>){
//    print("Ingrese un valor entre 1 y 99:")
//    val valor = readln().toInt()
//    var valor2 = if (valor < 10 )  "un digito" else "dos digitos"
//    print("El valor $valor es de $valor2.")
//}

//
//fun main (args: Array<String>){
//    print("Ingres un valor:")
//    val valor1 = readln().toInt()
//    print("Ingrese un segundo valor:")
//    val valor2 = readln().toInt()
//    val mayor = if ( valor1 > valor2) "Mayor:$valor1" else "Mayor $valor2"
//}

//fun main (args: Array<String>){
//    print("Ingrese un valor:")
//    val valor1= readln().toInt()
//    val valor2 = if (valor1 > 0) "El valor es positvo: $valor1" else "El valor es negativo: $valor1"
//    print(valor2)
//}


//fun  main(args: Array<String>) {
//    print("Ingrese un numero:")
//    val valor = readln().toInt()
//    if (valor < 10)
//        println("Tiene un dígito")
//    else
//        if (valor < 100)
//            println("Tiene dos dígitos")
//        else
//            if (valor < 1000)
//                println("Tiene tres dígitos")
//            else
//                println("Error en la entrada de datos.")
//}
//
//fun main(args: Array<String>){
//    print("Ingrese nombre del postulante:")
//    val nombre = readln().toString()
//    print("Ingrese cantidad total de preguntas:")
//    val preguntas = readln().toInt()
//    print("Ingrese cantidad de respuestas correctas:")
//    val respuestas = readln().toInt()
//    val calculo = respuestas * 100 / preguntas
//    if (calculo > 90)
//        print("EL postulante $nombre obtuvo el Nivel Maximo: $calculo")
//    else
//      if (calculo >=75 && calculo < 90)
//        print("El psotulante $nombre obtuvo el Nivel Medio: $calculo")
//     else
//         if (calculo >=50 && calculo <75)
//             print("El psotulante $nombre obtuvo el Nivel Regular: $calculo")
//      else
//          if (calculo < 50)
//              print("El psotulante $nombre esta Fuera del Nivel: $calculo")
//}

//relacionales (>, <, >=, <= , ==, !=)
//matemáticos (+, -, *, /, %)
//lógicos (&&, ||)

//fun main(args: Array<String>){
//    println("*Ingrese una fecha festiva*")
//    print("Ingrese dia:")
//    val dia = readln().toInt()
//    print("Ingrese mes:")
//    val  mes = readln().toInt()
//    print("Ingrese año:")
//    val año =readln().toInt()
//     if (dia==25 && mes == 12)
//         print("La fecha pertenece a Naviada:$dia/$mes/$año")
//      else
//          print("la fecha no pertence a navidad:$dia/$mes/$año")
//}


//fun  main(args: Array<String>){
//    print("Ingrese primer valor:")
//    val valor1 = readln().toInt()
//    print("Ingrese segundo valor:")
//    val valor2 = readln().toInt()
//    print("Ingrese tercer valor:")
//    val valor3 = readln().toInt()
//    val cubo =(valor1*valor2*valor3)
//    if (valor1 == valor2 && valor1 == valor3)
//        print("$cubo")
//    else
//        print("los elemnentos no iguales")
//}

//fun main(args: Array<String>){
//    print("Ingrese un valor:")
//    val valor1 = readln().toInt()
//    print("Ingrese un segundo valor:")
//    val valor2 = readln().toInt()
//    print("Ingrese un ultimo valor:")
//    val valor3 = readln().toInt()
//    if (valor1 < 10 && valor2 < 10 && valor3<10)
//        print("todos los valores son menores a 10")
//    else
//        print("Alguno o todos los valores no son menores a 10")
//}

