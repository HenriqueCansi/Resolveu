package obj.resolveu.frm_Login.Panel;

import android.widget.Button;

import obj.resolveu.WMSActivity;
import obj.resolveu.WMSView;
import obj.resolveu.frm_Principal.Panel.frm_Principal_pnlPrincipal;
import obj.resolveu.R;

import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class frm_Login_pnlLogin extends WMSView {
    public static frm_Login_pnlLogin __obj = new frm_Login_pnlLogin();
    private LinearLayout layout;

    @Override
    public LinearLayout getLayout() {
        if (layout == null) {
            LayoutInflater inflater = LayoutInflater.from(WMSActivity.__activity);
            layout = (LinearLayout) inflater.inflate(R.layout.frm_login_pnllogin, null);
        }
        return layout;
    }

    @Override
    public void OnActivated() {
        Button btnCadastrar = getLayout().findViewById(R.id.btnCadastrar);
        Button btnSemCadastro = getLayout().findViewById(R.id.btnEntrarSemCadastro);

        btnCadastrar.setOnClickListener(v -> {
            // Aqui você pode adicionar validação antes de entrar
            frm_Principal_pnlPrincipal.__obj.Show();
        });

        btnSemCadastro.setOnClickListener(v -> {
            frm_Principal_pnlPrincipal.__obj = new frm_Principal_pnlPrincipal();
            frm_Principal_pnlPrincipal.__obj.Show();
        });
    }
}