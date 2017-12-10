package erw.proofofconcept;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Evan Wang on 12/8/2017.
 */

public class WifiBroadcastReceiver{

//    MainActivity main;
//    WifiP2pManager manager;
//    WifiP2pManager.Channel channel;
//    WifiP2pManager.ConnectionInfoListener connectionListener;
//    public List getPeers() {
//        return peers;
//    }
//
//    public void setPeers(List peers) {
//        this.peers = peers;
//    }
//
//    private List peers = new ArrayList();
//
//
//    private WifiP2pManager.PeerListListener peerListListener = new WifiP2pManager.PeerListListener() {
//        @Override
//        public void onPeersAvailable(WifiP2pDeviceList peerList) {
//
//            // Out with the old, in with the new.
//            peers.clear();
//            peers.addAll(peerList.getDeviceList());
//            System.out.println(peers);
//
//            // If an AdapterView is backed by this data, notify it
//            // of the change.  For instance, if you have a ListView of available
//            // peers, trigger an update.
////            ((WiFiPeerListAdapter) getListAdapter()).notifyDataSetChanged();
////            if (peers.size() == 0) {
////                Log.d(WiFiDirectActivity.TAG, "No devices found");
////                return;
////            }
//        }
//    };
//
//    public WifiBroadcastReceiver(WifiP2pManager manager, WifiP2pManager.Channel channel,MainActivity main)
//    {
//        this.main = main;
//        this.manager = manager;
//        this.channel=channel;
//        connectionListener = new WifiP2pManager.ConnectionInfoListener() {
//            @Override
//            public void onConnectionInfoAvailable(WifiP2pInfo info) {
//
//            }
//        };
//    }
//
//    @Override
//    public void onReceive(Context context, Intent intent) {
//        String action = intent.getAction();
//        if (WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION.equals(action)) {
//            // Determine if Wifi Direct mode is enabled or not, alert
//            // the Activity.
//            int state = intent.getIntExtra(WifiP2pManager.EXTRA_WIFI_STATE, -1);
//            if (state == WifiP2pManager.WIFI_P2P_STATE_ENABLED) {
//                main.setIsWifiP2pEnabled(true);
//            } else {
//                main.setIsWifiP2pEnabled(false);
//            }
//        } else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)) {
//
//            // The peer list has changed!  We should probably do something about
//            // that.
//
//        } else if (WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION.equals(action)) {
//
//            if (manager == null) {
//                return;
//            }
//
//            NetworkInfo networkInfo = (NetworkInfo) intent
//                    .getParcelableExtra(WifiP2pManager.EXTRA_NETWORK_INFO);
//
//            if (networkInfo.isConnected()) {
//
//                // We are connected with the other device, request connection
//                // info to find group owner IP
//
//                manager.requestConnectionInfo(channel, connectionListener);
//            }
//
//        } else if (WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION.equals(action)) {
////            DeviceListFragment fragment = (DeviceListFragment) activity.getFragmentManager()
////                    .findFragmentById(R.id.frag_list);
////            fragment.updateThisDevice((WifiP2pDevice) intent.getParcelableExtra(
////                    WifiP2pManager.EXTRA_WIFI_P2P_DEVICE));
//
//        }
//        else if (WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION.equals(action)) {
//
//            // Request available peers from the wifi p2p manager. This is an
//            // asynchronous call and the calling activity is notified with a
//            // callback on PeerListListener.onPeersAvailable()
//            if (manager != null) {
//                manager.requestPeers(channel, peerListListener);
//            }
//            Log.d(MainActivity.TAG, "P2P peers changed");
//        }
//    }


}
