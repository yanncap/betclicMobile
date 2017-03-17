package betclic.m2i.com.betclicmobile.utils;


import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class StorageService {


    private static final String USER_TOKEN_KEY = "USER_TOKEN_KEY";

    public static void storeUserToken(Activity activity, String token) {
        SharedPreferences sharedPref = activity.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putString(USER_TOKEN_KEY, token);
        editor.apply();
    }

    public static String getUserToken (Activity activity){
        SharedPreferences sharedPref = activity.getPreferences(Context.MODE_PRIVATE);
        String userToken = sharedPref.getString(USER_TOKEN_KEY,"");
        return userToken;
    }
}
