package com.konakartadmin.app;

import com.konakartadmin.appif.*;
import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - InsertWishListItem - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class InsertWishListItem
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public InsertWishListItem(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public int insertWishListItem(String sessionId, AdminWishListItem wishListItem) throws KKAdminException
     {
         return kkAdminEng.insertWishListItem(sessionId, wishListItem);
     }
}