public class Conta {

        private String Conta;
        private int novaConta;
        private String depositar;
        private double sacar;
        private int todasContas;
        private int umaConta;
        private int patrimonioBanco;

    @Override
    public String toString() {
        return "Conta" + "\n" +
                "Conta = " + Conta + "\n" +
                "Nova Conta = " + novaConta + "\n" +
                "Depositar = " + depositar + "\n" +
                "Sacar = " + sacar + "\n" +
                "Mostrar todas as Contas = " + todasContas + "\n" +
                "Uma unica conta Conta = " + umaConta + "\n" +
                "Patrimonio Banco = " + patrimonioBanco + "\n" +
                '}';
    }

    public void setConta(String conta) {
        Conta = conta;
    }

    public int getNovaConta() {
        return novaConta;
    }

    public void setNovaConta(int novaConta) {
        this.novaConta = novaConta;
    }

    public String getDepositar() {
        return depositar;
    }

    public void setDepositar(String depositar) {
        this.depositar = depositar;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public int getTodasContas() {
        return todasContas;
    }

    public void setTodasContas(int todasContas) {
        this.todasContas = todasContas;
    }

    public int getUmaConta() {
        return umaConta;
    }

    public void setUmaConta(int umaConta) {
        this.umaConta = umaConta;
    }

    public int getPatrimonioBanco() {
        return patrimonioBanco;
    }

    public void setPatrimonioBanco(int patrimonioBanco) {
        this.patrimonioBanco = patrimonioBanco;
    }

}
