package bio.domain;

public class Fasta {

    //ex: aca:ACAC_0001396701-mRNA-1
    private String proteinId;
    //ex: EC_1.1.1.1.pep.fasta_1
    private String blastHit;
    //Dado que representa o hit entre Kegg e Blast, que usamos para buscar os KOs no KEGG
    //ex: nev:NTE_03440
    private String entryKeggBlastHit;
    //ex: 00 2e-10
    private String eValue;
    //Tem as informações do KEGG, inclusive do KO
    private KEGGData keggData;

    public String getProteinId() {
        return proteinId;
    }

    public void setProteinId(String proteinId) {
        this.proteinId = proteinId;
    }

    public String getBlastHit() {
        return blastHit;
    }

    public void setBlastHit(String blastHit) {
        this.blastHit = blastHit;
    }

    public String getEntryKeggBlastHit() {
        return entryKeggBlastHit;
    }

    public void setEntryKeggBlastHit(String entryKeggBlastHit) {
        this.entryKeggBlastHit = entryKeggBlastHit;
    }

    public String geteValue() {
        return eValue;
    }

    public void seteValue(String eValue) {
        this.eValue = eValue;
    }

    public KEGGData getKeggData() {
        return keggData;
    }

    public void setKeggData(KEGGData keggData) {
        this.keggData = keggData;
    }
}
