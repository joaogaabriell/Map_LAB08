class SanduicheBolaComPeru extends Sanduiche {
    @Override
    protected Pao criarPao() {
        return new PaoBola();
    }

    @Override
    protected Queijo criarQueijo() {
        return new QueijoCheddar();
    }

    @Override
    protected Presunto criarPresunto() {
        return new PresuntoPeru();
    }

    @Override
    protected Ovo criarOvo() {
        return new OvoGranja();
    }
}