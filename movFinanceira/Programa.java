package movFinanceira;

public class Programa {
    private static MovimentacaoFinanceira mf1;
    private static MovimentacaoFinanceira mf2;
    private static MovimentacaoFinanceira mf3;
    private static MovimentacaoFinanceira mf4;
    private static Extrato ext;

    public static void main(String[] args) {
        ext = new Extrato();
        mf1 = new Despesa(8,2,2018,"15:30", 500, "012.345.678/0001-10",3);
        ext.registraEmExtrato(mf1);
        System.out.print(mf1);
        mf2 = new Despesa(9,4,2018,"13:49", 700, "765.432.109/0001-10",1);
        ext.registraEmExtrato(mf2);
        System.out.print(mf2);
        mf3 = new Receita(10,6,2018,"09:28", 1500, "123.456.789-0","Debito");
        ext.registraEmExtrato(mf3);
        System.out.print(mf3);
        mf4 = new Receita(11,10,2018,"17:00", 1000, "098.765.432-1","Dinheiro");
        ext.registraEmExtrato(mf4);
        System.out.print(mf4);
    }
}
