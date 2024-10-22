class SanduicheFrancesComPeru extends Sanduiche {
    @Override
    protected Pao criarPao() {
        return new PaoFrances();
    }

    @Override
    protected Queijo criarQueijo() {
        return new QueijoMussarela();
    }

    @Override
    protected Presunto criarPresunto() {
        return new PresuntoPeru();
    }

    @Override
    protected Ovo criarOvo() {
        return new OvoCapoeira();
    }
}