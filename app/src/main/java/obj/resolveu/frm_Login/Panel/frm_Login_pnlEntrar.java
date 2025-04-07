package obj.resolveu.frm_Login.Panel;

import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import obj.resolveu.R;
import obj.resolveu.RvActivity;
import obj.resolveu.RvView;

public class frm_Login_pnlEntrar extends RvView {
    public static frm_Login_pnlEntrar __obj = new frm_Login_pnlEntrar();
    private LinearLayout layout;

    @Override
    public LinearLayout getLayout() {
        if (layout == null) {
            LayoutInflater inflater = LayoutInflater.from(RvActivity.__activity);
            layout = (LinearLayout) inflater.inflate(R.layout.frm_login_pnlentrar, null);
        }
        return layout;
    }

    @Override
    public void OnActivated() {
        EditText edtEmail = layout.findViewById(R.id.edtEmail);
        EditText edtSenha = layout.findViewById(R.id.edtSenha);
        Button btnEntrar = layout.findViewById(R.id.btnEntrar);
        TextView txtNaoTenhoCadastro = layout.findViewById(R.id.tvCadastrarAgora);

        btnEntrar.setOnClickListener(v -> {
            String email = edtEmail.getText().toString();
            String senha = edtSenha.getText().toString();

            if (email.isEmpty() || senha.isEmpty()) {
                Toast.makeText(RvActivity.__activity, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                return;
            }

            // TODO: Validação com banco de dados
            Toast.makeText(RvActivity.__activity, "Login realizado com sucesso!", Toast.LENGTH_SHORT).show();

            // TODO: Ir para tela principal
        });

        txtNaoTenhoCadastro.setOnClickListener(v -> {
            frm_Login_pnlCadastrar.__obj.Show();
            this.Hide();
        });
    }
}
