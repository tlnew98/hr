package cn.java.dao;

import java.io.Serializable;
import java.util.Date;

public class Emp2 implements Serializable {

	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;
	
	/**
	 * @return empno
	 */
	public Integer getEmpno() {
		return empno;
	}
	/**
	 * @param empno Ҫ���õ� empno
	 */
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	/**
	 * @return ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @param ename Ҫ���õ� ename
	 */
	public void setEname(String ename) {
		this.ename = ename;
	}
	/**
	 * @return job
	 */
	public String getJob() {
		return job;
	}
	/**
	 * @param job Ҫ���õ� job
	 */
	public void setJob(String job) {
		this.job = job;
	}
	/**
	 * @return mgr
	 */
	public Integer getMgr() {
		return mgr;
	}
	/**
	 * @param mgr Ҫ���õ� mgr
	 */
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	/**
	 * @return hiredate
	 */
	public Date getHiredate() {
		return hiredate;
	}
	/**
	 * @param hiredate Ҫ���õ� hiredate
	 */
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	/**
	 * @return sal
	 */
	public Double getSal() {
		return sal;
	}
	/**
	 * @param sal Ҫ���õ� sal
	 */
	public void setSal(Double sal) {
		this.sal = sal;
	}
	/**
	 * @return comm
	 */
	public Double getComm() {
		return comm;
	}
	/**
	 * @param comm Ҫ���õ� comm
	 */
	public void setComm(Double comm) {
		this.comm = comm;
	}
	/**
	 * @return deptno
	 */
	public Integer getDeptno() {
		return deptno;
	}
	/**
	 * @param deptno Ҫ���õ� deptno
	 */
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
}
