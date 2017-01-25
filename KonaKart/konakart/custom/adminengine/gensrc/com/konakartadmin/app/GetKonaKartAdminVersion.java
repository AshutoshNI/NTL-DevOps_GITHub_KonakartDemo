package com.konakartadmin.app;

import com.konakartadmin.bl.KKAdmin;

/**
 *  The KonaKart Custom Engine - GetKonaKartAdminVersion - Generated by CreateKKAdminCustomEng
 */
@SuppressWarnings("all")
public class GetKonaKartAdminVersion
{
    KKAdmin kkAdminEng = null;

    /**
     * Constructor
     */
     public GetKonaKartAdminVersion(KKAdmin _kkAdminEng)
     {
         kkAdminEng = _kkAdminEng;
     }

     public String getKonaKartAdminVersion() throws KKAdminException
     {
         return kkAdminEng.getKonaKartAdminVersion();
     }
}