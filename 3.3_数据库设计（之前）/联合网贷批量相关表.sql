/*----------------------------------------------- ������ر� -----------------------------------------*/
select * from bat_task_run;
select * from bat_task_cfg;
select * from bat_event_cfg;
select * from bat_transfer_cfg;

/*----------------------------------------------- ��ˮ����ر� -----------------------------------------*/

select * from biz_cbm_seq_loan where channel_type = 'JD';
select * from biz_cbm_seq_loan_repay where channel_type = 'JD';
select * from biz_cbm_seq_loan_replan where channel_type = 'JD';

/*----------------------------------------------- ����������ر� -------------------------------------*/

select * from   biz_ant_accounting;--���Ͻ��»��ܼ����ļ�
select * from   bat_ant_accounting_his;
select * from   bat_ant_accounting_temp;

select * from   biz_ant_arg_status_change;--���Ϻ�Լ��̬ת����ˮ��
select * from   BAT_ANT_ARG_STATUS_CHANGE_temp;
select * from   BAT_ANT_ARG_STATUS_CHANGE_his;

select * from   biz_ant_exempt_instmnt_detail;--���¼��⣨���ڣ���ϸ��
select * from   BAT_ANT_EXEMPT_INSTMNT_dt_his;
select * from   BAT_ANT_EXEMPT_INSTMNT_dt_temp;

select * from   biz_ant_exempt_loan_detail;--���¼��⣨��Լ����ϸ��
select * from   bat_ant_exempt_loan_dt_his;
select * from   bat_ant_exempt_loan_dt_temp;

select * from   biz_ant_fund_detail;--�������������ʽ���˱�
select * from   bat_ant_fund_detail_his;
select * from   bat_ant_fund_detail_temp;

select * from   biz_ant_instmnt_init;--���Ͻ����ճ������ڣ���Ϣ��
select * from   bat_ant_instmnt_init_his;
select * from   bat_ant_instmnt_init_temp;

select * from   biz_ant_lending_detail;--���Ͻ�����;֧����ϸ��
select * from   bat_ant_lending_detail_his;
select * from   bat_ant_lending_detail_temp;

select * from   biz_ant_loan_calc;--���Ͻ�����Ϣ������ϸ��
select * from   bat_ant_loan_calc_his;
select * from   bat_ant_loan_calc_temp;

select * from   biz_ant_loan_detail;--���Ͻ��·ſ��Լ����ϸ��
select * from   bat_ant_loan_detail_his;
select * from   bat_ant_loan_detail_temp;

select * from   biz_ant_loan_init;--���Ͻ����ճ�����Լ����Ϣ��
select * from   bat_ant_loan_init_his;
select * from   bat_ant_loan_init_temp;

select * from   biz_ant_repay_instmnt_detail;--���Ͻ��»�����ڣ���Ϣ��
select * from  bat_ant_repay_instmnt_dt_his;
select * from  bat_ant_repay_instmnt_dt_temp;

select * from   biz_ant_repay_loan_detail;--���Ͻ��»����Լ����ϸ��
select * from   bat_ant_repay_loan_detail_his;
select * from   bat_ant_repay_loan_detail_temp;

select * from   biz_ant_repay_plan;--���Ͻ��·ſ���ڣ���ϸ�ļ�
select * from   bat_ant_repay_plan_his;
select * from   bat_ant_repay_plan_temp;


/*------------------------------------------------ С��������ر� ---------------------------------------*/

select * from biz_xw_file_num;--�������ո��ļ�����������
select * from BAT_XW_FILE_NUM_TEMP;
select * from BAT_XW_FILE_NUM_HIS;

select * from biz_xw_bal_tol;--�������ܶ�˶�̨��
select * from bat_xw_bal_tol_TEMP;
select * from bat_xw_bal_tol_HIS;

select * from biz_xw_bfj_flow;--������������ˮ
select * from bat_xw_bfj_flow_TEMP;
select * from bat_xw_bfj_flow_HIS;

