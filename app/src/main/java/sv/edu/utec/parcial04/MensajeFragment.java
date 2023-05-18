package sv.edu.utec.parcial04;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;




public class MensajeFragment extends Fragment {

    EditText txtNomProv,txtTelProv,txtCorrProv;
    TextView tvMensajes;
    Button btnGuardar;
    Context context;
    public MensajeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatActivity appCompatActivity =new AppCompatActivity();



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflater.inflate(R.layout.fragment_mensaje, container, false);

        View view=inflater.inflate(R.layout.fragment_mensaje, container, false);
        txtNomProv=view.findViewById(R.id.edtNOMPROV);
        txtTelProv=view.findViewById(R.id.edtTELPROV);
        txtCorrProv=view.findViewById(R.id.edtCORPROV);
        btnGuardar=view.findViewById(R.id.btnGuardar);
        tvMensajes=view.findViewById(R.id.tvMensaje);


        txtNomProv.setText("Prueba");
        // Inflate the layout for this fragment
        return view;
    }
}