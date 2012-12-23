/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.prototype;

import java.util.Date;

/**
 * @author Administrator
 * @version $Id: WorkExperience.java,v 0.1 2012-11-19 下午10:58:26 Administrator Exp $
 */
public class WorkExperience implements Cloneable {

    private String company;

    private Date   workDate;

    /**
     * @return
     * @throws CloneNotSupportedException
     * @see java.lang.Object#clone()
     */
    @Override
    protected WorkExperience clone() throws CloneNotSupportedException {
        return (WorkExperience) super.clone();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

}
