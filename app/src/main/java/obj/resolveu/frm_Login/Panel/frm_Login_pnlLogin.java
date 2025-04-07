package obj.resolveu.frm_Login.Panel;

import android.widget.Button;

import obj.resolveu.RvActivity;
import obj.resolveu.RvView;
import obj.resolveu.frm_Principal.Panel.frm_Principal_pnlPrincipal;
import obj.resolveu.R;

import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class frm_Login_pnlLogin extends RvView {
    public static frm_Login_pnlLogin __obj = new frm_Login_pnlLogin();
    private LinearLayout layout;

    @Override
    public LinearLayout getLayout() {
        if (layout == null) {
            LayoutInflater inflater = LayoutInflater.from(RvActivity.__activity);
            layout = (LinearLayout) inflater.inflate(R.layout.frm_login_pnllogin, null);
        }
        return layout;
    }

    @Override
    public void OnActivated() {
        Button btnCadastrar = getLayout().findViewById(R.id.btnCadastrar);
        Button btnSemCadastro = getLayout().findViewById(R.id.btnEntrarSemCadastro);
        Button btnJaCadastrado = getLayout().findViewById(R.id.btnJaCadastrado);

        btnCadastrar.setOnClickListener(v -> {
            frm_Login_pnlCadastrar.__obj = new frm_Login_pnlCadastrar();
            frm_Login_pnlCadastrar.__obj.Show();
            this.Hide();
        });

        btnJaCadastrado.setOnClickListener(v -> {
            frm_Login_pnlEntrar.__obj = new frm_Login_pnlEntrar();
            frm_Login_pnlEntrar.__obj.Show();
            this.Hide();
        });

        btnSemCadastro.setOnClickListener(v -> {
            frm_Principal_pnlPrincipal.__obj = new frm_Principal_pnlPrincipal();
            frm_Principal_pnlPrincipal.__obj.Show();
        });
    }
}