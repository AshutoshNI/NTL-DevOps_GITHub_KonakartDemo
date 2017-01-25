package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - AddRolesToUser - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class AddRolesToUser
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public AddRolesToUser(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public void addRolesToUser(String sessionId, AdminRole[] roles, int userId) throws KKAdminException
     {
         kkAdminEng.addRolesToUser(sessionId, roles, userId);
     }
}