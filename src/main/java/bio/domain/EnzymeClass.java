package bio.domain;

import java.util.ArrayList;
import java.util.List;

public class EnzymeClass {

    private String ecNumber;
    //Conteúdo do arquivo mergeado por ECx.x.x.x, inclusive o dado do KO no KeggData
    private List<Fasta> fastaList;
    //Lista dos módulos por EC
    private List<KEGGModule> modules;

    public EnzymeClass(){
        super();
    }

    public EnzymeClass(String ecNumber, List<Fasta> fastaList) {
        super();
        this.ecNumber = ecNumber;
        this.fastaList = fastaList;
    }

    public String getEcNumber() {
        return ecNumber;
    }

    public void setEcNumber(String ecNumber) {
        this.ecNumber = ecNumber;
    }

    public List<Fasta> getFastaList() {
        return fastaList;
    }

    public void setFastaList(List<Fasta> fastaList) {
        this.fastaList = fastaList;
    }

    public List<KEGGModule> getModules() {
        if (modules == null)
            modules = new ArrayList<>();
        return modules;
    }

    public void setModules(List<KEGGModule> modules) {
        this.modules = modules;
    }
}
