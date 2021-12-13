package com.splunk.android.sample;

import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.trace.data.SpanData;
import io.opentelemetry.sdk.trace.export.SpanExporter;

public class StardustExporter implements SpanExporter {

    @Override
    public CompletableResultCode export(Collection<SpanData> spans) {
        List<byte[]> encodedSpans = new ArrayList<>(spans.size());
        for (SpanData spanData : spans) {
            //TODO: format data to olof context
            Log.e("Stardust",spanData.toString());
        }

        final CompletableResultCode result = new CompletableResultCode();
        //TODO: send this in olof
        result.succeed();
        return result;
    }

    @Override
    public CompletableResultCode flush() {
        return null;
    }

    @Override
    public CompletableResultCode shutdown() {
        return null;
    }

    @Override
    public void close() {

    }
}
