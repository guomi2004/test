/**
 * created since 2012-11-19
 */
package com.mycompany.designpattern.prototype;

import java.util.Date;

/**
 * @author Administrator
 * @version $Id: Client.java,v 0.1 2012-11-19 下午11:00:32 Administrator Exp $
 */
public class Client {

    /**
     * @param args
     * @throws CloneNotSupportedException 
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        WorkExperience work1 = new WorkExperience();
        work1.setCompany("alipay");
        work1.setWorkDate(new Date());
        Resume resume1 = new Resume("zhansan", "男", 25, work1);

        Resume resume2 = resume1.clone();

        System.out.println(resume1);
        System.out.println(resume2);

        System.out.println(resume1.getWorkExperience());
        
        Thread.sleep(2000);
        resume2.getWorkExperience().setCompany("taobao");
        resume2.getWorkExperience().setWorkDate(new Date());
        System.out.println(resume2.getWorkExperience());
        
        System.out.println("***************************************");
        
        System.out.println(resume1.getWorkExperience().getCompany() + ","
            + resume1.getWorkExperience().getWorkDate());
        System.out.println(resume2.getWorkExperience().getCompany() + ","
            + resume2.getWorkExperience().getWorkDate());
        
        System.out.println("***************************************");
        System.out.println(work1);
        System.out.println(work1.clone());
    }

}
