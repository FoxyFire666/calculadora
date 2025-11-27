package calculadora;

public class Teste_Calculadora {
    Calculadora calc = new Calculadora();

    // Testes rapidos
    calc.calc(a: 2, b: 3, op:"+"); // esperado: 5
    calc.calc(a: 10, b: 4, op: "-"); // esperado 6
    calc.calc(a: 3, b: 5, op: "*"); // esperado 15
    calc.calc(a: 8, b: 2, op: "/"); // esperado 4
    calc.calc(a: 8, b: 0, op: "/"); // esperado divisão por zero
    calc.calc(a: 5, b: 5, op: "x"); // operação inválida
}
