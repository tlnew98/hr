package cn.java.dao;

import java.util.List;

public interface IEmpDAO extends IDAO<Emp, Integer> {
	/**
	 * ��ѯ��Ա����ϸ��Ϣ��������Ա��Ӧ���쵼��Ϣ�Լ����ڵĲ�����Ϣ
	 * @param id Ҫ��ѯ�Ĺ�Ա���
	 * @return ���е�������VO���󷵻أ����û���򷵻�null
	 * @throws Exception SQL��ѯ����
	 */
	public Emp findByIdDetails(Integer id) throws Exception ;
	/**
	 * ��ѯ��Ա��������Ϣ
	 * @return ���е����ݶ�����List���Ϸ��أ����û�����ݼ��ϳ���Ϊ0��size() == 0��
	 * @throws Exception SQL��ѯ����
	 */
	public List<Emp> findAllDetails() throws Exception ;
	/**
	 * ��ҳ��ѯ��Ա��������Ϣ
	 * @param currentPage ��ǰ���ڵ�ҳ
	 * @param lineSize ÿ��ݭ��ʾ��������
	 * @param column Ҫ����ģ����ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return ������������ݣ������е����ݻ��װΪVO�����������List���Ϸ��أ�<br>
	 * ���û�����ݣ���ô���ϵĳ���Ϊ0��size() == 0������null��
	 * @throws Exception SQLִ���쳣
	 */
	public List<Emp> findAllSplitDetails(Integer currentPage,Integer lineSize,String column,String keyWord) throws Exception ;
}

