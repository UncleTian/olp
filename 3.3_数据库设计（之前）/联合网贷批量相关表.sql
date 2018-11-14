/*----------------------------------------------- 批量相关表 -----------------------------------------*/
select * from bat_task_run;
select * from bat_task_cfg;
select * from bat_event_cfg;
select * from bat_transfer_cfg;

/*----------------------------------------------- 流水号相关表 -----------------------------------------*/

select * from biz_cbm_seq_loan where channel_type = 'JD';
select * from biz_cbm_seq_loan_repay where channel_type = 'JD';
select * from biz_cbm_seq_loan_replan where channel_type = 'JD';

/*----------------------------------------------- 蚂蚁批量相关表 -------------------------------------*/

select * from   biz_ant_accounting;--蚂蚁借呗汇总记账文件
select * from   bat_ant_accounting_his;
select * from   bat_ant_accounting_temp;

select * from   biz_ant_arg_status_change;--蚂蚁合约形态转移流水表
select * from   BAT_ANT_ARG_STATUS_CHANGE_temp;
select * from   BAT_ANT_ARG_STATUS_CHANGE_his;

select * from   biz_ant_exempt_instmnt_detail;--借呗减免（分期）明细表
select * from   BAT_ANT_EXEMPT_INSTMNT_dt_his;
select * from   BAT_ANT_EXEMPT_INSTMNT_dt_temp;

select * from   biz_ant_exempt_loan_detail;--借呗减免（合约）明细表
select * from   bat_ant_exempt_loan_dt_his;
select * from   bat_ant_exempt_loan_dt_temp;

select * from   biz_ant_fund_detail;--蚂蚁网商银行资金对账表
select * from   bat_ant_fund_detail_his;
select * from   bat_ant_fund_detail_temp;

select * from   biz_ant_instmnt_init;--蚂蚁借呗日初（分期）信息表
select * from   bat_ant_instmnt_init_his;
select * from   bat_ant_instmnt_init_temp;

select * from   biz_ant_lending_detail;--蚂蚁借呗在途支用明细表
select * from   bat_ant_lending_detail_his;
select * from   bat_ant_lending_detail_temp;

select * from   biz_ant_loan_calc;--蚂蚁借呗利息计提明细表
select * from   bat_ant_loan_calc_his;
select * from   bat_ant_loan_calc_temp;

select * from   biz_ant_loan_detail;--蚂蚁借呗放款（合约）明细表
select * from   bat_ant_loan_detail_his;
select * from   bat_ant_loan_detail_temp;

select * from   biz_ant_loan_init;--蚂蚁借呗日初（合约）信息表
select * from   bat_ant_loan_init_his;
select * from   bat_ant_loan_init_temp;

select * from   biz_ant_repay_instmnt_detail;--蚂蚁借呗还款（分期）信息表
select * from  bat_ant_repay_instmnt_dt_his;
select * from  bat_ant_repay_instmnt_dt_temp;

select * from   biz_ant_repay_loan_detail;--蚂蚁借呗还款（合约）明细表
select * from   bat_ant_repay_loan_detail_his;
select * from   bat_ant_repay_loan_detail_temp;

select * from   biz_ant_repay_plan;--蚂蚁借呗放款（分期）明细文件
select * from   bat_ant_repay_plan_his;
select * from   bat_ant_repay_plan_temp;


/*------------------------------------------------ 小米批量相关表 ---------------------------------------*/

select * from biz_xw_file_num;--新网当日各文件数据总数量
select * from BAT_XW_FILE_NUM_TEMP;
select * from BAT_XW_FILE_NUM_HIS;

select * from biz_xw_bal_tol;--新网日总额核对台账
select * from bat_xw_bal_tol_TEMP;
select * from bat_xw_bal_tol_HIS;

select * from biz_xw_bfj_flow;--新网备付金流水
select * from bat_xw_bfj_flow_TEMP;
select * from bat_xw_bfj_flow_HIS;

select * from biz_xw_bfj_sum;--新网备付金总金额
select * from bat_xw_bfj_sum_TEMP;
select * from bat_xw_bfj_sum_HIS;

select * from biz_xw_crd_cont_info;--新网额度信息表
select * from bat_xw_crd_cont_info_TEMP;
select * from bat_xw_crd_cont_info_HIS;

select * from biz_xw_cust_info;--新网客户信息表
select * from bat_xw_cust_info_TEMP;
select * from bat_xw_cust_info_HIS;

select * from biz_xw_ds_accounting_flow;--新网会计分录日报
select * from bat_xw_ds_accounting_flow_TEMP;
select * from bat_xw_ds_accounting_flow_HIS;

select * from biz_xw_fee;--扣费明细表
select * from bat_xw_fee_TEMP;
select * from bat_xw_fee_HIS;

select * from biz_xw_repay_detail;--新网还款明细表
select * from bat_xw_repay_detail_TEMP;
select * from bat_xw_repay_detail_his;

select * from biz_xw_repay_plan;--新网还款计划表
select * from bat_xw_repay_plan_TEMP;
select * from bat_xw_repay_plan_HIS;