select * from biz_xw_bfj_sum;--�����������ܽ��
select * from bat_xw_bfj_sum_TEMP;
select * from bat_xw_bfj_sum_HIS;

select * from biz_xw_crd_cont_info;--���������Ϣ��
select * from bat_xw_crd_cont_info_TEMP;
select * from bat_xw_crd_cont_info_HIS;

select * from biz_xw_cust_info;--�����ͻ���Ϣ��
select * from bat_xw_cust_info_TEMP;
select * from bat_xw_cust_info_HIS;

select * from biz_xw_ds_accounting_flow;--������Ʒ�¼�ձ�
select * from bat_xw_ds_accounting_flow_TEMP;
select * from bat_xw_ds_accounting_flow_HIS;

select * from biz_xw_fee;--�۷���ϸ��
select * from bat_xw_fee_TEMP;
select * from bat_xw_fee_HIS;

select * from biz_xw_repay_detail;--����������ϸ��
select * from bat_xw_repay_detail_TEMP;
select * from bat_xw_repay_detail_his;

select * from biz_xw_repay_plan;--��������ƻ���
select * from bat_xw_repay_plan_TEMP;
select * from bat_xw_repay_plan_HIS;

select * from biz_xw_rev_trans;--���������ཻ��
select * from bat_xw_rev_trans_his;
select * from bat_xw_rev_trans_TEMp;

select * from biz_xw_special_tran;--���⽻��
select * from bat_xw_special_tran_TEMP;
select * from bat_xw_special_tran_HIS;

select * from biz_xw_loan_info;--������Ϣ��
select * from bat_xw_loan_info_HIS;
select * from bat_xw_loan_info_TEMP;


/*------------------------------------------------ ����������ر� ---------------------------------------*/

select * from bat_jd_loan_total_temp;--������Ϣ��
select * from bat_jd_loan_total_his;
select * from biz_jd_loan_total;


select * from bat_jd_cus_temp;-- �ͻ���Ϣ��
select * from bat_jd_cus_his;
select * from biz_jd_cus;

select * from BAT_JD_CUSCREDIT_TEMP;--���Ŷ����Ϣ��
select * from BAT_JD_CUSCREDIT_HIS;
select * from BIZ_JD_CUSCREDIT;

select * from BAT_JD_QUOTAADJUST_TEMP;-- ������Ϣ��ʱ��
select * from BAT_JD_QUOTAADJUST_HIS;
select * from BIZ_JD_QUOTAADJUST;

select * from BAT_JD_LOAN_TEMP;-- ��������Ϣ��ʱ��
select * from BAT_JD_LOAN_HIS;
select * from BIZ_JD_LOAN;

select * from BAT_JD_REPAY_PLAN_TEMP;-- ����ƻ���Ϣ��ʱ��
select * from BAT_JD_REPAY_PLAN_HIS;
select * from BIZ_JD_REPAY_PLAN;

select * from BAT_JD_REPAY_FLOW_TEMP;-- ������ϸ��Ϣ��ʱ��
select * from BAT_JD_REPAY_FLOW_HIS;
select * from BIZ_JD_REPAY_FLOW;


/*------------------------------------------------------ CBM������ر� -------------------------------------*/

/* ---------------- MY - CBM -----------------*/

select * from BAT_CBM_ACCT_LOAN BCA WHERE BCA.DATA_DATE = '2018-08-21' AND BCA.CHANNEL_TYPE = 'MY';--CBM��ݱ�

select * from BAT_CBM_CONTRACT_INFO BCC WHERE BCC.DATA_DATE = '2018-08-21' AND BCC.CHANNEL_TYPE = 'MY';--CBM��ͬ��Ϣ��

select * from BAT_CBM_LOAN_APPLY BCL WHERE BCL.DATA_DATE = '2018-08-21' AND BCL.CHANNEL_TYPE = 'MY';--CBM�ſ������

