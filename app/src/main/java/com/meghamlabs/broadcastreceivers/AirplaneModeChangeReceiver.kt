package com.meghamlabs.broadcastreceivers

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangeReceiver : BroadcastReceiver(){

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirplaneModeEnabled = intent?.getBooleanExtra("state",false)
        if(isAirplaneModeEnabled == true){
            Toast.makeText(context,"airplane mode enabled",Toast.LENGTH_LONG).show()
        }
        else
        {
            Toast.makeText(context,"airplane mode disabled",Toast.LENGTH_LONG).show()
        }
    }
}