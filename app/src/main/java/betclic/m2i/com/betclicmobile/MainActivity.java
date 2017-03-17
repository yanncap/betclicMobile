package betclic.m2i.com.betclicmobile;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import betclic.m2i.com.betclicmobile.api.BetclicApi;
import betclic.m2i.com.betclicmobile.api.BetclicApiService;
import betclic.m2i.com.betclicmobile.models.UserTransfert;
import betclic.m2i.com.betclicmobile.validation.FieldValidation;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.bvId)
    Button bvId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


    }


    @OnClick(R.id.bvId)
    public void onClick() {

        BetclicApi betclicService = BetclicApiService.getInstance();

        if(!FieldValidation.isValidEmail(etEmail.getText())) {
            etEmail.setError("Email invalide");
            return;
        }
        if(!FieldValidation.isValidPassword(etPassword.getText())){
            etPassword.setError("Password invalide");
            return;

        }
        Intent intent = new Intent(MainActivity.this,BetActivity.class);

        betclicService.login(etEmail.getText().toString(), etPassword.getText().toString()).enqueue(new Callback<UserTransfert>() {
            @Override
            public void onResponse(Call<UserTransfert> call, Response<UserTransfert> response) {
                if (response.isSuccessful()) {
                    UserTransfert userTransfert = response.body();
                    Log.d("Response", userTransfert.getToken());

                    //TODO :rediriger vers activity paris sportif
                    startActivity(intent);

                } else {
                        if(response.code() == 404){
                            Toast.makeText(MainActivity.this, "Erreur d'authentifcation", Toast.LENGTH_LONG).show();
                        }else if(response.code() == 409){
                            Toast.makeText(MainActivity.this, "Veuillez renseigner les champs", Toast.LENGTH_LONG).show();
                        }

                }
            }

            @Override
            public void onFailure(Call<UserTransfert> call, Throwable t) {

                Toast.makeText(MainActivity.this, "ERROR NETWORK", Toast.LENGTH_LONG).show();
            }
        });

    }
}
