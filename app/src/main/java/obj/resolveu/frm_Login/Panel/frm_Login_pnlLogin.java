package obj.resolveu.frm_Login.Panel;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import obj.resolveu.frm_Principal.Panel.frm_Principal_pnlPrincipal;
import obj.resolveu.R;

public class frm_Login_pnlLogin extends AppCompatActivity {

    private Button btnEntrarSemCadastro;
    private Button btnCadastrar;
    private ImageView ivLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frm_login_pnllogin);

        btnEntrarSemCadastro = findViewById(R.id.btnEntrarSemCadastro);
        btnCadastrar = findViewById(R.id.btnCadastrar);
        ivLogo = findViewById(R.id.ivLogo);


        btnEntrarSemCadastro.setOnClickListener(v -> {
            Intent intent = new Intent(frm_Login_pnlLogin.this, frm_Principal_pnlPrincipal.class);
            startActivity(intent);
            finish(); // Fecha a tela de login para não voltar com "voltar"
        });

        btnCadastrar.setOnClickListener(v -> {
            //Intent intent = new Intent(LoginActivity.this, TelaCadastroActivity.class);
            //startActivity(intent);
            // Aqui você pode ou não finalizar essa activity
        });

    }


}
