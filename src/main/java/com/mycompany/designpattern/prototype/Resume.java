/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.prototype;

/**
 * @author Administrator
 * @version $Id: Resume.java,v 0.1 2012-11-19 下午10:58:44 Administrator Exp $
 */
public class Resume implements Cloneable {

    private String         name;

    private String         sex;

    private int            age;

    private WorkExperience workExperience;

    /**
     * @return
     * @throws CloneNotSupportedException
     * @see java.lang.Object#clone()
     */
    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        resume.setWorkExperience(this.workExperience.clone());
        return resume;
    }

    
    /**
     * 
     */
    public Resume() {
        super();
    }


    /**
     * @param name
     * @param sex
     * @param age
     * @param workExperience
     */
    public Resume(String name, String sex, int age, WorkExperience workExperience) {
        super();
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.workExperience = workExperience;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

}
