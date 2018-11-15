package com.bea.olp;

import java.math.BigDecimal;

public class BAT_CBM_ACCT_LOAN {
    private String serialno;

    private String netserialno;

    private String contractserialno;

    private String businesstype;

    private String currency;

    private BigDecimal businesssum;

    private String putoutdate;

    private String maturitydate;

    private String operateorgid;

    private String accountingorgid;

    private String loanstatus;

    private String finishdate;

    private String businessdate;

    private BigDecimal overduedays;

    private String putoutserialno;

    private String autopayflag;

    private String regroupflag;

    private String repayfreezetype;

    private String repayfreezenum;

    private String repayaccountname;

    private String repayaccount;

    private String firstrepaydate;

    private BigDecimal normalbalance;

    private BigDecimal overduebalance;

    private BigDecimal interestoverduedays;

    private String sortlongflag;

    private String areaFlag;

    private String counterparty;

    private BigDecimal interestamt;

    private BigDecimal principalpenaltyamt;

    private BigDecimal graceperiod;

    private String cnyBusinessUnit;

    private String repaytype;

    private String repayfrequency;

    private String ratechoicetype;

    private BigDecimal executerate;

    private BigDecimal maxprincipaloverduedays;

    private BigDecimal maxinterestoverduedays;

    private String principaloverduedate;

    private String interestoverduedate;

    private String interestdate;

    private String departmentid;

    private String customerid;

    private String customername;

    private String inputDate;

    private String inputTime;

    private String dataDate;