select * from biz_xw_rev_trans;--新网冲正类交易
select * from bat_xw_rev_trans_his;
select * from bat_xw_rev_trans_TEMp;

select * from biz_xw_special_tran;--特殊交易
select * from bat_xw_special_tran_TEMP;
select * from bat_xw_special_tran_HIS;

select * from biz_xw_loan_info;--贷款信息表
select * from bat_xw_loan_info_HIS;
select * from bat_xw_loan_info_TEMP;


/*------------------------------------------------ 京东批量相关表 ---------------------------------------*/

select * from bat_jd_loan_total_temp;--总账信息表
select * from bat_jd_loan_total_his;
select * from biz_jd_loan_total;


select * from bat_jd_cus_temp;-- 客户信息表
select * from bat_jd_cus_his;
select * from biz_jd_cus;

select * from BAT_JD_CUSCREDIT_TEMP;--授信额度信息表
select * from BAT_JD_CUSCREDIT_HIS;
select * from BIZ_JD_CUSCREDIT;

select * from BAT_JD_QUOTAADJUST_TEMP;-- 调额信息临时表
select * from BAT_JD_QUOTAADJUST_HIS;
select * from BIZ_JD_QUOTAADJUST;

select * from BAT_JD_LOAN_TEMP;-- 贷款借据信息临时表
select * from BAT_JD_LOAN_HIS;
select * from BIZ_JD_LOAN;

select * from BAT_JD_REPAY_PLAN_TEMP;-- 还款计划信息临时表
select * from BAT_JD_REPAY_PLAN_HIS;
select * from BIZ_JD_REPAY_PLAN;

select * from BAT_JD_REPAY_FLOW_TEMP;-- 还款明细信息临时表
select * from BAT_JD_REPAY_FLOW_HIS;
select * from BIZ_JD_REPAY_FLOW;


/*------------------------------------------------------ CBM批量相关表 -------------------------------------*/

/* ---------------- MY - CBM -----------------*/

select * from BAT_CBM_ACCT_LOAN BCA WHERE BCA.DATA_DATE = '2018-08-21' AND BCA.CHANNEL_TYPE = 'MY';--CBM借据表

select * from BAT_CBM_CONTRACT_INFO BCC WHERE BCC.DATA_DATE = '2018-08-21' AND BCC.CHANNEL_TYPE = 'MY';--CBM合同信息表

select * from BAT_CBM_LOAN_APPLY BCL WHERE BCL.DATA_DATE = '2018-08-21' AND BCL.CHANNEL_TYPE = 'MY';--CBM放款申请表

select * from BAT_CBM_RATE_ZONE BCR WHERE BCR.DATA_DATE = '2018-08-21' AND BCR.CHANNEL_TYPE = 'MY';--CBM利率区段表

select * from BAT_CBM_REPAY_METHOD_ZONE BCZ WHERE BCZ.DATA_DATE = '2018-08-21' AND BCZ.CHANNEL_TYPE = 'MY';--CBM还款方式区段表

select * from BAT_CBM_REPAY_PLAN BCP WHERE BCP.DATA_DATE = '2018-08-21' AND BCP.CHANNEL_TYPE = 'MY';--CBM还款计划表

select * from BAT_CBM_REPAY_TRAN_BILL_INFO BCI WHERE BCI.DATA_DATE = '2018-08-21' AND BCI.CHANNEL_TYPE = 'MY';--CBM还款交易单据信息表

select * from BAT_CBM_REPAY_SPLIT_DET BCD WHERE BCD.DATA_DATE = '2018-08-21' AND BCD.CHANNEL_TYPE = 'MY';--CBM还款拆分明细

select * from BAT_CBM_TRAN_INFO BCT WHERE BCT.DATA_DATE = '2018-08-21' AND BCT.CHANNEL_TYPE = 'MY';--CBM交易信息表

select * from BAT_CBM_CUS_BASE BCB WHERE BCB.DATA_DATE = '2018-08-21' AND BCB.CLIENT_SOURCE = 'MY'; -- CBM客户基本信息

select * from BAT_CBM_CUS_INDIV BCCI WHERE BCCI.DATA_DATE = '2018-08-21' AND BCCI.CHANNEL_TYPE = 'MY'; -- CBM客户信息表

select * from BAT_CBM_BFJ_BAL_DET BCBB WHERE BCBB.DATA_DATE = '2018-08-21' AND BCBB.CHANNEL_TYPE = 'MY'; -- CBM备付金余额记录表

select * from BAT_CBM_RECON_DET BCRD WHERE BCRD.DATA_DATE = '2018-08-21' AND BCRD.CHANNEL_TYPE = 'MY'; -- CBM对账明细表


/* ---------------- XW - CBM -----------------*/

select * from BAT_CBM_ACCT_LOAN BCA WHERE BCA.DATA_DATE = '2018-08-21' AND BCA.CHANNEL_TYPE = 'XW';--CBM借据表

select * from BAT_CBM_CONTRACT_INFO BCC WHERE BCC.DATA_DATE = '2018-08-21' AND BCC.CHANNEL_TYPE = 'XW';--CBM合同信息表

