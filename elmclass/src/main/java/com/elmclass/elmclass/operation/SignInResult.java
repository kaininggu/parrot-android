package com.elmclass.elmclass.operation;

import com.elmclass.elmclass.manager.NetworkManager;
import com.google.gson.annotations.SerializedName;

/**
 *
 * Created by kgu on 5/10/18.
 */

public class SignInResult {
    @SerializedName("token")
    private String mUserToken;

    @SerializedName("exp")
    private long mExpiration;

    @SerializedName("url")
    private String mUrl;

    @SerializedName("rc")
    private int mReturnCode;

    @SerializedName("msg")
    private String mMessage;

    public String getUserToken() { return mUserToken; }
    public void setUserToken(String token) { mUserToken = token; }

    public long getExpiration() { return mExpiration; }
    public void setmExpiration(long expiration) { mExpiration = expiration; }

    public String getUrl() { return mUrl; }
    public void setUrl(String url) { mUrl = url; }

    public int getReturnCode() { return mReturnCode; }
    public void setReturnCode(int rc) { mReturnCode = rc; }

    public String getMessage() { return mMessage; }
    public void setMessage(String message) { mMessage = message; }

    @Override
    public String toString() {
        return NetworkManager.getInstance().toJson(this);
    }
}