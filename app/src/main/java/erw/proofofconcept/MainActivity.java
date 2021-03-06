package erw.proofofconcept;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WpsInfo;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    /**
     * Instance variables
     */
    public static final String TAG = "wifidirectdemo";
    public static final String EXTRA_MESSAGE = "Message";
//    WifiBroadcastReceiver receiver;
//
//    //connection variables
//    private final IntentFilter intentFilter = new IntentFilter();
//    WifiP2pManager.Channel mChannel;
//    WifiP2pManager mManager;
//




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//        /**
//         * Set up connection:
//         * uses IntentFilte to listen for changes in the WifiP2P state
//         */
//        // Indicates a change in the Wi-Fi P2P status.
//        intentFilter.addAction(WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION);
//
//        // Indicates a change in the list of available peers.
//        intentFilter.addAction(WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION);
//
//        // Indicates the state of Wi-Fi P2P connectivity has changed.
//        intentFilter.addAction(WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION);
//
//        // Indicates this device's details have changed.
//        intentFilter.addAction(WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION);
//
//        mManager = (WifiP2pManager) getSystemService(Context.WIFI_P2P_SERVICE);
//        mChannel = mManager.initialize(this, getMainLooper(), null);
//
//        mManager.discoverPeers(mChannel, new WifiP2pManager.ActionListener() {
//
//            @Override
//            public void onSuccess() {
//                // Code for when the discovery initiation is successful goes here.
//                // No services have actually been discovered yet, so this method
//                // can often be left blank.  Code for peer discovery goes in the
//                // onReceive method, detailed below.
//            }
//
//            @Override
//            public void onFailure(int reasonCode) {
//                // Code for when the discovery initiation fails goes here.
//                // Alert the user that something went wrong.
//            }
//        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
//
//    public void sendMessage(View view)
//    {
//        Intent intent = new Intent(this, DisplayMesageActivity.class);
//        EditText editText = (EditText) findViewById(R.id.editText);
//        String message = editText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
//        startActivity(intent);
//    }
//
//    public void setIsWifiP2pEnabled(boolean flag)
//    {
//        int four = 2+2;
//
//        if(!flag) {
//            System.out.println("WIFI P2P IS NOT ENABLED!\nWho knows what that implies though!!!");
//        }
//    }
//
//    /** register the BroadcastReceiver with the intent values to be matched */
//    @Override
//    public void onResume() {
//        super.onResume();
//        receiver = new WifiBroadcastReceiver(mManager, mChannel, this);
//        registerReceiver(receiver, intentFilter);
//    }
//
//    @Override
//    public void onPause() {
//        super.onPause();
//        unregisterReceiver(receiver);
//    }
//
//
//    @Override
//    public void onPeersAvailable(WifiP2pDeviceList peers) {
//
//    }

//    @Override
//    public void connect() {
//        // Picking the first device found on the network.
//        WifiP2pDevice device = (WifiP2pDevice) receiver.getPeers().get(0);
//
//        WifiP2pConfig config = new WifiP2pConfig();
//        config.deviceAddress = device.deviceAddress;
//        config.wps.setup = WpsInfo.PBC;
//
//        mManager.connect(mChannel, config, new WifiP2pManager.ActionListener() {
//
//            @Override
//            public void onSuccess() {
//                // WiFiDirectBroadcastReceiver notifies us. Ignore for now.
//            }
//
//            @Override
//            public void onFailure(int reason) {
//                Toast.makeText(MainActivity.this, "Connect failed. Retry.",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
//    }



}

