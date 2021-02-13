/**
 * A lógica da calculadora utiliza um algorítmo de pilhas
 *  analisando expressões infixas para resolver as 
 * precedências dos operadores.
 * 
 * Referências: 
 * - https://en.wikipedia.org/wiki/Shunting-yard_algorithm#:~:text=In%20computer%20science%2C%20the%20shunting,abstract%20syntax%20tree%20(AST).
 * - https://stackoverflow.com/questions/13421424/how-to-evaluate-an-infix-expression-in-just-one-scan-using-stacks
 */


import java.util.Stack;

public class Logica {
    public String resolveOperacao(String operacao){
    Stack<Character> operadores = new Stack<>();
    Stack<Double> numeros = new Stack<>();
    for(int i = 0; i < operacao.length(); i++) {
        char entrada = operacao.charAt(i);
        if(Character.isDigit(entrada) || (entrada =='.')){
            String num = "";
            while (Character.isDigit(entrada) || (entrada =='.')  ) {
                num += entrada;
                i++;
                if(i < operacao.length())
                    entrada = operacao.charAt(i);
                else
                    break;
            }
            i--;
            numeros.push(Double.parseDouble(num));
        }else if(entrada =='('){
            operadores.push(entrada);
        }
        else if(entrada == ')') {
            while(operadores.peek() != '('){
                Double saida = realizaOperacao(numeros, operadores);
                numeros.push(saida);
            }
            operadores.pop();
        }
        else if(confereSeEOperador(entrada)){
            while(!operadores.isEmpty() && confereProcedencia(entrada) <= confereProcedencia(operadores.peek())){
                Double saida = realizaOperacao(numeros, operadores);
                numeros.push(saida);
            }
            operadores.push(entrada);
        }
    }
    while(!operadores.isEmpty()){
        Double saida = realizaOperacao(numeros, operadores);
        numeros.push(saida);
    }
    return String.valueOf(numeros.pop());
    }

    public int confereProcedencia(char entrada){
        if(entrada == '+' || entrada == '-') return 1;
        if(entrada == '/' || entrada == '*') return 2; 
        return -1;
    }

    public boolean confereSeEOperador(char entrada){
        return (entrada == '+' || entrada == '-' || entrada == '/' || entrada == '*' || entrada == '^');
    }

    public Double realizaOperacao(Stack<Double> numeros, Stack<Character> operadores) {
        Double a = numeros.pop();
        Double b = numeros.pop();
        char operation = operadores.pop();
        if(operation == '+')  return a + b;
        if(operation == '-')  return b - a;
        if(operation == '*')  return a * b;
        if(operation == '/')  return b / a;
        return 0D;
    }
}