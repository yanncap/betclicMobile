package betclic.m2i.com.betclicmobile.validation;

import android.text.Editable;

/**
 * Created by formation on 16/03/17.
 */

public class FieldValidation {

    public final static boolean isValidEmail(CharSequence target) {
        if (target == null|| isEmptyField(target)) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public final static boolean isEmptyField(CharSequence target) {
        if (target == null||target == "") {
            return true;
        } else {
            return false;
        }
    }

    public final static boolean isValidPassword(Editable text) {

        if(text.length()< 5 ||isEmptyField(text)){
            return false;
        }else{
            return true;
        }

    }
}