package com.bea.olp;

public class CCR_G_IND_SCORE extends CCR_G_IND_SCOREKey {
    private String indexSeq;

    private String groupName;

    private String indexName;

    private String indexValue;

    private String indexScore;

    private String scoringManager;

    private String indOrgVal;

    public String getIndexSeq() {
        return indexSeq;
    }

    public void setIndexSeq(String indexSeq) {
        this.indexSeq = indexSeq == null ? null : indexSeq.trim();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    public String getIndexValue() {
        return indexValue;
    }

    public void setIndexValue(String indexValue) {
        this.indexValue = indexValue == null ? null : indexValue.trim();
    }

    public String getIndexScore() {
        return indexScore;
    }

    public void setIndexScore(String indexScore) {
        this.indexScore = indexScore == null ? null : indexScore.trim();
    }

    public String getScoringManager() {
        return scoringManager;
    }

    public void setScoringManager(String scoringManager) {
        this.scoringManager = scoringManager == null ? null : scoringManager.trim();
    }

    public String getIndOrgVal() {
        return indOrgVal;
    }

    public void setIndOrgVal(String indOrgVal) {
        this.indOrgVal = indOrgVal == null ? null : indOrgVal.trim();
    }
}