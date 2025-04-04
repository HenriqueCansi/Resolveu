package obj.resolveu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import obj.resolveu.R;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback
{

	private MapView mapView;
	private GoogleMap googleMap;
	private EditText etSearch;
	private ImageView ivNotification, ivMap, ivAdd, ivProfile;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// Inicializando componentes
		etSearch = findViewById(R.id.etSearch);
		ivNotification = findViewById(R.id.ivNotification);
		ivMap = findViewById(R.id.ivMap);
		ivAdd = findViewById(R.id.ivAdd);
		ivProfile = findViewById(R.id.ivProfile);
		mapView = findViewById(R.id.mapView);

		// Inicializando o MapView
		mapView.onCreate(savedInstanceState);
		mapView.getMapAsync(this);

		// Alternar entre "Em discussão" e "Solucionados"
		RadioGroup rgStatus = findViewById(R.id.rgStatus);
		rgStatus.setOnCheckedChangeListener((group, checkedId) -> {
			if (checkedId == R.id.rbEmDiscussao)
			{
				// Atualizar mapa para mostrar "Em discussão"
			}
			else
			{
				// Atualizar mapa para mostrar "Solucionados"
			}
		});

		// Ações de clique nos ícones
		ivNotification.setOnClickListener(v -> {
			// Abrir tela de notificações
		});

		ivMap.setOnClickListener(v -> {
			// Atualizar para visualizar mapa
		});

		ivAdd.setOnClickListener(v -> {
			// Abrir tela para adicionar novo marcador
		});

		ivProfile.setOnClickListener(v -> {
			// Abrir tela de perfil do usuário
		});
	}

	@Override
	public void onMapReady(GoogleMap map)
	{
		googleMap = map;
		// Configurações adicionais do mapa (ex: zoom, marcadores, etc.)
	}

	// Métodos do ciclo de vida do MapView
	@Override
	protected void onResume()
	{
		super.onResume();
		mapView.onResume();
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		mapView.onPause();
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		mapView.onDestroy();
	}

	@Override
	public void onLowMemory()
	{
		super.onLowMemory();
		mapView.onLowMemory();
	}
}