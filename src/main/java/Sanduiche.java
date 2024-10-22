abstract class Sanduiche {
    protected abstract Pao criarPao();
    protected abstract Queijo criarQueijo();
    protected abstract Presunto criarPresunto();
    protected abstract Ovo criarOvo();

    public void montarSanduiche() {
        System.out.println("Montando sanduíche com:");
        System.out.println(criarPao().tipoPao());
        System.out.println(criarQueijo().tipoQueijo());
        System.out.println(criarPresunto().tipoPresunto());
        System.out.println(criarOvo().tipoOvo());
        System.out.println("Tomate");
        System.out.println();
    }
}