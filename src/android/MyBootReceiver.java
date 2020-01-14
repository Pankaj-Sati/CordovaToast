import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyBootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) 
    {
        // assumes WordService is a registered service
        Log.d('MyBootReceiver','Inside onReceive()');
        Intent intent = new Intent(context, WordService.class);
        context.startService(intent);
    }
}