package cn.java.dao;

import java.util.List;
import java.util.Set;


/**
 * ���幫����DAO�����ӿڱ�׼�������Ĺ��ܰ��������ӡ��޸�ȫ����ɾ�����ݡ����ݱ�Ų�ѯ����ѯȫ������ҳ��ʾ������ͳ��
 * @author tanlin
 * @param <K> ��ʾҪ�������������ͣ����ӽӿ�ʵ��
 * @param <V> ��ʾҪ������VO���ͣ����ӽӿ�ʵ��
 */
public interface IDAO<V,K>{
	/**
	 * ʵ�����ݵ����Ӳ���
	 * @param vo ����һ����Ҫ�������Ķ���
	 * @return �����ɹ����� true�����򷵻�false.
	 * @throws Exception ���ݿ��ִ���쳣
	 */
	public Boolean toCreate(V vo)throws Exception;
	/**
	 * ʵ�����ݵĸ��²���������empno����
	 * @param vo ����һ����Ҫ�����µĶ���
	 * @return ���³ɹ�����true,���򷵻�false.
	 * @throws Exception ���ݿ�ִ���쳣
	 */
	public Boolean toUpData(V vo)throws Exception;
	/**
	 * ʵ�����ݵ�ɾ������������empno����
	 * @param vo ����һ����Ҫ��ɾ���Ķ���
	 * @return ɾ���ɹ�����true�����򷵻�false
	 * @throws Exception ���ݿ�ִ���쳣
	 */
	public Boolean toDetele(Set<K> ids)throws Exception;
	/**
	 * ʵ�����ݵĲ�ѯ����������id����
	 * @param vo ����һ����Ҫ����ѯ�Ķ��󣬵õ�id
	 * @return ��ѯ�ɹ�����true�����򷵻�false
	 * @throws Exception ���ݿ�ִ���쳣
	 */
	public V findSelect(K id)throws Exception;
	/**
	 * ��ѯָ�����ݱ��ȫ����¼�������Լ��ϵ���ʽ����
	 * @return ������������ݣ������е����ݻ��װΪVO�����������List���Ϸ���<br>
	 * ���û�����ݣ���ô���ϵĳ���Ϊ0��size()==0������null
	 * @throws Exception
	 */
	public List<V> findAll()throws Exception;
	/**
	 * ��ҳ�������ݵ�ģ����ѯ
	 * @param currentPage ��ʾ��ǰ���ڵ�ҳ
	 * @param lineSize ÿһҳ������ʾ������
	 * @param column Ҫ����ģ����ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return������������ݣ������е����ݻ��װΪVO�����������List���Ϸ���<br>
	 * ���û�����ݣ���ô���ϵĳ���Ϊ0��size()==0������null
	 * @throws Exception
	 */
	public List<V> findAllSplit(Integer currentPage,Integer lineSize,String column,String keyWord) throws Exception;
	/**
	 * ����ģ����ѯ��������ͳ�ƣ��������û�м�¼ͳ�ƵĽ����0
	 * @param column Ҫ����ģ����ѯ��������
	 * @param keyWord ģ����ѯ�Ĺؼ���
	 * @return ���ر��е������������û�����ݷ���0
	 * @throws Exception SQLִ���쳣
	 */
	public Integer getAllCount(String column,String keyWord)throws Exception;
	
}