select * from BAT_CBM_RATE_ZONE BCR WHERE BCR.DATA_DATE = '2018-08-21' AND BCR.CHANNEL_TYPE = 'MY';--CBM�������α�

select * from BAT_CBM_REPAY_METHOD_ZONE BCZ WHERE BCZ.DATA_DATE = '2018-08-21' AND BCZ.CHANNEL_TYPE = 'MY';--CBM���ʽ���α�

select * from BAT_CBM_REPAY_PLAN BCP WHERE BCP.DATA_DATE = '2018-08-21' AND BCP.CHANNEL_TYPE = 'MY';--CBM����ƻ���

select * from BAT_CBM_REPAY_TRAN_BILL_INFO BCI WHERE BCI.DATA_DATE = '2018-08-21' AND BCI.CHANNEL_TYPE = 'MY';--CBM����׵�����Ϣ��

select * from BAT_CBM_REPAY_SPLIT_DET BCD WHERE BCD.DATA_DATE = '2018-08-21' AND BCD.CHANNEL_TYPE = 'MY';--CBM��������ϸ

select * from BAT_CBM_TRAN_INFO BCT WHERE BCT.DATA_DATE = '2018-08-21' AND BCT.CHANNEL_TYPE = 'MY';--CBM������Ϣ��

select * from BAT_CBM_CUS_BASE BCB WHERE BCB.DATA_DATE = '2018-08-21' AND BCB.CLIENT_SOURCE = 'MY'; -- CBM�ͻ�������Ϣ

select * from BAT_CBM_CUS_INDIV BCCI WHERE BCCI.DATA_DATE = '2018-08-21' AND BCCI.CHANNEL_TYPE = 'MY'; -- CBM�ͻ���Ϣ��

select * from BAT_CBM_BFJ_BAL_DET BCBB WHERE BCBB.DATA_DATE = '2018-08-21' AND BCBB.CHANNEL_TYPE = 'MY'; -- CBM����������¼��

select * from BAT_CBM_RECON_DET BCRD WHERE BCRD.DATA_DATE = '2018-08-21' AND BCRD.CHANNEL_TYPE = 'MY'; -- CBM������ϸ��


/* ---------------- XW - CBM -----------------*/

select * from BAT_CBM_ACCT_LOAN BCA WHERE BCA.DATA_DATE = '2018-08-21' AND BCA.CHANNEL_TYPE = 'XW';--CBM��ݱ�

select * from BAT_CBM_CONTRACT_INFO BCC WHERE BCC.DATA_DATE = '2018-08-21' AND BCC.CHANNEL_TYPE = 'XW';--CBM��ͬ��Ϣ��

select * from BAT_CBM_LOAN_APPLY BCL WHERE BCL.DATA_DATE = '2018-08-21' AND BCL.CHANNEL_TYPE = 'XW';--CBM�ſ������

select * from BAT_CBM_RATE_ZONE BCR WHERE BCR.DATA_DATE = '2018-08-21' AND BCR.CHANNEL_TYPE = 'XW';--CBM�������α�

select * from BAT_CBM_REPAY_METHOD_ZONE BCZ WHERE BCZ.DATA_DATE = '2018-08-21' AND BCZ.CHANNEL_TYPE = 'XW';--CBM���ʽ���α�

select * from BAT_CBM_REPAY_PLAN BCP WHERE BCP.DATA_DATE = '2018-08-21' AND BCP.CHANNEL_TYPE = 'XW';--CBM����ƻ���

select * from BAT_CBM_REPAY_TRAN_BILL_INFO BCI WHERE BCI.DATA_DATE = '2018-08-21' AND BCI.CHANNEL_TYPE = 'XW';--CBM����׵�����Ϣ��

select * from BAT_CBM_REPAY_SPLIT_DET BCD WHERE BCD.DATA_DATE = '2018-08-21' AND BCD.CHANNEL_TYPE = 'XW';--CBM��������ϸ

