package bio.domain;

import java.util.ArrayList;
import java.util.List;

public class KEGGModule {


    private String module;
    private List<String> kosFromEC;
    private List<String> kos;
    private boolean isComplete;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public List<String> getKos() {
        if (kos == null)
            kos = new ArrayList<String>();
        return kos;
    }

    public void setKos(List<String> kos) {
        this.kos = kos;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public List<String> getKosFromEC() {
        if (kosFromEC == null)
            kosFromEC = new ArrayList<String>();
        return kosFromEC;
    }

    public void setKosFromEC(List<String> kosFromEC) {
        this.kosFromEC = kosFromEC;
    }
}
