package com.bea.olp;

public class CCR_M_GROUP_SCORE extends CCR_M_GROUP_SCOREKey {
    private String modelName;

    private String groupName;

    private String groupScore;

    private String scoringManager;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName == null ? null : modelName.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getGroupScore() {
        return groupScore;
    }

    public void setGroupScore(String groupScore) {
        this.groupScore = groupScore == null ? null : groupScore.trim();
    }

    public String getScoringManager() {
        return scoringManager;
    }

    public void setScoringManager(String scoringManager) {
        this.scoringManager = scoringManager == null ? null : scoringManager.trim();
    }
}