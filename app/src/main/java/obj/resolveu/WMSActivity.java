package obj.resolveu;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.ArrayList;

import obj.resolveu.frm_Login.Panel.frm_Login_pnlLogin;
import obj.resolveu.frm_Principal.Panel.frm_Principal_pnlPrincipal;

public class WMSActivity extends Activity {
    public static WMSActivity __activity;
    public static ArrayList<WMSView> __views = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        __activity = this;

        // Iniciar com a tela de login
        frm_Login_pnlLogin.__obj.Show();
    }

    public static LinearLayout criaTela(WMSView view) {
        return view.getLayout();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (frm_Principal_pnlPrincipal.__obj.mapView != null)
            frm_Principal_pnlPrincipal.__obj.mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (frm_Principal_pnlPrincipal.__obj.mapView != null)
            frm_Principal_pnlPrincipal.__obj.mapView.onPause();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (frm_Principal_pnlPrincipal.__obj.mapView != null)
            frm_Principal_pnlPrincipal.__obj.mapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (frm_Principal_pnlPrincipal.__obj.mapView != null)
            frm_Principal_pnlPrincipal.__obj.mapView.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (frm_Principal_pnlPrincipal.__obj.mapView != null)
            frm_Principal_pnlPrincipal.__obj.mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        if (frm_Principal_pnlPrincipal.__obj.mapView != null)
            frm_Principal_pnlPrincipal.__obj.mapView.onLowMemory();
    }
}
