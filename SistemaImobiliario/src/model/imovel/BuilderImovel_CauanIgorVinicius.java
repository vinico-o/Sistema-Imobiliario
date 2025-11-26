package imovel;

public class BuilderImovel_CauanIgorVinicius {

    public BuilderImovel_CauanIgorVinicius(){

    }

    public static CasaResidencial_CauanIgorVinicius casaPequena(){
        CasaResidencial_CauanIgorVinicius casaResidencial = new CasaResidencial_CauanIgorVinicius();
        
        casaResidencial.areaTotal = 70;
        casaResidencial.areaConstruida = 70;
        casaResidencial.qtdDormitorios = 3;
        casaResidencial.qtdBanheiros = 2;
        casaResidencial.qtdsVagasGaragem = 2;
        casaResidencial.valorIPTU = 300;
        casaResidencial.valorVenda = 150000;
        casaResidencial.valorAluguel = 2900;
        casaResidencial.isDisponivel = true;

        return casaResidencial;
    }

    public static CasaResidencial_CauanIgorVinicius casaGrande(){
        CasaResidencial_CauanIgorVinicius casaResidencial = new CasaResidencial_CauanIgorVinicius();
        
        casaResidencial.areaTotal = 120;
        casaResidencial.areaConstruida = 120;
        casaResidencial.qtdDormitorios = 5;
        casaResidencial.qtdBanheiros = 5;
        casaResidencial.qtdsVagasGaragem = 4;
        casaResidencial.valorIPTU = 1000;
        casaResidencial.valorVenda = 975000;
        casaResidencial.valorAluguel = 6000;
        casaResidencial.isDisponivel = true;

        return casaResidencial;
    }

    public static Comercial_CauanIgorVinicius comercioPequeno(){
        Comercial_CauanIgorVinicius comercio = new Comercial_CauanIgorVinicius();

        comercio.areaTotal = 70;
        comercio.areaConstruida = 70;
        comercio.qtdDormitorios = 1;
        comercio.qtdBanheiros = 1;
        comercio.qtdsVagasGaragem = 1;
        comercio.valorIPTU = 400;
        comercio.valorVenda = 100000;
        comercio.valorAluguel = 1700;
        comercio.isDisponivel = true;
        comercio.taxaImpostoFederal = 30;


        return comercio;
    }

    public static Comercial_CauanIgorVinicius comercioGrande(){
        Comercial_CauanIgorVinicius comercio = new Comercial_CauanIgorVinicius();

        comercio.areaTotal = 120;
        comercio.areaConstruida = 120;
        comercio.qtdDormitorios = 2;
        comercio.qtdBanheiros = 3;
        comercio.qtdsVagasGaragem = 10;
        comercio.valorIPTU = 1000;
        comercio.valorVenda = 200000;
        comercio.valorAluguel = 2900;
        comercio.isDisponivel = true;
        comercio.taxaImpostoFederal = 45;


        return comercio;
    }

    public static PredioResidencial_CauanIgorVinicius predioPequeno()
    {
        PredioResidencial_CauanIgorVinicius predio = new PredioResidencial_CauanIgorVinicius();

        predio.areaTotal = 70;
        predio.areaConstruida = 70;
        predio.qtdDormitorios = 2;
        predio.qtdBanheiros = 1;
        predio.qtdsVagasGaragem = 2;
        predio.valorIPTU = 1000;
        predio.valorVenda = 100000;
        predio.valorAluguel = 2100;
        predio.isDisponivel = true;
        predio.valorCondominio = 300;


        return predio;
    }

    public static PredioResidencial_CauanIgorVinicius predioGrande()
    {
        PredioResidencial_CauanIgorVinicius predio = new PredioResidencial_CauanIgorVinicius();

        predio.areaTotal = 120;
        predio.areaConstruida = 120;
        predio.qtdDormitorios = 4;
        predio.qtdBanheiros = 3;
        predio.qtdsVagasGaragem = 5;
        predio.valorIPTU = 2500;
        predio.valorVenda = 1000000;
        predio.valorAluguel = 3000;
        predio.isDisponivel = true;
        predio.valorCondominio = 300;


        return predio;
    }


}
