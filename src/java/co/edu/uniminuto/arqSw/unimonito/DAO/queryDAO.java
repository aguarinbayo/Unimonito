/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.unimonito.DAO;

import co.edu.uniminuto.arqSW.unimonito.hibernate.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author clarylinux
 */

public class queryDAO {
    Session session=null;
    
    public queryDAO(){
        this.session=HibernateUtil.getSessionFactory().getCurrentSession();
    }

}


