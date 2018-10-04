package bio.domain;

import java.util.ArrayList;
import java.util.List;

public class Organism {

    private String name;
    //Conteúdo dos arquivos que foram mergeados por número de ECx.x.x.x
    private List<EnzymeClass> ecList;
    private List<ProteinData> proteinDataList;

    public Organism(){
        super();
    }

    public Organism(String name, List<EnzymeClass> ecList, List<ProteinData> proteinDataList) {
        super();
        this.name = name;
        this.ecList = ecList;
        this.proteinDataList = proteinDataList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EnzymeClass> getEcList() {
        if (ecList == null)
            ecList = new ArrayList<>();
        return ecList;
    }

    public void setEcList(List<EnzymeClass> ecList) {
        this.ecList = ecList;
    }

    public List<ProteinData> getProteinDataList() {
        return proteinDataList;
    }

    public void setProteinDataList(List<ProteinData> proteinDataList) {
        this.proteinDataList = proteinDataList;
    }
}