select * from BAT_CBM_TRAN_INFO BCT WHERE BCT.DATA_DATE = '2018-08-21' AND BCT.CHANNEL_TYPE = 'XW';--CBM������Ϣ��

select * from BAT_CBM_CUS_BASE BCB WHERE BCB.DATA_DATE = '2018-08-21' AND BCB.CLIENT_SOURCE = 'XW'; -- CBM�ͻ�������Ϣ

select * from BAT_CBM_CUS_INDIV BCCI WHERE BCCI.DATA_DATE = '2018-08-21' AND BCCI.CHANNEL_TYPE = 'XW'; -- CBM�ͻ���Ϣ��

select * from BAT_CBM_BFJ_BAL_DET BCBB WHERE BCBB.DATA_DATE = '2018-08-21' AND BCBB.CHANNEL_TYPE = 'XW'; -- CBM����������¼��

select * from BAT_CBM_RECON_DET BCRD WHERE BCRD.DATA_DATE = '2018-08-20' AND BCRD.CHANNEL_TYPE = 'XW'; -- CBM������ϸ��


/* ---------------- JD - CBM -----------------*/

select * from BAT_CBM_ACCT_LOAN BCA WHERE BCA.DATA_DATE = '2017-10-11' AND BCA.CHANNEL_TYPE = 'JD';--CBM��ݱ�

select * from BAT_CBM_CONTRACT_INFO BCC WHERE BCC.DATA_DATE = '2017-10-11' AND BCC.CHANNEL_TYPE = 'JD';--CBM��ͬ��Ϣ��

select * from BAT_CBM_LOAN_APPLY BCL WHERE BCL.DATA_DATE = '2017-10-11' AND BCL.CHANNEL_TYPE = 'JD';--CBM�ſ������

select * from BAT_CBM_RATE_ZONE BCR WHERE BCR.DATA_DATE = '2017-10-11' AND BCR.CHANNEL_TYPE = 'JD';--CBM�������α�

select * from BAT_CBM_REPAY_METHOD_ZONE BCZ WHERE BCZ.DATA_DATE = '2017-10-11' AND BCZ.CHANNEL_TYPE = 'JD';--CBM���ʽ���α�

select * from BAT_CBM_REPAY_PLAN BCP WHERE BCP.DATA_DATE = '2017-10-11' AND BCP.CHANNEL_TYPE = 'JD';--CBM����ƻ���

select * from BAT_CBM_REPAY_TRAN_BILL_INFO BCI WHERE BCI.DATA_DATE = '2017-10-11' AND BCI.CHANNEL_TYPE = 'JD';--CBM����׵�����Ϣ��

select * from BAT_CBM_REPAY_SPLIT_DET BCD WHERE BCD.DATA_DATE = '2017-10-11' AND BCD.CHANNEL_TYPE = 'JD';--CBM��������ϸ

select * from BAT_CBM_TRAN_INFO BCT WHERE BCT.DATA_DATE = '2017-10-11' AND BCT.CHANNEL_TYPE = 'JD';--CBM������Ϣ��

select * from BAT_CBM_CUS_BASE BCB WHERE BCB.DATA_DATE = '2017-10-11' AND BCB.CLIENT_SOURCE = 'JD'; -- CBM�ͻ�������Ϣ

select * from BAT_CBM_CUS_INDIV BCCI WHERE BCCI.DATA_DATE = '2017-10-11' AND BCCI.CHANNEL_TYPE = 'JD'; -- CBM�ͻ���Ϣ��

select * from BAT_CBM_BFJ_BAL_DET BCBB WHERE BCBB.DATA_DATE = '2017-10-11' AND BCBB.CHANNEL_TYPE = 'JD'; -- CBM����������¼��

select * from BAT_CBM_RECON_DET BCRD WHERE BCRD.DATA_DATE = '2017-10-11' AND BCRD.CHANNEL_TYPE = 'JD'; -- CBM������ϸ��
