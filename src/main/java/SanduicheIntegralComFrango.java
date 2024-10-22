class SanduicheIntegralComFrango extends Sanduiche {
    @Override
    protected Pao criarPao() {
        return new PaoIntegral();
    }

    @Override
    protected Queijo criarQueijo() {
        return new QueijoPrato();
    }

    @Override
    protected Presunto criarPresunto() {
        return new PresuntoFrango();
    }

    @Override
    protected Ovo criarOvo() {
        return new OvoGranja();
    }
}