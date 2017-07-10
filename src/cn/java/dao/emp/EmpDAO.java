package cn.java.dao.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cn.java.dao.Emp;
import cn.java.dao.IEmpDAO;

public class EmpDAO implements IEmpDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	public EmpDAO(Connection conn){
		this.conn=conn;
	}

	@Override
	public Boolean toCreate(Emp vo) throws Exception {
		String sql=" INSERT INTO EMP (empno,ename,job,mgr,hiredate,sal,comm,deptno) VALUES (?,?,?,?,?,?,?) ";
		this.pstmt=conn.prepareStatement(sql);
		this.pstmt.setInt(1, vo.getDeptno());
		this.pstmt.setString(2, vo.getEname());
		this.pstmt.setString(3, vo.getJob());
		this.pstmt.setInt(4, vo.getMgr());
		this.pstmt.setDate(5, new java.sql.Date(vo.getHiredate().getTime()));
		this.pstmt.setDouble(6, vo.getSal());
		this.pstmt.setDouble(7, vo.getComm());
		this.pstmt.setInt(8, vo.getDeptno());
		return this.pstmt.executeUpdate()>0;
	}

	@Override
	public Boolean toUpData(Emp vo) throws Exception {
		String sql="updata emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?deptno=? where empno=?";
		this.pstmt=conn.prepareStatement(sql);	
		this.pstmt.setString(1, vo.getEname());
		this.pstmt.setString(2, vo.getJob());
		this.pstmt.setInt(3, vo.getMgr());
		this.pstmt.setDate(4, new java.sql.Date(vo.getHiredate().getTime()));
		this.pstmt.setDouble(5, vo.getSal());
		this.pstmt.setDouble(6, vo.getComm());
		this.pstmt.setInt(7, vo.getDeptno());
		this.pstmt.setInt(8, vo.getDeptno());
		return this.pstmt.executeUpdate()>0;
	}

	@Override
	public Boolean toDetele(Set<Integer> ids) throws Exception {
		if(ids==null||ids.size()==0){
			return false;
		}
		StringBuffer sql=new StringBuffer();
		sql.append(" delete from emp where empno in (");
		Iterator<Integer> iter=ids.iterator();
		while(iter.hasNext()){
			sql.append(iter.next()).append(",");
		}
		sql.delete(sql.length()-1, sql.length()).append(")");
		this.pstmt=conn.prepareStatement(sql.toString());
		return this.pstmt.executeUpdate()==ids.size();	       
	}
	@Override
	public Emp findSelect(Integer id) throws Exception {
		Emp vo=null;
		String sql="select ename,job,mgr,hiredate,sal,comm,deptno from where empno=?";
		this.pstmt=conn.prepareStatement(sql);
		this.pstmt.setInt(1, id);
		ResultSet rt=this.pstmt.executeQuery();
		while(rt.next()){
			vo=new Emp();
			vo.setEname(rt.getString("ename"));
			vo.setJob(rt.getString("job"));
			vo.setMgr(rt.getInt("mgr"));
			vo.setHiredate(rt.getDate("hiredate"));
			vo.setSal(rt.getDouble("sal"));
			vo.setComm(rt.getDouble("comm"));
			vo.setDeptno(rt.getInt("deptno"));
		}
		return vo;
	}

	@Override
	public List<Emp> findAll() throws Exception {
		String sql=" select empno,ename,job,mgr,hiredate,sal,comm,deptno from emp";
		this.pstmt=conn.prepareStatement(sql);
		ResultSet rt=this.pstmt.executeQuery();
		List<Emp> all=new ArrayList<Emp>();
		while(rt.next()){
			Emp vo=new Emp();
			vo.setEname(rt.getString("ename"));
			vo.setJob(rt.getString("job"));
			vo.setMgr(rt.getInt("mgr"));
			vo.setHiredate(rt.getDate("hiredate"));
			vo.setSal(rt.getDouble("sal"));
			vo.setComm(rt.getDouble("comm"));
			vo.setDeptno(rt.getInt("deptno"));
			all.add(vo);
		}
		return all;
	}

	@Override
	public List<Emp> findAllSplit(Integer currentPage, Integer lineSize, String column, String keyWord)
			throws Exception {
		List<Emp> all = new ArrayList<Emp>() ;
		String sql = "SELECT * FROM "
				+ " (SELECT empno,ename,job,mgr,hiredate,sal,comm,ROWNUM rn"
				+ " FROM emp"
				+ " WHERE " + column + " LIKE ? AND ROWNUM<=?) temp "
				+ " WHERE temp.rn>? " ;
		this.pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, "%"+keyWord+"%");
		pstmt.setInt(2, currentPage*lineSize);
		pstmt.setInt(3, (currentPage-1)*lineSize);
		ResultSet rt=this.pstmt.executeQuery();
		while(rt.next()){
			Emp vo=new Emp();
			vo.setDeptno(rt.getInt("empno"));
			vo.setEname(rt.getString("ename"));
			vo.setJob(rt.getString("job"));
			vo.setMgr(rt.getInt("mgr"));
			vo.setHiredate(rt.getDate("hiredate"));
			vo.setSal(rt.getDouble("sal"));
			vo.setComm(rt.getDouble("comm"));
			all.add(vo);	
		}
		return all;
	}

	@Override
	public Integer getAllCount(String column, String keyWord) throws Exception {
		
		String sql="select count(empno) from emp where "+ column +" like ?";
		this.pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, "%"+keyWord+"%");
		ResultSet rt=this.pstmt.executeQuery();
		if(rt.next()){
			return rt.getInt(1);
		}
		return null;
	}
	public Emp findByIdDetails(Integer id) throws Exception{
		return null;
	} 
	public List<Emp> findAllDetails() throws Exception {
		return null;
	}
	
	public List<Emp> findAllSplitDetails(Integer currentPage,Integer lineSize,String column,String keyWord) throws Exception {
		return null;
	}
}
