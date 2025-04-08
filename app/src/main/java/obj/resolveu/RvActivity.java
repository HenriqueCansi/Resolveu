package obj.resolveu;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.ArrayList;

import obj.resolveu.frm_Login.Panel.frm_Login_pnlLogin;
import obj.resolveu.frm_Principal.Panel.frm_Principal_pnlPrincipal;
import com.google.firebase.FirebaseApp;

public class RvActivity extends Activity
{
	public static RvActivity __activity;
	public static ArrayList<RvView> __views = new ArrayList<>();
	private static ProgressDialog progressDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		FirebaseApp.initializeApp(this);
		__activity = this;
		frm_Login_pnlLogin.__obj.Show();
	}

	public static LinearLayout criaTela(RvView view)
	{
		return view.getLayout();
	}

	public static void mostrarCarregando(String mensagem)
	{
		if (progressDialog == null)
		{
			progressDialog = new ProgressDialog(__activity);
			progressDialog.setCancelable(false);
		}
		progressDialog.setMessage(mensagem);
		progressDialog.show();
	}

	public static void esconderCarregando()
	{
		if (progressDialog != null && progressDialog.isShowing())
		{
			progressDialog.dismiss();
		}
	}

	@Override
	protected void onResume()
	{
		super.onResume();

		if (frm_Principal_pnlPrincipal.__obj.mapView != null)
			frm_Principal_pnlPrincipal.__obj.mapView.onResume();
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		if (frm_Principal_pnlPrincipal.__obj.mapView != null)
			frm_Principal_pnlPrincipal.__obj.mapView.onPause();
	}

	@Override
	protected void onStart()
	{
		super.onStart();
		if (frm_Principal_pnlPrincipal.__obj.mapView != null)
			frm_Principal_pnlPrincipal.__obj.mapView.onStart();
	}

	@Override
	protected void onStop()
	{
		super.onStop();
		if (frm_Principal_pnlPrincipal.__obj.mapView != null)
			frm_Principal_pnlPrincipal.__obj.mapView.onStop();
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		if (frm_Principal_pnlPrincipal.__obj.mapView != null)
			frm_Principal_pnlPrincipal.__obj.mapView.onDestroy();
	}

	@Override
	public void onLowMemory()
	{
		super.onLowMemory();
		if (frm_Principal_pnlPrincipal.__obj.mapView != null)
			frm_Principal_pnlPrincipal.__obj.mapView.onLowMemory();
	}
}
