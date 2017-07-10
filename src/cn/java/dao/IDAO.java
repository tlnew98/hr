package cn.java.dao;

import java.util.List;
import java.util.Set;


/**
 * 定义公共的DAO操作接口标准，基本的功能包括：增加、修改全部、删除数据、根据编号查询、查询全部、分页显示、数据统计
 * @author tanlin
 * @param <K> 表示要操作的主键类型，由子接口实现
 * @param <V> 表示要操作的VO类型，由子接口实现
 */
public interface IDAO<V,K>{
	/**
	 * 实现数据的增加操作
	 * @param vo 传入一个需要被创建的对象
	 * @return 创建成功返回 true，否则返回false.
	 * @throws Exception 数据库的执行异常
	 */
	public Boolean toCreate(V vo)throws Exception;
	/**
	 * 实现数据的更新操作，根据empno进行
	 * @param vo 传入一个需要被更新的对象，
	 * @return 更新成功返回true,否则返回false.
	 * @throws Exception 数据库执行异常
	 */
	public Boolean toUpData(V vo)throws Exception;
	/**
	 * 实现数据的删除操作，根据empno进行
	 * @param vo 传入一个需要被删除的对象，
	 * @return 删除成功返回true，否则返回false
	 * @throws Exception 数据库执行异常
	 */
	public Boolean toDetele(Set<K> ids)throws Exception;
	/**
	 * 实现数据的查询操作，根据id进行
	 * @param vo 传入一个需要被查询的对象，得到id
	 * @return 查询成功返回true，否则返回false
	 * @throws Exception 数据库执行异常
	 */
	public V findSelect(K id)throws Exception;
	/**
	 * 查询指定数据表的全部记录，并且以集合的形式返回
	 * @return 如果表中有数据，则所有的数据会封装为VO对象而后利用List集合返回<br>
	 * 如果没有数据，那么集合的长度为0，size()==0，不是null
	 * @throws Exception
	 */
	public List<V> findAll()throws Exception;
	/**
	 * 分页进行数据的模糊查询
	 * @param currentPage 表示当前所在的页
	 * @param lineSize 每一页数据显示的行数
	 * @param column 要进行模糊查询的数据列
	 * @param keyWord 模糊查询的关键字
	 * @return如果表中有数据，则所有的数据会封装为VO对象而后利用List集合返回<br>
	 * 如果没有数据，那么集合的长度为0，size()==0，不是null
	 * @throws Exception
	 */
	public List<V> findAllSplit(Integer currentPage,Integer lineSize,String column,String keyWord) throws Exception;
	/**
	 * 进行模糊查询数据量的统计，如果表中没有记录统计的结果是0
	 * @param column 要进行模糊查询的数据列
	 * @param keyWord 模糊查询的关键字
	 * @return 返回表中的数据量，如果没有数据返回0
	 * @throws Exception SQL执行异常
	 */
	public Integer getAllCount(String column,String keyWord)throws Exception;
	
}
