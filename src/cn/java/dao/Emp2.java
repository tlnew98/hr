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
	 * @param empno 要设置的 empno
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
	 * @param ename 要设置的 ename
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
	 * @param job 要设置的 job
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
	 * @param mgr 要设置的 mgr
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
	 * @param hiredate 要设置的 hiredate
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
	 * @param sal 要设置的 sal
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
	 * @param comm 要设置的 comm
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
	 * @param deptno 要设置的 deptno
	 */
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
}
