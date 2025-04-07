package obj.resolveu.frm_Login.Panel;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import obj.resolveu.R;
import obj.resolveu.RvActivity;
import obj.resolveu.RvView;

public class frm_Login_pnlCadastrar extends RvView {
    public static frm_Login_pnlCadastrar __obj = new frm_Login_pnlCadastrar();
    private LinearLayout layout;

    @Override
    public LinearLayout getLayout() {
        if (layout == null) {
            LayoutInflater inflater = LayoutInflater.from(RvActivity.__activity);
            layout = (LinearLayout) inflater.inflate(R.layout.frm_login_pnlcadastrar, null);
            //layout = (LinearLayout) ((ScrollView) inflater.inflate(R.layout.frm_login_pnlcadastrar, null)).getChildAt(0);

        }
        return layout;
    }

    @Override
    public void OnActivated() {
        EditText edtNome = layout.findViewById(R.id.edtNome);
        EditText edtEmail = layout.findViewById(R.id.edtEmail);
        EditText edtSenha = layout.findViewById(R.id.edtSenha);
        CheckBox chkTermos = layout.findViewById(R.id.chkTermos);
        Button btnCadastrar = layout.findViewById(R.id.btnCadastrar);
        TextView txtJaTenhoCadastro = layout.findViewById(R.id.txtJaTenhoCadastro);
        ImageButton btnGoogleLogin = layout.findViewById(R.id.btnGoogleLogin);

        btnCadastrar.setOnClickListener(v -> {
            if (!chkTermos.isChecked()) {
                Toast.makeText(RvActivity.__activity, "Você precisa aceitar os termos", Toast.LENGTH_SHORT).show();
                return;
            }

            String nome = edtNome.getText().toString();
            String email = edtEmail.getText().toString();
            String senha = edtSenha.getText().toString();

            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(RvActivity.__activity, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                return;
            }

            // TODO: Adicionar integração com banco depois
            Toast.makeText(RvActivity.__activity, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();
        });

        txtJaTenhoCadastro.setOnClickListener(v -> {
            frm_Login_pnlEntrar.__obj = new frm_Login_pnlEntrar();
            frm_Login_pnlEntrar.__obj.Show();
            this.Hide();
        });

        btnGoogleLogin.setOnClickListener(v -> {
            Toast.makeText(RvActivity.__activity, "Login com Google ainda não implementado", Toast.LENGTH_SHORT).show();
        });

    }
}