    private String channelType;

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno == null ? null : serialno.trim();
    }

    public String getNetserialno() {
        return netserialno;
    }

    public void setNetserialno(String netserialno) {
        this.netserialno = netserialno == null ? null : netserialno.trim();
    }

    public String getContractserialno() {
        return contractserialno;
    }

    public void setContractserialno(String contractserialno) {
        this.contractserialno = contractserialno == null ? null : contractserialno.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getBusinesssum() {
        return businesssum;
    }

    public void setBusinesssum(BigDecimal businesssum) {
        this.businesssum = businesssum;
    }

    public String getPutoutdate() {
        return putoutdate;
    }

    public void setPutoutdate(String putoutdate) {
        this.putoutdate = putoutdate == null ? null : putoutdate.trim();
    }

    public String getMaturitydate() {
        return maturitydate;
    }

    public void setMaturitydate(String maturitydate) {
        this.maturitydate = maturitydate == null ? null : maturitydate.trim();
    }

    public String getOperateorgid() {
        return operateorgid;
    }

    public void setOperateorgid(String operateorgid) {
        this.operateorgid = operateorgid == null ? null : operateorgid.trim();
    }

    public String getAccountingorgid() {
        return accountingorgid;
    }

    public void setAccountingorgid(String accountingorgid) {
        this.accountingorgid = accountingorgid == null ? null : accountingorgid.trim();
    }

    public String getLoanstatus() {
        return loanstatus;
    }

    public void setLoanstatus(String loanstatus) {
        this.loanstatus = loanstatus == null ? null : loanstatus.trim();
    }

    public String getFinishdate() {
        return finishdate;
    }

    public void setFinishdate(String finishdate) {
        this.finishdate = finishdate == null ? null : finishdate.trim();
    }

    public String getBusinessdate() {
        return businessdate;
    }

    public void setBusinessdate(String businessdate) {
        this.businessdate = businessdate == null ? null : businessdate.trim();
    }

    public BigDecimal getOverduedays() {
        return overduedays;
    }

    public void setOverduedays(BigDecimal overduedays) {
        this.overduedays = overduedays;
    }

    public String getPutoutserialno() {
        return putoutserialno;
    }

    public void setPutoutserialno(String putoutserialno) {
        this.putoutserialno = putoutserialno == null ? null : putoutserialno.trim();
    }

    public String getAutopayflag() {
        return autopayflag;
    }

    public void setAutopayflag(String autopayflag) {
        this.autopayflag = autopayflag == null ? null : autopayflag.trim();
    }

    public String getRegroupflag() {
        return regroupflag;
    }

    public void setRegroupflag(String regroupflag) {
        this.regroupflag = regroupflag == null ? null : regroupflag.trim();
    }

    public String getRepayfreezetype() {
        return repayfreezetype;
    }

    public void setRepayfreezetype(String repayfreezetype) {
        this.repayfreezetype = repayfreezetype == null ? null : repayfreezetype.trim();
    }

    public String getRepayfreezenum() {
        return repayfreezenum;
    }

    public void setRepayfreezenum(String repayfreezenum) {
        this.repayfreezenum = repayfreezenum == null ? null : repayfreezenum.trim();
    }

    public String getRepayaccountname() {
        return repayaccountname;
    }

    public void setRepayaccountname(String repayaccountname) {
        this.repayaccountname = repayaccountname == null ? null : repayaccountname.trim();
    }

    public String getRepayaccount() {
        return repayaccount;
    }

    public void setRepayaccount(String repayaccount) {
        this.repayaccount = repayaccount == null ? null : repayaccount.trim();
    }

    public String getFirstrepaydate() {
        return firstrepaydate;
    }

    public void setFirstrepaydate(String firstrepaydate) {
        this.firstrepaydate = firstrepaydate == null ? null : firstrepaydate.trim();
    }

    public BigDecimal getNormalbalance() {
        return normalbalance;
    }

    public void setNormalbalance(BigDecimal normalbalance) {
        this.normalbalance = normalbalance;
    }

    public BigDecimal getOverduebalance() {
        return overduebalance;
    }

    public void setOverduebalance(BigDecimal overduebalance) {
        this.overduebalance = overduebalance;
    }

    public BigDecimal getInterestoverduedays() {
        return interestoverduedays;
    }

    public void setInterestoverduedays(BigDecimal interestoverduedays) {
        this.interestoverduedays = interestoverduedays;
    }

    public String getSortlongflag() {
        return sortlongflag;
    }

    public void setSortlongflag(String sortlongflag) {
        this.sortlongflag = sortlongflag == null ? null : sortlongflag.trim();
    }

    public String getAreaFlag() {
        return areaFlag;
    }

    public void setAreaFlag(String areaFlag) {
        this.areaFlag = areaFlag == null ? null : areaFlag.trim();
    }

    public String getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(String counterparty) {
        this.counterparty = counterparty == null ? null : counterparty.trim();
    }

    public BigDecimal getInterestamt() {
        return interestamt;
    }

    public void setInterestamt(BigDecimal interestamt) {
        this.interestamt = interestamt;
    }

    public BigDecimal getPrincipalpenaltyamt() {
        return principalpenaltyamt;
    }

    public void setPrincipalpenaltyamt(BigDecimal principalpenaltyamt) {
        this.principalpenaltyamt = principalpenaltyamt;
    }

    public BigDecimal getGraceperiod() {
        return graceperiod;
    }

    public void setGraceperiod(BigDecimal graceperiod) {
        this.graceperiod = graceperiod;
    }

    public String getCnyBusinessUnit() {
        return cnyBusinessUnit;
    }

    public void setCnyBusinessUnit(String cnyBusinessUnit) {
        this.cnyBusinessUnit = cnyBusinessUnit == null ? null : cnyBusinessUnit.trim();
    }

    public String getRepaytype() {
        return repaytype;
    }

    public void setRepaytype(String repaytype) {
        this.repaytype = repaytype == null ? null : repaytype.trim();
    }

    public String getRepayfrequency() {
        return repayfrequency;
    }

    public void setRepayfrequency(String repayfrequency) {
        this.repayfrequency = repayfrequency == null ? null : repayfrequency.trim();
    }

    public String getRatechoicetype() {
        return ratechoicetype;
    }

    public void setRatechoicetype(String ratechoicetype) {
        this.ratechoicetype = ratechoicetype == null ? null : ratechoicetype.trim();
    }

    public BigDecimal getExecuterate() {
        return executerate;
    }

    public void setExecuterate(BigDecimal executerate) {
        this.executerate = executerate;
    }

    public BigDecimal getMaxprincipaloverduedays() {
        return maxprincipaloverduedays;
    }

    public void setMaxprincipaloverduedays(BigDecimal maxprincipaloverduedays) {
        this.maxprincipaloverduedays = maxprincipaloverduedays;
    }

    public BigDecimal getMaxinterestoverduedays() {
        return maxinterestoverduedays;
    }

    public void setMaxinterestoverduedays(BigDecimal maxinterestoverduedays) {
        this.maxinterestoverduedays = maxinterestoverduedays;
    }

    public String getPrincipaloverduedate() {
        return principaloverduedate;
    }

    public void setPrincipaloverduedate(String principaloverduedate) {
        this.principaloverduedate = principaloverduedate == null ? null : principaloverduedate.trim();
    }

    public String getInterestoverduedate() {
        return interestoverduedate;
    }

    public void setInterestoverduedate(String interestoverduedate) {
        this.interestoverduedate = interestoverduedate == null ? null : interestoverduedate.trim();
    }

    public String getInterestdate() {
        return interestdate;
    }

    public void setInterestdate(String interestdate) {
        this.interestdate = interestdate == null ? null : interestdate.trim();
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid == null ? null : departmentid.trim();
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid == null ? null : customerid.trim();
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public String getInputTime() {
        return inputTime;
    }

    public void setInputTime(String inputTime) {
        this.inputTime = inputTime == null ? null : inputTime.trim();
    }

    public String getDataDate() {
        return dataDate;
    }

    public void setDataDate(String dataDate) {
        this.dataDate = dataDate == null ? null : dataDate.trim();
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }
}