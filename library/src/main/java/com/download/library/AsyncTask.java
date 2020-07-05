package com.download.library;

import android.os.Looper;

import com.download.library.queue.Dispatch;

/**
 * @author cenxiaozhong
 * @date 2020/7/5
 * @since 1.0.0
 */
public class AsyncTask {


    private static final Dispatch MAIN_QUEUE = new Dispatch(Looper.getMainLooper());

    protected void publishProgress(final Integer... values) {
        MAIN_QUEUE.postRunnableQuick(new Runnable() {
            @Override
            public void run() {
                onProgressUpdate(values);
            }
        });
    }


    protected void onProgressUpdate(Integer... values) {

    }

}
