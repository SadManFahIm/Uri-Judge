import java.util.Scanner;

fun main(args: Array<String>) {
    val leitor = Scanner(System.`in`);
    
    val a: Int = leitor.nextInt();
    val b: Int = leitor.nextInt();
    val prod: Int = a * b;
    
    println("PROD = " + prod);
}