select * from BAT_CBM_LOAN_APPLY BCL WHERE BCL.DATA_DATE = '2018-08-21' AND BCL.CHANNEL_TYPE = 'XW';--CBM放款申请表

select * from BAT_CBM_RATE_ZONE BCR WHERE BCR.DATA_DATE = '2018-08-21' AND BCR.CHANNEL_TYPE = 'XW';--CBM利率区段表

select * from BAT_CBM_REPAY_METHOD_ZONE BCZ WHERE BCZ.DATA_DATE = '2018-08-21' AND BCZ.CHANNEL_TYPE = 'XW';--CBM还款方式区段表

select * from BAT_CBM_REPAY_PLAN BCP WHERE BCP.DATA_DATE = '2018-08-21' AND BCP.CHANNEL_TYPE = 'XW';--CBM还款计划表

select * from BAT_CBM_REPAY_TRAN_BILL_INFO BCI WHERE BCI.DATA_DATE = '2018-08-21' AND BCI.CHANNEL_TYPE = 'XW';--CBM还款交易单据信息表

select * from BAT_CBM_REPAY_SPLIT_DET BCD WHERE BCD.DATA_DATE = '2018-08-21' AND BCD.CHANNEL_TYPE = 'XW';--CBM还款拆分明细

select * from BAT_CBM_TRAN_INFO BCT WHERE BCT.DATA_DATE = '2018-08-21' AND BCT.CHANNEL_TYPE = 'XW';--CBM交易信息表

select * from BAT_CBM_CUS_BASE BCB WHERE BCB.DATA_DATE = '2018-08-21' AND BCB.CLIENT_SOURCE = 'XW'; -- CBM客户基本信息

select * from BAT_CBM_CUS_INDIV BCCI WHERE BCCI.DATA_DATE = '2018-08-21' AND BCCI.CHANNEL_TYPE = 'XW'; -- CBM客户信息表

select * from BAT_CBM_BFJ_BAL_DET BCBB WHERE BCBB.DATA_DATE = '2018-08-21' AND BCBB.CHANNEL_TYPE = 'XW'; -- CBM备付金余额记录表

select * from BAT_CBM_RECON_DET BCRD WHERE BCRD.DATA_DATE = '2018-08-20' AND BCRD.CHANNEL_TYPE = 'XW'; -- CBM对账明细表


/* ---------------- JD - CBM -----------------*/

select * from BAT_CBM_ACCT_LOAN BCA WHERE BCA.DATA_DATE = '2017-10-11' AND BCA.CHANNEL_TYPE = 'JD';--CBM借据表

select * from BAT_CBM_CONTRACT_INFO BCC WHERE BCC.DATA_DATE = '2017-10-11' AND BCC.CHANNEL_TYPE = 'JD';--CBM合同信息表

select * from BAT_CBM_LOAN_APPLY BCL WHERE BCL.DATA_DATE = '2017-10-11' AND BCL.CHANNEL_TYPE = 'JD';--CBM放款申请表

select * from BAT_CBM_RATE_ZONE BCR WHERE BCR.DATA_DATE = '2017-10-11' AND BCR.CHANNEL_TYPE = 'JD';--CBM利率区段表

select * from BAT_CBM_REPAY_METHOD_ZONE BCZ WHERE BCZ.DATA_DATE = '2017-10-11' AND BCZ.CHANNEL_TYPE = 'JD';--CBM还款方式区段表

select * from BAT_CBM_REPAY_PLAN BCP WHERE BCP.DATA_DATE = '2017-10-11' AND BCP.CHANNEL_TYPE = 'JD';--CBM还款计划表

select * from BAT_CBM_REPAY_TRAN_BILL_INFO BCI WHERE BCI.DATA_DATE = '2017-10-11' AND BCI.CHANNEL_TYPE = 'JD';--CBM还款交易单据信息表

select * from BAT_CBM_REPAY_SPLIT_DET BCD WHERE BCD.DATA_DATE = '2017-10-11' AND BCD.CHANNEL_TYPE = 'JD';--CBM还款拆分明细

select * from BAT_CBM_TRAN_INFO BCT WHERE BCT.DATA_DATE = '2017-10-11' AND BCT.CHANNEL_TYPE = 'JD';--CBM交易信息表

select * from BAT_CBM_CUS_BASE BCB WHERE BCB.DATA_DATE = '2017-10-11' AND BCB.CLIENT_SOURCE = 'JD'; -- CBM客户基本信息

select * from BAT_CBM_CUS_INDIV BCCI WHERE BCCI.DATA_DATE = '2017-10-11' AND BCCI.CHANNEL_TYPE = 'JD'; -- CBM客户信息表

select * from BAT_CBM_BFJ_BAL_DET BCBB WHERE BCBB.DATA_DATE = '2017-10-11' AND BCBB.CHANNEL_TYPE = 'JD'; -- CBM备付金余额记录表

select * from BAT_CBM_RECON_DET BCRD WHERE BCRD.DATA_DATE = '2017-10-11' AND BCRD.CHANNEL_TYPE = 'JD'; -- CBM对账明细表
