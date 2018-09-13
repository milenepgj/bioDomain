package bio.domain;

public class Fasta {

    private String proteinId;
    private String blastHit;
    //Dado que representa o hit entre Kegg e Blast, que usamos para buscar os KOs no KEGG
    private String entryKeggBlastHit;
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
}
