package com.bea.olp;

public class CCR_MODEL_SCORE extends CCR_MODEL_SCOREKey {
    private String modelName;

    private String serno;

    private String allScore;

    private String scoringManager;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getSerno() {
        return serno;
    }

    public void setSerno(String serno) {
        this.serno = serno == null ? null : serno.trim();
    }

    public String getAllScore() {
        return allScore;
    }

    public void setAllScore(String allScore) {
        this.allScore = allScore == null ? null : allScore.trim();
    }

    public String getScoringManager() {
        return scoringManager;
    }

    public void setScoringManager(String scoringManager) {
        this.scoringManager = scoringManager == null ? null : scoringManager.trim();
    }
}